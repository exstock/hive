/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.hadoop.hive.ql.parse.repl.load;

import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.hive.common.repl.ReplScope;
import org.apache.hadoop.hive.conf.HiveConf;
import org.apache.hadoop.hive.ql.exec.Utilities;
import org.apache.hadoop.hive.ql.parse.SemanticException;
import org.apache.hadoop.hive.ql.parse.repl.dump.Utils;
import org.apache.hadoop.hive.ql.parse.repl.DumpType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DumpMetaData {
  // wrapper class for reading and writing metadata about a dump
  // responsible for _dumpmetadata files
  private static final String DUMP_METADATA = "_dumpmetadata";
  private static final Logger LOG = LoggerFactory.getLogger(DumpMetaData.class);

  private DumpType dumpType;
  private Long eventFrom = null;
  private Long eventTo = null;
  private Path cmRoot;
  private String payload = null;
  private ReplScope replScope = null;

  private boolean initialized = false;
  private final Path dumpFile;
  private final HiveConf hiveConf;

  public DumpMetaData(Path dumpRoot, HiveConf hiveConf) {
    this.hiveConf = hiveConf;
    dumpFile = new Path(dumpRoot, DUMP_METADATA);
  }

  public DumpMetaData(Path dumpRoot, DumpType lvl, Long eventFrom, Long eventTo, Path cmRoot,
      HiveConf hiveConf) {
    this(dumpRoot, hiveConf);
    setDump(lvl, eventFrom, eventTo, cmRoot);
  }

  public void setDump(DumpType lvl, Long eventFrom, Long eventTo, Path cmRoot) {
    this.dumpType = lvl;
    this.eventFrom = eventFrom;
    this.eventTo = eventTo;
    this.cmRoot = cmRoot;
    this.initialized = true;
  }

  public void setPayload(String payload) {
    this.payload = payload;
  }

  public void setReplScope(ReplScope replScope) {
    this.replScope = replScope;
  }

  private void readReplScope(String line) throws IOException {
    if (line == null) {
      return;
    }

    String[] lineContents = line.split("\t");
    if (lineContents.length < 1) {
      return;
    }

    replScope = new ReplScope();

    LOG.info("Read ReplScope: Set Db Name: {}.", lineContents[0]);
    replScope.setDbName(lineContents[0]);

    // Read/set include and exclude tables list.
    int idx = readReplScopeTablesList(lineContents, 1, true);
    readReplScopeTablesList(lineContents, idx, false);
  }

  private int readReplScopeTablesList(String[] lineContents, int startIdx, boolean includeList)
          throws IOException {
    // If the list doesn't exist, then return.
    if (startIdx >= lineContents.length) {
      return startIdx;
    }

    // Each tables list should start with "{" and ends with "}"
    if (!"{".equals(lineContents[startIdx])) {
      throw new IOException("Invalid repl tables list data in dump metadata file. Missing \"{\".");
    }

    List<String>tableNames = new ArrayList<>();
    for (int i = (startIdx + 1); i < lineContents.length; i++) {
      String value = lineContents[i];
      if ("}".equals(value)) {
        if (includeList) {
          LOG.info("Read ReplScope: Set Include Table Names: {}.", tableNames);
          replScope.setIncludedTablePatterns(tableNames);
        } else {
          LOG.info("Read ReplScope: Set Exclude Table Names: {}.", tableNames);
          replScope.setExcludedTablePatterns(tableNames);
        }
        return (i + 1);
      }
      tableNames.add(value);
    }
    throw new IOException("Invalid repl tables list data in dump metadata file. Missing \"}\".");
  }

  private void loadDumpFromFile() throws SemanticException {
    BufferedReader br = null;
    try {
      // read from dumpfile and instantiate self
      FileSystem fs = dumpFile.getFileSystem(hiveConf);
      br = new BufferedReader(new InputStreamReader(fs.open(dumpFile)));
      String line;
      if ((line = br.readLine()) != null) {
        String[] lineContents = line.split("\t", 5);
        setDump(DumpType.valueOf(lineContents[0]), Long.valueOf(lineContents[1]),
            Long.valueOf(lineContents[2]),
            new Path(lineContents[3]));
        setPayload(lineContents[4].equals(Utilities.nullStringOutput) ? null : lineContents[4]);
      } else {
        throw new IOException(
            "Unable to read valid values from dumpFile:" + dumpFile.toUri().toString());
      }
      readReplScope(br.readLine());
    } catch (IOException ioe) {
      throw new SemanticException(ioe);
    } finally {
      if (br != null) {
        try {
          br.close();
        } catch (IOException e) {
          throw new SemanticException(e);
        }
      }
    }
  }

  public DumpType getDumpType() throws SemanticException {
    initializeIfNot();
    return this.dumpType;
  }

  public String getPayload() throws SemanticException {
    initializeIfNot();
    return this.payload;
  }

  public Long getEventFrom() throws SemanticException {
    initializeIfNot();
    return eventFrom;
  }

  public Long getEventTo() throws SemanticException {
    initializeIfNot();
    return eventTo;
  }

  public ReplScope getReplScope() throws SemanticException {
    initializeIfNot();
    return replScope;
  }
  public Path getDumpFilePath() {
    return dumpFile;
  }

  public boolean isIncrementalDump() throws SemanticException {
    initializeIfNot();
    return (this.dumpType == DumpType.INCREMENTAL);
  }

  private void initializeIfNot() throws SemanticException {
    if (!initialized) {
      loadDumpFromFile();
    }
  }

  private List<String> prepareReplScopeValues() {
    assert(replScope != null);

    List<String> values = new ArrayList<>();
    values.add(replScope.getDbName());

    List<String> includedTableNames = replScope.getIncludedTableNames();
    List<String> excludedTableNames = replScope.getExcludedTableNames();
    if (includedTableNames != null) {
      values.add("{");
      values.addAll(includedTableNames);
      values.add("}");
    }
    if (excludedTableNames != null) {
      values.add("{");
      values.addAll(excludedTableNames);
      values.add("}");
    }
    LOG.info("Preparing ReplScope {} to dump.", values);
    return values;
  }

  public void write() throws SemanticException {
    List<List<String>> listValues = new ArrayList<>();
    listValues.add(
        Arrays.asList(
            dumpType.toString(),
            eventFrom.toString(),
            eventTo.toString(),
            cmRoot.toString(),
            payload)
    );
    if (replScope != null) {
      listValues.add(prepareReplScopeValues());
    }
    Utils.writeOutput(listValues, dumpFile, hiveConf
    );
  }
}
