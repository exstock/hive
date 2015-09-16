package org.apache.hadoop.hive.serde2.avro;

import static org.junit.Assert.assertNull;

import java.util.ArrayList;
import java.util.List;

import org.apache.hadoop.hive.serde2.lazy.ByteArrayRef;
import org.apache.hadoop.hive.serde2.lazy.LazyStruct;
import org.apache.hadoop.hive.serde2.lazy.objectinspector.LazyObjectInspectorFactory;
import org.apache.hadoop.hive.serde2.lazy.objectinspector.primitive.LazyPrimitiveObjectInspectorFactory;
import org.apache.hadoop.hive.serde2.objectinspector.ObjectInspector;
import org.apache.hadoop.hive.serde2.objectinspector.StructField;
import org.apache.hadoop.io.Text;
import org.junit.Test;

public class TestAvroLazyObjectInspector {

	@Test
	public void testEmptyData(){
		List<String> fieldNames = new ArrayList<String>();
		fieldNames.add("myField");

		List<ObjectInspector> ois = new ArrayList<ObjectInspector>();
		ois.add(LazyPrimitiveObjectInspectorFactory.getLazyStringObjectInspector(false, new Byte((byte) 0)));

		AvroLazyObjectInspector aloi = new AvroLazyObjectInspector(fieldNames, ois, null, (byte)0, new Text(), false, false, (byte)0);
		LazyStruct lazyStruct = new LazyStruct(LazyObjectInspectorFactory.getLazySimpleStructObjectInspector(fieldNames, ois, (byte)0, new Text(), false, false, (byte)0));

		ByteArrayRef byteArrayRef = new ByteArrayRef();
		byteArrayRef.setData(new byte[0]); // set data to empty explicitly
		lazyStruct.init(byteArrayRef, 0, 0);

		assertNull(aloi.getStructFieldData(lazyStruct, new TestStructField()));
	}

	class TestStructField implements StructField {

		@Override
		public String getFieldName() {
			return "testfield";
		}

		@Override
		public ObjectInspector getFieldObjectInspector() {
			return LazyPrimitiveObjectInspectorFactory.getLazyStringObjectInspector(false, new Byte((byte) 0));
		}

		@Override
		public int getFieldID() {
			return 0;
		}

		@Override
		public String getFieldComment() {
			return null;
    }
	}
}
