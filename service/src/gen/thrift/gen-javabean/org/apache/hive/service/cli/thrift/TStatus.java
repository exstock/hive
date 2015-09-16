/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hive.service.cli.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-8-3")
public class TStatus implements org.apache.thrift.TBase<TStatus, TStatus._Fields>, java.io.Serializable, Cloneable, Comparable<TStatus> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TStatus");

  private static final org.apache.thrift.protocol.TField STATUS_CODE_FIELD_DESC = new org.apache.thrift.protocol.TField("statusCode", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField INFO_MESSAGES_FIELD_DESC = new org.apache.thrift.protocol.TField("infoMessages", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField SQL_STATE_FIELD_DESC = new org.apache.thrift.protocol.TField("sqlState", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField ERROR_CODE_FIELD_DESC = new org.apache.thrift.protocol.TField("errorCode", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField ERROR_MESSAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("errorMessage", org.apache.thrift.protocol.TType.STRING, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TStatusStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TStatusTupleSchemeFactory());
  }

  private TStatusCode statusCode; // required
  private List<String> infoMessages; // optional
  private String sqlState; // optional
  private int errorCode; // optional
  private String errorMessage; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see TStatusCode
     */
    STATUS_CODE((short)1, "statusCode"),
    INFO_MESSAGES((short)2, "infoMessages"),
    SQL_STATE((short)3, "sqlState"),
    ERROR_CODE((short)4, "errorCode"),
    ERROR_MESSAGE((short)5, "errorMessage");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // STATUS_CODE
          return STATUS_CODE;
        case 2: // INFO_MESSAGES
          return INFO_MESSAGES;
        case 3: // SQL_STATE
          return SQL_STATE;
        case 4: // ERROR_CODE
          return ERROR_CODE;
        case 5: // ERROR_MESSAGE
          return ERROR_MESSAGE;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __ERRORCODE_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.INFO_MESSAGES,_Fields.SQL_STATE,_Fields.ERROR_CODE,_Fields.ERROR_MESSAGE};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.STATUS_CODE, new org.apache.thrift.meta_data.FieldMetaData("statusCode", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TStatusCode.class)));
    tmpMap.put(_Fields.INFO_MESSAGES, new org.apache.thrift.meta_data.FieldMetaData("infoMessages", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.SQL_STATE, new org.apache.thrift.meta_data.FieldMetaData("sqlState", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ERROR_CODE, new org.apache.thrift.meta_data.FieldMetaData("errorCode", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.ERROR_MESSAGE, new org.apache.thrift.meta_data.FieldMetaData("errorMessage", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TStatus.class, metaDataMap);
  }

  public TStatus() {
  }

  public TStatus(
    TStatusCode statusCode)
  {
    this();
    this.statusCode = statusCode;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TStatus(TStatus other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetStatusCode()) {
      this.statusCode = other.statusCode;
    }
    if (other.isSetInfoMessages()) {
      List<String> __this__infoMessages = new ArrayList<String>(other.infoMessages);
      this.infoMessages = __this__infoMessages;
    }
    if (other.isSetSqlState()) {
      this.sqlState = other.sqlState;
    }
    this.errorCode = other.errorCode;
    if (other.isSetErrorMessage()) {
      this.errorMessage = other.errorMessage;
    }
  }

  public TStatus deepCopy() {
    return new TStatus(this);
  }

  @Override
  public void clear() {
    this.statusCode = null;
    this.infoMessages = null;
    this.sqlState = null;
    setErrorCodeIsSet(false);
    this.errorCode = 0;
    this.errorMessage = null;
  }

  /**
   * 
   * @see TStatusCode
   */
  public TStatusCode getStatusCode() {
    return this.statusCode;
  }

  /**
   * 
   * @see TStatusCode
   */
  public void setStatusCode(TStatusCode statusCode) {
    this.statusCode = statusCode;
  }

  public void unsetStatusCode() {
    this.statusCode = null;
  }

  /** Returns true if field statusCode is set (has been assigned a value) and false otherwise */
  public boolean isSetStatusCode() {
    return this.statusCode != null;
  }

  public void setStatusCodeIsSet(boolean value) {
    if (!value) {
      this.statusCode = null;
    }
  }

  public int getInfoMessagesSize() {
    return (this.infoMessages == null) ? 0 : this.infoMessages.size();
  }

  public java.util.Iterator<String> getInfoMessagesIterator() {
    return (this.infoMessages == null) ? null : this.infoMessages.iterator();
  }

  public void addToInfoMessages(String elem) {
    if (this.infoMessages == null) {
      this.infoMessages = new ArrayList<String>();
    }
    this.infoMessages.add(elem);
  }

  public List<String> getInfoMessages() {
    return this.infoMessages;
  }

  public void setInfoMessages(List<String> infoMessages) {
    this.infoMessages = infoMessages;
  }

  public void unsetInfoMessages() {
    this.infoMessages = null;
  }

  /** Returns true if field infoMessages is set (has been assigned a value) and false otherwise */
  public boolean isSetInfoMessages() {
    return this.infoMessages != null;
  }

  public void setInfoMessagesIsSet(boolean value) {
    if (!value) {
      this.infoMessages = null;
    }
  }

  public String getSqlState() {
    return this.sqlState;
  }

  public void setSqlState(String sqlState) {
    this.sqlState = sqlState;
  }

  public void unsetSqlState() {
    this.sqlState = null;
  }

  /** Returns true if field sqlState is set (has been assigned a value) and false otherwise */
  public boolean isSetSqlState() {
    return this.sqlState != null;
  }

  public void setSqlStateIsSet(boolean value) {
    if (!value) {
      this.sqlState = null;
    }
  }

  public int getErrorCode() {
    return this.errorCode;
  }

  public void setErrorCode(int errorCode) {
    this.errorCode = errorCode;
    setErrorCodeIsSet(true);
  }

  public void unsetErrorCode() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ERRORCODE_ISSET_ID);
  }

  /** Returns true if field errorCode is set (has been assigned a value) and false otherwise */
  public boolean isSetErrorCode() {
    return EncodingUtils.testBit(__isset_bitfield, __ERRORCODE_ISSET_ID);
  }

  public void setErrorCodeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ERRORCODE_ISSET_ID, value);
  }

  public String getErrorMessage() {
    return this.errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  public void unsetErrorMessage() {
    this.errorMessage = null;
  }

  /** Returns true if field errorMessage is set (has been assigned a value) and false otherwise */
  public boolean isSetErrorMessage() {
    return this.errorMessage != null;
  }

  public void setErrorMessageIsSet(boolean value) {
    if (!value) {
      this.errorMessage = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case STATUS_CODE:
      if (value == null) {
        unsetStatusCode();
      } else {
        setStatusCode((TStatusCode)value);
      }
      break;

    case INFO_MESSAGES:
      if (value == null) {
        unsetInfoMessages();
      } else {
        setInfoMessages((List<String>)value);
      }
      break;

    case SQL_STATE:
      if (value == null) {
        unsetSqlState();
      } else {
        setSqlState((String)value);
      }
      break;

    case ERROR_CODE:
      if (value == null) {
        unsetErrorCode();
      } else {
        setErrorCode((Integer)value);
      }
      break;

    case ERROR_MESSAGE:
      if (value == null) {
        unsetErrorMessage();
      } else {
        setErrorMessage((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case STATUS_CODE:
      return getStatusCode();

    case INFO_MESSAGES:
      return getInfoMessages();

    case SQL_STATE:
      return getSqlState();

    case ERROR_CODE:
      return Integer.valueOf(getErrorCode());

    case ERROR_MESSAGE:
      return getErrorMessage();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case STATUS_CODE:
      return isSetStatusCode();
    case INFO_MESSAGES:
      return isSetInfoMessages();
    case SQL_STATE:
      return isSetSqlState();
    case ERROR_CODE:
      return isSetErrorCode();
    case ERROR_MESSAGE:
      return isSetErrorMessage();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TStatus)
      return this.equals((TStatus)that);
    return false;
  }

  public boolean equals(TStatus that) {
    if (that == null)
      return false;

    boolean this_present_statusCode = true && this.isSetStatusCode();
    boolean that_present_statusCode = true && that.isSetStatusCode();
    if (this_present_statusCode || that_present_statusCode) {
      if (!(this_present_statusCode && that_present_statusCode))
        return false;
      if (!this.statusCode.equals(that.statusCode))
        return false;
    }

    boolean this_present_infoMessages = true && this.isSetInfoMessages();
    boolean that_present_infoMessages = true && that.isSetInfoMessages();
    if (this_present_infoMessages || that_present_infoMessages) {
      if (!(this_present_infoMessages && that_present_infoMessages))
        return false;
      if (!this.infoMessages.equals(that.infoMessages))
        return false;
    }

    boolean this_present_sqlState = true && this.isSetSqlState();
    boolean that_present_sqlState = true && that.isSetSqlState();
    if (this_present_sqlState || that_present_sqlState) {
      if (!(this_present_sqlState && that_present_sqlState))
        return false;
      if (!this.sqlState.equals(that.sqlState))
        return false;
    }

    boolean this_present_errorCode = true && this.isSetErrorCode();
    boolean that_present_errorCode = true && that.isSetErrorCode();
    if (this_present_errorCode || that_present_errorCode) {
      if (!(this_present_errorCode && that_present_errorCode))
        return false;
      if (this.errorCode != that.errorCode)
        return false;
    }

    boolean this_present_errorMessage = true && this.isSetErrorMessage();
    boolean that_present_errorMessage = true && that.isSetErrorMessage();
    if (this_present_errorMessage || that_present_errorMessage) {
      if (!(this_present_errorMessage && that_present_errorMessage))
        return false;
      if (!this.errorMessage.equals(that.errorMessage))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_statusCode = true && (isSetStatusCode());
    list.add(present_statusCode);
    if (present_statusCode)
      list.add(statusCode.getValue());

    boolean present_infoMessages = true && (isSetInfoMessages());
    list.add(present_infoMessages);
    if (present_infoMessages)
      list.add(infoMessages);

    boolean present_sqlState = true && (isSetSqlState());
    list.add(present_sqlState);
    if (present_sqlState)
      list.add(sqlState);

    boolean present_errorCode = true && (isSetErrorCode());
    list.add(present_errorCode);
    if (present_errorCode)
      list.add(errorCode);

    boolean present_errorMessage = true && (isSetErrorMessage());
    list.add(present_errorMessage);
    if (present_errorMessage)
      list.add(errorMessage);

    return list.hashCode();
  }

  @Override
  public int compareTo(TStatus other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetStatusCode()).compareTo(other.isSetStatusCode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStatusCode()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.statusCode, other.statusCode);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetInfoMessages()).compareTo(other.isSetInfoMessages());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetInfoMessages()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.infoMessages, other.infoMessages);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSqlState()).compareTo(other.isSetSqlState());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSqlState()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sqlState, other.sqlState);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetErrorCode()).compareTo(other.isSetErrorCode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetErrorCode()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.errorCode, other.errorCode);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetErrorMessage()).compareTo(other.isSetErrorMessage());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetErrorMessage()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.errorMessage, other.errorMessage);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("TStatus(");
    boolean first = true;

    sb.append("statusCode:");
    if (this.statusCode == null) {
      sb.append("null");
    } else {
      sb.append(this.statusCode);
    }
    first = false;
    if (isSetInfoMessages()) {
      if (!first) sb.append(", ");
      sb.append("infoMessages:");
      if (this.infoMessages == null) {
        sb.append("null");
      } else {
        sb.append(this.infoMessages);
      }
      first = false;
    }
    if (isSetSqlState()) {
      if (!first) sb.append(", ");
      sb.append("sqlState:");
      if (this.sqlState == null) {
        sb.append("null");
      } else {
        sb.append(this.sqlState);
      }
      first = false;
    }
    if (isSetErrorCode()) {
      if (!first) sb.append(", ");
      sb.append("errorCode:");
      sb.append(this.errorCode);
      first = false;
    }
    if (isSetErrorMessage()) {
      if (!first) sb.append(", ");
      sb.append("errorMessage:");
      if (this.errorMessage == null) {
        sb.append("null");
      } else {
        sb.append(this.errorMessage);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetStatusCode()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'statusCode' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TStatusStandardSchemeFactory implements SchemeFactory {
    public TStatusStandardScheme getScheme() {
      return new TStatusStandardScheme();
    }
  }

  private static class TStatusStandardScheme extends StandardScheme<TStatus> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TStatus struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // STATUS_CODE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.statusCode = org.apache.hive.service.cli.thrift.TStatusCode.findByValue(iprot.readI32());
              struct.setStatusCodeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // INFO_MESSAGES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list134 = iprot.readListBegin();
                struct.infoMessages = new ArrayList<String>(_list134.size);
                String _elem135;
                for (int _i136 = 0; _i136 < _list134.size; ++_i136)
                {
                  _elem135 = iprot.readString();
                  struct.infoMessages.add(_elem135);
                }
                iprot.readListEnd();
              }
              struct.setInfoMessagesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // SQL_STATE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.sqlState = iprot.readString();
              struct.setSqlStateIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // ERROR_CODE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.errorCode = iprot.readI32();
              struct.setErrorCodeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // ERROR_MESSAGE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.errorMessage = iprot.readString();
              struct.setErrorMessageIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TStatus struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.statusCode != null) {
        oprot.writeFieldBegin(STATUS_CODE_FIELD_DESC);
        oprot.writeI32(struct.statusCode.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.infoMessages != null) {
        if (struct.isSetInfoMessages()) {
          oprot.writeFieldBegin(INFO_MESSAGES_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.infoMessages.size()));
            for (String _iter137 : struct.infoMessages)
            {
              oprot.writeString(_iter137);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.sqlState != null) {
        if (struct.isSetSqlState()) {
          oprot.writeFieldBegin(SQL_STATE_FIELD_DESC);
          oprot.writeString(struct.sqlState);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetErrorCode()) {
        oprot.writeFieldBegin(ERROR_CODE_FIELD_DESC);
        oprot.writeI32(struct.errorCode);
        oprot.writeFieldEnd();
      }
      if (struct.errorMessage != null) {
        if (struct.isSetErrorMessage()) {
          oprot.writeFieldBegin(ERROR_MESSAGE_FIELD_DESC);
          oprot.writeString(struct.errorMessage);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TStatusTupleSchemeFactory implements SchemeFactory {
    public TStatusTupleScheme getScheme() {
      return new TStatusTupleScheme();
    }
  }

  private static class TStatusTupleScheme extends TupleScheme<TStatus> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TStatus struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI32(struct.statusCode.getValue());
      BitSet optionals = new BitSet();
      if (struct.isSetInfoMessages()) {
        optionals.set(0);
      }
      if (struct.isSetSqlState()) {
        optionals.set(1);
      }
      if (struct.isSetErrorCode()) {
        optionals.set(2);
      }
      if (struct.isSetErrorMessage()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetInfoMessages()) {
        {
          oprot.writeI32(struct.infoMessages.size());
          for (String _iter138 : struct.infoMessages)
          {
            oprot.writeString(_iter138);
          }
        }
      }
      if (struct.isSetSqlState()) {
        oprot.writeString(struct.sqlState);
      }
      if (struct.isSetErrorCode()) {
        oprot.writeI32(struct.errorCode);
      }
      if (struct.isSetErrorMessage()) {
        oprot.writeString(struct.errorMessage);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TStatus struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.statusCode = org.apache.hive.service.cli.thrift.TStatusCode.findByValue(iprot.readI32());
      struct.setStatusCodeIsSet(true);
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list139 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.infoMessages = new ArrayList<String>(_list139.size);
          String _elem140;
          for (int _i141 = 0; _i141 < _list139.size; ++_i141)
          {
            _elem140 = iprot.readString();
            struct.infoMessages.add(_elem140);
          }
        }
        struct.setInfoMessagesIsSet(true);
      }
      if (incoming.get(1)) {
        struct.sqlState = iprot.readString();
        struct.setSqlStateIsSet(true);
      }
      if (incoming.get(2)) {
        struct.errorCode = iprot.readI32();
        struct.setErrorCodeIsSet(true);
      }
      if (incoming.get(3)) {
        struct.errorMessage = iprot.readString();
        struct.setErrorMessageIsSet(true);
      }
    }
  }

}

