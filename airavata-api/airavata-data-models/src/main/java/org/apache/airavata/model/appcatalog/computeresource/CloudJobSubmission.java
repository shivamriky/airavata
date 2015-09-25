/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.airavata.model.appcatalog.computeresource;

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
/**
 * Cloud Job Submission
 * 
 * 
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-9-11")
public class CloudJobSubmission implements org.apache.thrift.TBase<CloudJobSubmission, CloudJobSubmission._Fields>, java.io.Serializable, Cloneable, Comparable<CloudJobSubmission> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CloudJobSubmission");

  private static final org.apache.thrift.protocol.TField JOB_SUBMISSION_INTERFACE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("jobSubmissionInterfaceId", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField SECURITY_PROTOCOL_FIELD_DESC = new org.apache.thrift.protocol.TField("securityProtocol", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField NODE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("nodeId", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField EXECUTABLE_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("executableType", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField PROVIDER_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("providerName", org.apache.thrift.protocol.TType.I32, (short)5);
  private static final org.apache.thrift.protocol.TField USER_ACCOUNT_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("userAccountName", org.apache.thrift.protocol.TType.STRING, (short)6);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new CloudJobSubmissionStandardSchemeFactory());
    schemes.put(TupleScheme.class, new CloudJobSubmissionTupleSchemeFactory());
  }

  private String jobSubmissionInterfaceId; // required
  private SecurityProtocol securityProtocol; // required
  private String nodeId; // required
  private String executableType; // required
  private ProviderName providerName; // required
  private String userAccountName; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    JOB_SUBMISSION_INTERFACE_ID((short)1, "jobSubmissionInterfaceId"),
    /**
     * 
     * @see SecurityProtocol
     */
    SECURITY_PROTOCOL((short)2, "securityProtocol"),
    NODE_ID((short)3, "nodeId"),
    EXECUTABLE_TYPE((short)4, "executableType"),
    /**
     * 
     * @see ProviderName
     */
    PROVIDER_NAME((short)5, "providerName"),
    USER_ACCOUNT_NAME((short)6, "userAccountName");

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
        case 1: // JOB_SUBMISSION_INTERFACE_ID
          return JOB_SUBMISSION_INTERFACE_ID;
        case 2: // SECURITY_PROTOCOL
          return SECURITY_PROTOCOL;
        case 3: // NODE_ID
          return NODE_ID;
        case 4: // EXECUTABLE_TYPE
          return EXECUTABLE_TYPE;
        case 5: // PROVIDER_NAME
          return PROVIDER_NAME;
        case 6: // USER_ACCOUNT_NAME
          return USER_ACCOUNT_NAME;
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
    tmpMap.put(_Fields.JOB_SUBMISSION_INTERFACE_ID, new org.apache.thrift.meta_data.FieldMetaData("jobSubmissionInterfaceId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SECURITY_PROTOCOL, new org.apache.thrift.meta_data.FieldMetaData("securityProtocol", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, SecurityProtocol.class)));
    tmpMap.put(_Fields.NODE_ID, new org.apache.thrift.meta_data.FieldMetaData("nodeId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.EXECUTABLE_TYPE, new org.apache.thrift.meta_data.FieldMetaData("executableType", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PROVIDER_NAME, new org.apache.thrift.meta_data.FieldMetaData("providerName", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, ProviderName.class)));
    tmpMap.put(_Fields.USER_ACCOUNT_NAME, new org.apache.thrift.meta_data.FieldMetaData("userAccountName", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CloudJobSubmission.class, metaDataMap);
  }

  public CloudJobSubmission() {
    this.jobSubmissionInterfaceId = "DO_NOT_SET_AT_CLIENTS";

  }

  public CloudJobSubmission(
    String jobSubmissionInterfaceId,
    SecurityProtocol securityProtocol,
    String nodeId,
    String executableType,
    ProviderName providerName,
    String userAccountName)
  {
    this();
    this.jobSubmissionInterfaceId = jobSubmissionInterfaceId;
    this.securityProtocol = securityProtocol;
    this.nodeId = nodeId;
    this.executableType = executableType;
    this.providerName = providerName;
    this.userAccountName = userAccountName;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CloudJobSubmission(CloudJobSubmission other) {
    if (other.isSetJobSubmissionInterfaceId()) {
      this.jobSubmissionInterfaceId = other.jobSubmissionInterfaceId;
    }
    if (other.isSetSecurityProtocol()) {
      this.securityProtocol = other.securityProtocol;
    }
    if (other.isSetNodeId()) {
      this.nodeId = other.nodeId;
    }
    if (other.isSetExecutableType()) {
      this.executableType = other.executableType;
    }
    if (other.isSetProviderName()) {
      this.providerName = other.providerName;
    }
    if (other.isSetUserAccountName()) {
      this.userAccountName = other.userAccountName;
    }
  }

  public CloudJobSubmission deepCopy() {
    return new CloudJobSubmission(this);
  }

  @Override
  public void clear() {
    this.jobSubmissionInterfaceId = "DO_NOT_SET_AT_CLIENTS";

    this.securityProtocol = null;
    this.nodeId = null;
    this.executableType = null;
    this.providerName = null;
    this.userAccountName = null;
  }

  public String getJobSubmissionInterfaceId() {
    return this.jobSubmissionInterfaceId;
  }

  public void setJobSubmissionInterfaceId(String jobSubmissionInterfaceId) {
    this.jobSubmissionInterfaceId = jobSubmissionInterfaceId;
  }

  public void unsetJobSubmissionInterfaceId() {
    this.jobSubmissionInterfaceId = null;
  }

  /** Returns true if field jobSubmissionInterfaceId is set (has been assigned a value) and false otherwise */
  public boolean isSetJobSubmissionInterfaceId() {
    return this.jobSubmissionInterfaceId != null;
  }

  public void setJobSubmissionInterfaceIdIsSet(boolean value) {
    if (!value) {
      this.jobSubmissionInterfaceId = null;
    }
  }

  /**
   * 
   * @see SecurityProtocol
   */
  public SecurityProtocol getSecurityProtocol() {
    return this.securityProtocol;
  }

  /**
   * 
   * @see SecurityProtocol
   */
  public void setSecurityProtocol(SecurityProtocol securityProtocol) {
    this.securityProtocol = securityProtocol;
  }

  public void unsetSecurityProtocol() {
    this.securityProtocol = null;
  }

  /** Returns true if field securityProtocol is set (has been assigned a value) and false otherwise */
  public boolean isSetSecurityProtocol() {
    return this.securityProtocol != null;
  }

  public void setSecurityProtocolIsSet(boolean value) {
    if (!value) {
      this.securityProtocol = null;
    }
  }

  public String getNodeId() {
    return this.nodeId;
  }

  public void setNodeId(String nodeId) {
    this.nodeId = nodeId;
  }

  public void unsetNodeId() {
    this.nodeId = null;
  }

  /** Returns true if field nodeId is set (has been assigned a value) and false otherwise */
  public boolean isSetNodeId() {
    return this.nodeId != null;
  }

  public void setNodeIdIsSet(boolean value) {
    if (!value) {
      this.nodeId = null;
    }
  }

  public String getExecutableType() {
    return this.executableType;
  }

  public void setExecutableType(String executableType) {
    this.executableType = executableType;
  }

  public void unsetExecutableType() {
    this.executableType = null;
  }

  /** Returns true if field executableType is set (has been assigned a value) and false otherwise */
  public boolean isSetExecutableType() {
    return this.executableType != null;
  }

  public void setExecutableTypeIsSet(boolean value) {
    if (!value) {
      this.executableType = null;
    }
  }

  /**
   * 
   * @see ProviderName
   */
  public ProviderName getProviderName() {
    return this.providerName;
  }

  /**
   * 
   * @see ProviderName
   */
  public void setProviderName(ProviderName providerName) {
    this.providerName = providerName;
  }

  public void unsetProviderName() {
    this.providerName = null;
  }

  /** Returns true if field providerName is set (has been assigned a value) and false otherwise */
  public boolean isSetProviderName() {
    return this.providerName != null;
  }

  public void setProviderNameIsSet(boolean value) {
    if (!value) {
      this.providerName = null;
    }
  }

  public String getUserAccountName() {
    return this.userAccountName;
  }

  public void setUserAccountName(String userAccountName) {
    this.userAccountName = userAccountName;
  }

  public void unsetUserAccountName() {
    this.userAccountName = null;
  }

  /** Returns true if field userAccountName is set (has been assigned a value) and false otherwise */
  public boolean isSetUserAccountName() {
    return this.userAccountName != null;
  }

  public void setUserAccountNameIsSet(boolean value) {
    if (!value) {
      this.userAccountName = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case JOB_SUBMISSION_INTERFACE_ID:
      if (value == null) {
        unsetJobSubmissionInterfaceId();
      } else {
        setJobSubmissionInterfaceId((String)value);
      }
      break;

    case SECURITY_PROTOCOL:
      if (value == null) {
        unsetSecurityProtocol();
      } else {
        setSecurityProtocol((SecurityProtocol)value);
      }
      break;

    case NODE_ID:
      if (value == null) {
        unsetNodeId();
      } else {
        setNodeId((String)value);
      }
      break;

    case EXECUTABLE_TYPE:
      if (value == null) {
        unsetExecutableType();
      } else {
        setExecutableType((String)value);
      }
      break;

    case PROVIDER_NAME:
      if (value == null) {
        unsetProviderName();
      } else {
        setProviderName((ProviderName)value);
      }
      break;

    case USER_ACCOUNT_NAME:
      if (value == null) {
        unsetUserAccountName();
      } else {
        setUserAccountName((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case JOB_SUBMISSION_INTERFACE_ID:
      return getJobSubmissionInterfaceId();

    case SECURITY_PROTOCOL:
      return getSecurityProtocol();

    case NODE_ID:
      return getNodeId();

    case EXECUTABLE_TYPE:
      return getExecutableType();

    case PROVIDER_NAME:
      return getProviderName();

    case USER_ACCOUNT_NAME:
      return getUserAccountName();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case JOB_SUBMISSION_INTERFACE_ID:
      return isSetJobSubmissionInterfaceId();
    case SECURITY_PROTOCOL:
      return isSetSecurityProtocol();
    case NODE_ID:
      return isSetNodeId();
    case EXECUTABLE_TYPE:
      return isSetExecutableType();
    case PROVIDER_NAME:
      return isSetProviderName();
    case USER_ACCOUNT_NAME:
      return isSetUserAccountName();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CloudJobSubmission)
      return this.equals((CloudJobSubmission)that);
    return false;
  }

  public boolean equals(CloudJobSubmission that) {
    if (that == null)
      return false;

    boolean this_present_jobSubmissionInterfaceId = true && this.isSetJobSubmissionInterfaceId();
    boolean that_present_jobSubmissionInterfaceId = true && that.isSetJobSubmissionInterfaceId();
    if (this_present_jobSubmissionInterfaceId || that_present_jobSubmissionInterfaceId) {
      if (!(this_present_jobSubmissionInterfaceId && that_present_jobSubmissionInterfaceId))
        return false;
      if (!this.jobSubmissionInterfaceId.equals(that.jobSubmissionInterfaceId))
        return false;
    }

    boolean this_present_securityProtocol = true && this.isSetSecurityProtocol();
    boolean that_present_securityProtocol = true && that.isSetSecurityProtocol();
    if (this_present_securityProtocol || that_present_securityProtocol) {
      if (!(this_present_securityProtocol && that_present_securityProtocol))
        return false;
      if (!this.securityProtocol.equals(that.securityProtocol))
        return false;
    }

    boolean this_present_nodeId = true && this.isSetNodeId();
    boolean that_present_nodeId = true && that.isSetNodeId();
    if (this_present_nodeId || that_present_nodeId) {
      if (!(this_present_nodeId && that_present_nodeId))
        return false;
      if (!this.nodeId.equals(that.nodeId))
        return false;
    }

    boolean this_present_executableType = true && this.isSetExecutableType();
    boolean that_present_executableType = true && that.isSetExecutableType();
    if (this_present_executableType || that_present_executableType) {
      if (!(this_present_executableType && that_present_executableType))
        return false;
      if (!this.executableType.equals(that.executableType))
        return false;
    }

    boolean this_present_providerName = true && this.isSetProviderName();
    boolean that_present_providerName = true && that.isSetProviderName();
    if (this_present_providerName || that_present_providerName) {
      if (!(this_present_providerName && that_present_providerName))
        return false;
      if (!this.providerName.equals(that.providerName))
        return false;
    }

    boolean this_present_userAccountName = true && this.isSetUserAccountName();
    boolean that_present_userAccountName = true && that.isSetUserAccountName();
    if (this_present_userAccountName || that_present_userAccountName) {
      if (!(this_present_userAccountName && that_present_userAccountName))
        return false;
      if (!this.userAccountName.equals(that.userAccountName))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_jobSubmissionInterfaceId = true && (isSetJobSubmissionInterfaceId());
    list.add(present_jobSubmissionInterfaceId);
    if (present_jobSubmissionInterfaceId)
      list.add(jobSubmissionInterfaceId);

    boolean present_securityProtocol = true && (isSetSecurityProtocol());
    list.add(present_securityProtocol);
    if (present_securityProtocol)
      list.add(securityProtocol.getValue());

    boolean present_nodeId = true && (isSetNodeId());
    list.add(present_nodeId);
    if (present_nodeId)
      list.add(nodeId);

    boolean present_executableType = true && (isSetExecutableType());
    list.add(present_executableType);
    if (present_executableType)
      list.add(executableType);

    boolean present_providerName = true && (isSetProviderName());
    list.add(present_providerName);
    if (present_providerName)
      list.add(providerName.getValue());

    boolean present_userAccountName = true && (isSetUserAccountName());
    list.add(present_userAccountName);
    if (present_userAccountName)
      list.add(userAccountName);

    return list.hashCode();
  }

  @Override
  public int compareTo(CloudJobSubmission other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetJobSubmissionInterfaceId()).compareTo(other.isSetJobSubmissionInterfaceId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetJobSubmissionInterfaceId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.jobSubmissionInterfaceId, other.jobSubmissionInterfaceId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSecurityProtocol()).compareTo(other.isSetSecurityProtocol());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSecurityProtocol()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.securityProtocol, other.securityProtocol);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetNodeId()).compareTo(other.isSetNodeId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNodeId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.nodeId, other.nodeId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetExecutableType()).compareTo(other.isSetExecutableType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExecutableType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.executableType, other.executableType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetProviderName()).compareTo(other.isSetProviderName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetProviderName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.providerName, other.providerName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUserAccountName()).compareTo(other.isSetUserAccountName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUserAccountName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.userAccountName, other.userAccountName);
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
    StringBuilder sb = new StringBuilder("CloudJobSubmission(");
    boolean first = true;

    sb.append("jobSubmissionInterfaceId:");
    if (this.jobSubmissionInterfaceId == null) {
      sb.append("null");
    } else {
      sb.append(this.jobSubmissionInterfaceId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("securityProtocol:");
    if (this.securityProtocol == null) {
      sb.append("null");
    } else {
      sb.append(this.securityProtocol);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("nodeId:");
    if (this.nodeId == null) {
      sb.append("null");
    } else {
      sb.append(this.nodeId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("executableType:");
    if (this.executableType == null) {
      sb.append("null");
    } else {
      sb.append(this.executableType);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("providerName:");
    if (this.providerName == null) {
      sb.append("null");
    } else {
      sb.append(this.providerName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("userAccountName:");
    if (this.userAccountName == null) {
      sb.append("null");
    } else {
      sb.append(this.userAccountName);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetJobSubmissionInterfaceId()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'jobSubmissionInterfaceId' is unset! Struct:" + toString());
    }

    if (!isSetSecurityProtocol()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'securityProtocol' is unset! Struct:" + toString());
    }

    if (!isSetNodeId()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'nodeId' is unset! Struct:" + toString());
    }

    if (!isSetExecutableType()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'executableType' is unset! Struct:" + toString());
    }

    if (!isSetProviderName()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'providerName' is unset! Struct:" + toString());
    }

    if (!isSetUserAccountName()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'userAccountName' is unset! Struct:" + toString());
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class CloudJobSubmissionStandardSchemeFactory implements SchemeFactory {
    public CloudJobSubmissionStandardScheme getScheme() {
      return new CloudJobSubmissionStandardScheme();
    }
  }

  private static class CloudJobSubmissionStandardScheme extends StandardScheme<CloudJobSubmission> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, CloudJobSubmission struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // JOB_SUBMISSION_INTERFACE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.jobSubmissionInterfaceId = iprot.readString();
              struct.setJobSubmissionInterfaceIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SECURITY_PROTOCOL
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.securityProtocol = org.apache.airavata.model.appcatalog.computeresource.SecurityProtocol.findByValue(iprot.readI32());
              struct.setSecurityProtocolIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // NODE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.nodeId = iprot.readString();
              struct.setNodeIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // EXECUTABLE_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.executableType = iprot.readString();
              struct.setExecutableTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // PROVIDER_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.providerName = org.apache.airavata.model.appcatalog.computeresource.ProviderName.findByValue(iprot.readI32());
              struct.setProviderNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // USER_ACCOUNT_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.userAccountName = iprot.readString();
              struct.setUserAccountNameIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, CloudJobSubmission struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.jobSubmissionInterfaceId != null) {
        oprot.writeFieldBegin(JOB_SUBMISSION_INTERFACE_ID_FIELD_DESC);
        oprot.writeString(struct.jobSubmissionInterfaceId);
        oprot.writeFieldEnd();
      }
      if (struct.securityProtocol != null) {
        oprot.writeFieldBegin(SECURITY_PROTOCOL_FIELD_DESC);
        oprot.writeI32(struct.securityProtocol.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.nodeId != null) {
        oprot.writeFieldBegin(NODE_ID_FIELD_DESC);
        oprot.writeString(struct.nodeId);
        oprot.writeFieldEnd();
      }
      if (struct.executableType != null) {
        oprot.writeFieldBegin(EXECUTABLE_TYPE_FIELD_DESC);
        oprot.writeString(struct.executableType);
        oprot.writeFieldEnd();
      }
      if (struct.providerName != null) {
        oprot.writeFieldBegin(PROVIDER_NAME_FIELD_DESC);
        oprot.writeI32(struct.providerName.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.userAccountName != null) {
        oprot.writeFieldBegin(USER_ACCOUNT_NAME_FIELD_DESC);
        oprot.writeString(struct.userAccountName);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CloudJobSubmissionTupleSchemeFactory implements SchemeFactory {
    public CloudJobSubmissionTupleScheme getScheme() {
      return new CloudJobSubmissionTupleScheme();
    }
  }

  private static class CloudJobSubmissionTupleScheme extends TupleScheme<CloudJobSubmission> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, CloudJobSubmission struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.jobSubmissionInterfaceId);
      oprot.writeI32(struct.securityProtocol.getValue());
      oprot.writeString(struct.nodeId);
      oprot.writeString(struct.executableType);
      oprot.writeI32(struct.providerName.getValue());
      oprot.writeString(struct.userAccountName);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, CloudJobSubmission struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.jobSubmissionInterfaceId = iprot.readString();
      struct.setJobSubmissionInterfaceIdIsSet(true);
      struct.securityProtocol = org.apache.airavata.model.appcatalog.computeresource.SecurityProtocol.findByValue(iprot.readI32());
      struct.setSecurityProtocolIsSet(true);
      struct.nodeId = iprot.readString();
      struct.setNodeIdIsSet(true);
      struct.executableType = iprot.readString();
      struct.setExecutableTypeIsSet(true);
      struct.providerName = org.apache.airavata.model.appcatalog.computeresource.ProviderName.findByValue(iprot.readI32());
      struct.setProviderNameIsSet(true);
      struct.userAccountName = iprot.readString();
      struct.setUserAccountNameIsSet(true);
    }
  }

}

