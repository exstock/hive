/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hive.metastore.api;

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
public class PrincipalPrivilegeSet implements org.apache.thrift.TBase<PrincipalPrivilegeSet, PrincipalPrivilegeSet._Fields>, java.io.Serializable, Cloneable, Comparable<PrincipalPrivilegeSet> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("PrincipalPrivilegeSet");

  private static final org.apache.thrift.protocol.TField USER_PRIVILEGES_FIELD_DESC = new org.apache.thrift.protocol.TField("userPrivileges", org.apache.thrift.protocol.TType.MAP, (short)1);
  private static final org.apache.thrift.protocol.TField GROUP_PRIVILEGES_FIELD_DESC = new org.apache.thrift.protocol.TField("groupPrivileges", org.apache.thrift.protocol.TType.MAP, (short)2);
  private static final org.apache.thrift.protocol.TField ROLE_PRIVILEGES_FIELD_DESC = new org.apache.thrift.protocol.TField("rolePrivileges", org.apache.thrift.protocol.TType.MAP, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new PrincipalPrivilegeSetStandardSchemeFactory());
    schemes.put(TupleScheme.class, new PrincipalPrivilegeSetTupleSchemeFactory());
  }

  private Map<String,List<PrivilegeGrantInfo>> userPrivileges; // required
  private Map<String,List<PrivilegeGrantInfo>> groupPrivileges; // required
  private Map<String,List<PrivilegeGrantInfo>> rolePrivileges; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    USER_PRIVILEGES((short)1, "userPrivileges"),
    GROUP_PRIVILEGES((short)2, "groupPrivileges"),
    ROLE_PRIVILEGES((short)3, "rolePrivileges");

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
        case 1: // USER_PRIVILEGES
          return USER_PRIVILEGES;
        case 2: // GROUP_PRIVILEGES
          return GROUP_PRIVILEGES;
        case 3: // ROLE_PRIVILEGES
          return ROLE_PRIVILEGES;
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
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.USER_PRIVILEGES, new org.apache.thrift.meta_data.FieldMetaData("userPrivileges", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
                new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, PrivilegeGrantInfo.class)))));
    tmpMap.put(_Fields.GROUP_PRIVILEGES, new org.apache.thrift.meta_data.FieldMetaData("groupPrivileges", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
                new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, PrivilegeGrantInfo.class)))));
    tmpMap.put(_Fields.ROLE_PRIVILEGES, new org.apache.thrift.meta_data.FieldMetaData("rolePrivileges", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
                new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, PrivilegeGrantInfo.class)))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(PrincipalPrivilegeSet.class, metaDataMap);
  }

  public PrincipalPrivilegeSet() {
  }

  public PrincipalPrivilegeSet(
    Map<String,List<PrivilegeGrantInfo>> userPrivileges,
    Map<String,List<PrivilegeGrantInfo>> groupPrivileges,
    Map<String,List<PrivilegeGrantInfo>> rolePrivileges)
  {
    this();
    this.userPrivileges = userPrivileges;
    this.groupPrivileges = groupPrivileges;
    this.rolePrivileges = rolePrivileges;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public PrincipalPrivilegeSet(PrincipalPrivilegeSet other) {
    if (other.isSetUserPrivileges()) {
      Map<String,List<PrivilegeGrantInfo>> __this__userPrivileges = new HashMap<String,List<PrivilegeGrantInfo>>(other.userPrivileges.size());
      for (Map.Entry<String, List<PrivilegeGrantInfo>> other_element : other.userPrivileges.entrySet()) {

        String other_element_key = other_element.getKey();
        List<PrivilegeGrantInfo> other_element_value = other_element.getValue();

        String __this__userPrivileges_copy_key = other_element_key;

        List<PrivilegeGrantInfo> __this__userPrivileges_copy_value = new ArrayList<PrivilegeGrantInfo>(other_element_value.size());
        for (PrivilegeGrantInfo other_element_value_element : other_element_value) {
          __this__userPrivileges_copy_value.add(new PrivilegeGrantInfo(other_element_value_element));
        }

        __this__userPrivileges.put(__this__userPrivileges_copy_key, __this__userPrivileges_copy_value);
      }
      this.userPrivileges = __this__userPrivileges;
    }
    if (other.isSetGroupPrivileges()) {
      Map<String,List<PrivilegeGrantInfo>> __this__groupPrivileges = new HashMap<String,List<PrivilegeGrantInfo>>(other.groupPrivileges.size());
      for (Map.Entry<String, List<PrivilegeGrantInfo>> other_element : other.groupPrivileges.entrySet()) {

        String other_element_key = other_element.getKey();
        List<PrivilegeGrantInfo> other_element_value = other_element.getValue();

        String __this__groupPrivileges_copy_key = other_element_key;

        List<PrivilegeGrantInfo> __this__groupPrivileges_copy_value = new ArrayList<PrivilegeGrantInfo>(other_element_value.size());
        for (PrivilegeGrantInfo other_element_value_element : other_element_value) {
          __this__groupPrivileges_copy_value.add(new PrivilegeGrantInfo(other_element_value_element));
        }

        __this__groupPrivileges.put(__this__groupPrivileges_copy_key, __this__groupPrivileges_copy_value);
      }
      this.groupPrivileges = __this__groupPrivileges;
    }
    if (other.isSetRolePrivileges()) {
      Map<String,List<PrivilegeGrantInfo>> __this__rolePrivileges = new HashMap<String,List<PrivilegeGrantInfo>>(other.rolePrivileges.size());
      for (Map.Entry<String, List<PrivilegeGrantInfo>> other_element : other.rolePrivileges.entrySet()) {

        String other_element_key = other_element.getKey();
        List<PrivilegeGrantInfo> other_element_value = other_element.getValue();

        String __this__rolePrivileges_copy_key = other_element_key;

        List<PrivilegeGrantInfo> __this__rolePrivileges_copy_value = new ArrayList<PrivilegeGrantInfo>(other_element_value.size());
        for (PrivilegeGrantInfo other_element_value_element : other_element_value) {
          __this__rolePrivileges_copy_value.add(new PrivilegeGrantInfo(other_element_value_element));
        }

        __this__rolePrivileges.put(__this__rolePrivileges_copy_key, __this__rolePrivileges_copy_value);
      }
      this.rolePrivileges = __this__rolePrivileges;
    }
  }

  public PrincipalPrivilegeSet deepCopy() {
    return new PrincipalPrivilegeSet(this);
  }

  @Override
  public void clear() {
    this.userPrivileges = null;
    this.groupPrivileges = null;
    this.rolePrivileges = null;
  }

  public int getUserPrivilegesSize() {
    return (this.userPrivileges == null) ? 0 : this.userPrivileges.size();
  }

  public void putToUserPrivileges(String key, List<PrivilegeGrantInfo> val) {
    if (this.userPrivileges == null) {
      this.userPrivileges = new HashMap<String,List<PrivilegeGrantInfo>>();
    }
    this.userPrivileges.put(key, val);
  }

  public Map<String,List<PrivilegeGrantInfo>> getUserPrivileges() {
    return this.userPrivileges;
  }

  public void setUserPrivileges(Map<String,List<PrivilegeGrantInfo>> userPrivileges) {
    this.userPrivileges = userPrivileges;
  }

  public void unsetUserPrivileges() {
    this.userPrivileges = null;
  }

  /** Returns true if field userPrivileges is set (has been assigned a value) and false otherwise */
  public boolean isSetUserPrivileges() {
    return this.userPrivileges != null;
  }

  public void setUserPrivilegesIsSet(boolean value) {
    if (!value) {
      this.userPrivileges = null;
    }
  }

  public int getGroupPrivilegesSize() {
    return (this.groupPrivileges == null) ? 0 : this.groupPrivileges.size();
  }

  public void putToGroupPrivileges(String key, List<PrivilegeGrantInfo> val) {
    if (this.groupPrivileges == null) {
      this.groupPrivileges = new HashMap<String,List<PrivilegeGrantInfo>>();
    }
    this.groupPrivileges.put(key, val);
  }

  public Map<String,List<PrivilegeGrantInfo>> getGroupPrivileges() {
    return this.groupPrivileges;
  }

  public void setGroupPrivileges(Map<String,List<PrivilegeGrantInfo>> groupPrivileges) {
    this.groupPrivileges = groupPrivileges;
  }

  public void unsetGroupPrivileges() {
    this.groupPrivileges = null;
  }

  /** Returns true if field groupPrivileges is set (has been assigned a value) and false otherwise */
  public boolean isSetGroupPrivileges() {
    return this.groupPrivileges != null;
  }

  public void setGroupPrivilegesIsSet(boolean value) {
    if (!value) {
      this.groupPrivileges = null;
    }
  }

  public int getRolePrivilegesSize() {
    return (this.rolePrivileges == null) ? 0 : this.rolePrivileges.size();
  }

  public void putToRolePrivileges(String key, List<PrivilegeGrantInfo> val) {
    if (this.rolePrivileges == null) {
      this.rolePrivileges = new HashMap<String,List<PrivilegeGrantInfo>>();
    }
    this.rolePrivileges.put(key, val);
  }

  public Map<String,List<PrivilegeGrantInfo>> getRolePrivileges() {
    return this.rolePrivileges;
  }

  public void setRolePrivileges(Map<String,List<PrivilegeGrantInfo>> rolePrivileges) {
    this.rolePrivileges = rolePrivileges;
  }

  public void unsetRolePrivileges() {
    this.rolePrivileges = null;
  }

  /** Returns true if field rolePrivileges is set (has been assigned a value) and false otherwise */
  public boolean isSetRolePrivileges() {
    return this.rolePrivileges != null;
  }

  public void setRolePrivilegesIsSet(boolean value) {
    if (!value) {
      this.rolePrivileges = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case USER_PRIVILEGES:
      if (value == null) {
        unsetUserPrivileges();
      } else {
        setUserPrivileges((Map<String,List<PrivilegeGrantInfo>>)value);
      }
      break;

    case GROUP_PRIVILEGES:
      if (value == null) {
        unsetGroupPrivileges();
      } else {
        setGroupPrivileges((Map<String,List<PrivilegeGrantInfo>>)value);
      }
      break;

    case ROLE_PRIVILEGES:
      if (value == null) {
        unsetRolePrivileges();
      } else {
        setRolePrivileges((Map<String,List<PrivilegeGrantInfo>>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case USER_PRIVILEGES:
      return getUserPrivileges();

    case GROUP_PRIVILEGES:
      return getGroupPrivileges();

    case ROLE_PRIVILEGES:
      return getRolePrivileges();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case USER_PRIVILEGES:
      return isSetUserPrivileges();
    case GROUP_PRIVILEGES:
      return isSetGroupPrivileges();
    case ROLE_PRIVILEGES:
      return isSetRolePrivileges();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof PrincipalPrivilegeSet)
      return this.equals((PrincipalPrivilegeSet)that);
    return false;
  }

  public boolean equals(PrincipalPrivilegeSet that) {
    if (that == null)
      return false;

    boolean this_present_userPrivileges = true && this.isSetUserPrivileges();
    boolean that_present_userPrivileges = true && that.isSetUserPrivileges();
    if (this_present_userPrivileges || that_present_userPrivileges) {
      if (!(this_present_userPrivileges && that_present_userPrivileges))
        return false;
      if (!this.userPrivileges.equals(that.userPrivileges))
        return false;
    }

    boolean this_present_groupPrivileges = true && this.isSetGroupPrivileges();
    boolean that_present_groupPrivileges = true && that.isSetGroupPrivileges();
    if (this_present_groupPrivileges || that_present_groupPrivileges) {
      if (!(this_present_groupPrivileges && that_present_groupPrivileges))
        return false;
      if (!this.groupPrivileges.equals(that.groupPrivileges))
        return false;
    }

    boolean this_present_rolePrivileges = true && this.isSetRolePrivileges();
    boolean that_present_rolePrivileges = true && that.isSetRolePrivileges();
    if (this_present_rolePrivileges || that_present_rolePrivileges) {
      if (!(this_present_rolePrivileges && that_present_rolePrivileges))
        return false;
      if (!this.rolePrivileges.equals(that.rolePrivileges))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_userPrivileges = true && (isSetUserPrivileges());
    list.add(present_userPrivileges);
    if (present_userPrivileges)
      list.add(userPrivileges);

    boolean present_groupPrivileges = true && (isSetGroupPrivileges());
    list.add(present_groupPrivileges);
    if (present_groupPrivileges)
      list.add(groupPrivileges);

    boolean present_rolePrivileges = true && (isSetRolePrivileges());
    list.add(present_rolePrivileges);
    if (present_rolePrivileges)
      list.add(rolePrivileges);

    return list.hashCode();
  }

  @Override
  public int compareTo(PrincipalPrivilegeSet other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetUserPrivileges()).compareTo(other.isSetUserPrivileges());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUserPrivileges()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.userPrivileges, other.userPrivileges);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetGroupPrivileges()).compareTo(other.isSetGroupPrivileges());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGroupPrivileges()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.groupPrivileges, other.groupPrivileges);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRolePrivileges()).compareTo(other.isSetRolePrivileges());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRolePrivileges()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.rolePrivileges, other.rolePrivileges);
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
    StringBuilder sb = new StringBuilder("PrincipalPrivilegeSet(");
    boolean first = true;

    sb.append("userPrivileges:");
    if (this.userPrivileges == null) {
      sb.append("null");
    } else {
      sb.append(this.userPrivileges);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("groupPrivileges:");
    if (this.groupPrivileges == null) {
      sb.append("null");
    } else {
      sb.append(this.groupPrivileges);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("rolePrivileges:");
    if (this.rolePrivileges == null) {
      sb.append("null");
    } else {
      sb.append(this.rolePrivileges);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class PrincipalPrivilegeSetStandardSchemeFactory implements SchemeFactory {
    public PrincipalPrivilegeSetStandardScheme getScheme() {
      return new PrincipalPrivilegeSetStandardScheme();
    }
  }

  private static class PrincipalPrivilegeSetStandardScheme extends StandardScheme<PrincipalPrivilegeSet> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, PrincipalPrivilegeSet struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // USER_PRIVILEGES
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map24 = iprot.readMapBegin();
                struct.userPrivileges = new HashMap<String,List<PrivilegeGrantInfo>>(2*_map24.size);
                String _key25;
                List<PrivilegeGrantInfo> _val26;
                for (int _i27 = 0; _i27 < _map24.size; ++_i27)
                {
                  _key25 = iprot.readString();
                  {
                    org.apache.thrift.protocol.TList _list28 = iprot.readListBegin();
                    _val26 = new ArrayList<PrivilegeGrantInfo>(_list28.size);
                    PrivilegeGrantInfo _elem29;
                    for (int _i30 = 0; _i30 < _list28.size; ++_i30)
                    {
                      _elem29 = new PrivilegeGrantInfo();
                      _elem29.read(iprot);
                      _val26.add(_elem29);
                    }
                    iprot.readListEnd();
                  }
                  struct.userPrivileges.put(_key25, _val26);
                }
                iprot.readMapEnd();
              }
              struct.setUserPrivilegesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // GROUP_PRIVILEGES
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map31 = iprot.readMapBegin();
                struct.groupPrivileges = new HashMap<String,List<PrivilegeGrantInfo>>(2*_map31.size);
                String _key32;
                List<PrivilegeGrantInfo> _val33;
                for (int _i34 = 0; _i34 < _map31.size; ++_i34)
                {
                  _key32 = iprot.readString();
                  {
                    org.apache.thrift.protocol.TList _list35 = iprot.readListBegin();
                    _val33 = new ArrayList<PrivilegeGrantInfo>(_list35.size);
                    PrivilegeGrantInfo _elem36;
                    for (int _i37 = 0; _i37 < _list35.size; ++_i37)
                    {
                      _elem36 = new PrivilegeGrantInfo();
                      _elem36.read(iprot);
                      _val33.add(_elem36);
                    }
                    iprot.readListEnd();
                  }
                  struct.groupPrivileges.put(_key32, _val33);
                }
                iprot.readMapEnd();
              }
              struct.setGroupPrivilegesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // ROLE_PRIVILEGES
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map38 = iprot.readMapBegin();
                struct.rolePrivileges = new HashMap<String,List<PrivilegeGrantInfo>>(2*_map38.size);
                String _key39;
                List<PrivilegeGrantInfo> _val40;
                for (int _i41 = 0; _i41 < _map38.size; ++_i41)
                {
                  _key39 = iprot.readString();
                  {
                    org.apache.thrift.protocol.TList _list42 = iprot.readListBegin();
                    _val40 = new ArrayList<PrivilegeGrantInfo>(_list42.size);
                    PrivilegeGrantInfo _elem43;
                    for (int _i44 = 0; _i44 < _list42.size; ++_i44)
                    {
                      _elem43 = new PrivilegeGrantInfo();
                      _elem43.read(iprot);
                      _val40.add(_elem43);
                    }
                    iprot.readListEnd();
                  }
                  struct.rolePrivileges.put(_key39, _val40);
                }
                iprot.readMapEnd();
              }
              struct.setRolePrivilegesIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, PrincipalPrivilegeSet struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.userPrivileges != null) {
        oprot.writeFieldBegin(USER_PRIVILEGES_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.LIST, struct.userPrivileges.size()));
          for (Map.Entry<String, List<PrivilegeGrantInfo>> _iter45 : struct.userPrivileges.entrySet())
          {
            oprot.writeString(_iter45.getKey());
            {
              oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, _iter45.getValue().size()));
              for (PrivilegeGrantInfo _iter46 : _iter45.getValue())
              {
                _iter46.write(oprot);
              }
              oprot.writeListEnd();
            }
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.groupPrivileges != null) {
        oprot.writeFieldBegin(GROUP_PRIVILEGES_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.LIST, struct.groupPrivileges.size()));
          for (Map.Entry<String, List<PrivilegeGrantInfo>> _iter47 : struct.groupPrivileges.entrySet())
          {
            oprot.writeString(_iter47.getKey());
            {
              oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, _iter47.getValue().size()));
              for (PrivilegeGrantInfo _iter48 : _iter47.getValue())
              {
                _iter48.write(oprot);
              }
              oprot.writeListEnd();
            }
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.rolePrivileges != null) {
        oprot.writeFieldBegin(ROLE_PRIVILEGES_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.LIST, struct.rolePrivileges.size()));
          for (Map.Entry<String, List<PrivilegeGrantInfo>> _iter49 : struct.rolePrivileges.entrySet())
          {
            oprot.writeString(_iter49.getKey());
            {
              oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, _iter49.getValue().size()));
              for (PrivilegeGrantInfo _iter50 : _iter49.getValue())
              {
                _iter50.write(oprot);
              }
              oprot.writeListEnd();
            }
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class PrincipalPrivilegeSetTupleSchemeFactory implements SchemeFactory {
    public PrincipalPrivilegeSetTupleScheme getScheme() {
      return new PrincipalPrivilegeSetTupleScheme();
    }
  }

  private static class PrincipalPrivilegeSetTupleScheme extends TupleScheme<PrincipalPrivilegeSet> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, PrincipalPrivilegeSet struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetUserPrivileges()) {
        optionals.set(0);
      }
      if (struct.isSetGroupPrivileges()) {
        optionals.set(1);
      }
      if (struct.isSetRolePrivileges()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetUserPrivileges()) {
        {
          oprot.writeI32(struct.userPrivileges.size());
          for (Map.Entry<String, List<PrivilegeGrantInfo>> _iter51 : struct.userPrivileges.entrySet())
          {
            oprot.writeString(_iter51.getKey());
            {
              oprot.writeI32(_iter51.getValue().size());
              for (PrivilegeGrantInfo _iter52 : _iter51.getValue())
              {
                _iter52.write(oprot);
              }
            }
          }
        }
      }
      if (struct.isSetGroupPrivileges()) {
        {
          oprot.writeI32(struct.groupPrivileges.size());
          for (Map.Entry<String, List<PrivilegeGrantInfo>> _iter53 : struct.groupPrivileges.entrySet())
          {
            oprot.writeString(_iter53.getKey());
            {
              oprot.writeI32(_iter53.getValue().size());
              for (PrivilegeGrantInfo _iter54 : _iter53.getValue())
              {
                _iter54.write(oprot);
              }
            }
          }
        }
      }
      if (struct.isSetRolePrivileges()) {
        {
          oprot.writeI32(struct.rolePrivileges.size());
          for (Map.Entry<String, List<PrivilegeGrantInfo>> _iter55 : struct.rolePrivileges.entrySet())
          {
            oprot.writeString(_iter55.getKey());
            {
              oprot.writeI32(_iter55.getValue().size());
              for (PrivilegeGrantInfo _iter56 : _iter55.getValue())
              {
                _iter56.write(oprot);
              }
            }
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, PrincipalPrivilegeSet struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TMap _map57 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.LIST, iprot.readI32());
          struct.userPrivileges = new HashMap<String,List<PrivilegeGrantInfo>>(2*_map57.size);
          String _key58;
          List<PrivilegeGrantInfo> _val59;
          for (int _i60 = 0; _i60 < _map57.size; ++_i60)
          {
            _key58 = iprot.readString();
            {
              org.apache.thrift.protocol.TList _list61 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
              _val59 = new ArrayList<PrivilegeGrantInfo>(_list61.size);
              PrivilegeGrantInfo _elem62;
              for (int _i63 = 0; _i63 < _list61.size; ++_i63)
              {
                _elem62 = new PrivilegeGrantInfo();
                _elem62.read(iprot);
                _val59.add(_elem62);
              }
            }
            struct.userPrivileges.put(_key58, _val59);
          }
        }
        struct.setUserPrivilegesIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TMap _map64 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.LIST, iprot.readI32());
          struct.groupPrivileges = new HashMap<String,List<PrivilegeGrantInfo>>(2*_map64.size);
          String _key65;
          List<PrivilegeGrantInfo> _val66;
          for (int _i67 = 0; _i67 < _map64.size; ++_i67)
          {
            _key65 = iprot.readString();
            {
              org.apache.thrift.protocol.TList _list68 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
              _val66 = new ArrayList<PrivilegeGrantInfo>(_list68.size);
              PrivilegeGrantInfo _elem69;
              for (int _i70 = 0; _i70 < _list68.size; ++_i70)
              {
                _elem69 = new PrivilegeGrantInfo();
                _elem69.read(iprot);
                _val66.add(_elem69);
              }
            }
            struct.groupPrivileges.put(_key65, _val66);
          }
        }
        struct.setGroupPrivilegesIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TMap _map71 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.LIST, iprot.readI32());
          struct.rolePrivileges = new HashMap<String,List<PrivilegeGrantInfo>>(2*_map71.size);
          String _key72;
          List<PrivilegeGrantInfo> _val73;
          for (int _i74 = 0; _i74 < _map71.size; ++_i74)
          {
            _key72 = iprot.readString();
            {
              org.apache.thrift.protocol.TList _list75 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
              _val73 = new ArrayList<PrivilegeGrantInfo>(_list75.size);
              PrivilegeGrantInfo _elem76;
              for (int _i77 = 0; _i77 < _list75.size; ++_i77)
              {
                _elem76 = new PrivilegeGrantInfo();
                _elem76.read(iprot);
                _val73.add(_elem76);
              }
            }
            struct.rolePrivileges.put(_key72, _val73);
          }
        }
        struct.setRolePrivilegesIsSet(true);
      }
    }
  }

}

