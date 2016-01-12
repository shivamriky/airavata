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
 * Autogenerated by Thrift Compiler (0.9.3)
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
 * Batch Queue Information on SuperComputers
 * 
 * maxRunTime:
 *  Maximum allowed run time in hours.
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-01-12")
public class BatchQueue implements org.apache.thrift.TBase<BatchQueue, BatchQueue._Fields>, java.io.Serializable, Cloneable, Comparable<BatchQueue> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("BatchQueue");

  private static final org.apache.thrift.protocol.TField QUEUE_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("queueName", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField QUEUE_DESCRIPTION_FIELD_DESC = new org.apache.thrift.protocol.TField("queueDescription", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField MAX_RUN_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("maxRunTime", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField MAX_NODES_FIELD_DESC = new org.apache.thrift.protocol.TField("maxNodes", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField MAX_PROCESSORS_FIELD_DESC = new org.apache.thrift.protocol.TField("maxProcessors", org.apache.thrift.protocol.TType.I32, (short)5);
  private static final org.apache.thrift.protocol.TField MAX_JOBS_IN_QUEUE_FIELD_DESC = new org.apache.thrift.protocol.TField("maxJobsInQueue", org.apache.thrift.protocol.TType.I32, (short)6);
  private static final org.apache.thrift.protocol.TField MAX_MEMORY_FIELD_DESC = new org.apache.thrift.protocol.TField("maxMemory", org.apache.thrift.protocol.TType.I32, (short)7);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new BatchQueueStandardSchemeFactory());
    schemes.put(TupleScheme.class, new BatchQueueTupleSchemeFactory());
  }

  private String queueName; // required
  private String queueDescription; // optional
  private int maxRunTime; // optional
  private int maxNodes; // optional
  private int maxProcessors; // optional
  private int maxJobsInQueue; // optional
  private int maxMemory; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    QUEUE_NAME((short)1, "queueName"),
    QUEUE_DESCRIPTION((short)2, "queueDescription"),
    MAX_RUN_TIME((short)3, "maxRunTime"),
    MAX_NODES((short)4, "maxNodes"),
    MAX_PROCESSORS((short)5, "maxProcessors"),
    MAX_JOBS_IN_QUEUE((short)6, "maxJobsInQueue"),
    MAX_MEMORY((short)7, "maxMemory");

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
        case 1: // QUEUE_NAME
          return QUEUE_NAME;
        case 2: // QUEUE_DESCRIPTION
          return QUEUE_DESCRIPTION;
        case 3: // MAX_RUN_TIME
          return MAX_RUN_TIME;
        case 4: // MAX_NODES
          return MAX_NODES;
        case 5: // MAX_PROCESSORS
          return MAX_PROCESSORS;
        case 6: // MAX_JOBS_IN_QUEUE
          return MAX_JOBS_IN_QUEUE;
        case 7: // MAX_MEMORY
          return MAX_MEMORY;
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
  private static final int __MAXRUNTIME_ISSET_ID = 0;
  private static final int __MAXNODES_ISSET_ID = 1;
  private static final int __MAXPROCESSORS_ISSET_ID = 2;
  private static final int __MAXJOBSINQUEUE_ISSET_ID = 3;
  private static final int __MAXMEMORY_ISSET_ID = 4;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.QUEUE_DESCRIPTION,_Fields.MAX_RUN_TIME,_Fields.MAX_NODES,_Fields.MAX_PROCESSORS,_Fields.MAX_JOBS_IN_QUEUE,_Fields.MAX_MEMORY};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.QUEUE_NAME, new org.apache.thrift.meta_data.FieldMetaData("queueName", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.QUEUE_DESCRIPTION, new org.apache.thrift.meta_data.FieldMetaData("queueDescription", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.MAX_RUN_TIME, new org.apache.thrift.meta_data.FieldMetaData("maxRunTime", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.MAX_NODES, new org.apache.thrift.meta_data.FieldMetaData("maxNodes", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.MAX_PROCESSORS, new org.apache.thrift.meta_data.FieldMetaData("maxProcessors", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.MAX_JOBS_IN_QUEUE, new org.apache.thrift.meta_data.FieldMetaData("maxJobsInQueue", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.MAX_MEMORY, new org.apache.thrift.meta_data.FieldMetaData("maxMemory", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(BatchQueue.class, metaDataMap);
  }

  public BatchQueue() {
  }

  public BatchQueue(
    String queueName)
  {
    this();
    this.queueName = queueName;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public BatchQueue(BatchQueue other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetQueueName()) {
      this.queueName = other.queueName;
    }
    if (other.isSetQueueDescription()) {
      this.queueDescription = other.queueDescription;
    }
    this.maxRunTime = other.maxRunTime;
    this.maxNodes = other.maxNodes;
    this.maxProcessors = other.maxProcessors;
    this.maxJobsInQueue = other.maxJobsInQueue;
    this.maxMemory = other.maxMemory;
  }

  public BatchQueue deepCopy() {
    return new BatchQueue(this);
  }

  @Override
  public void clear() {
    this.queueName = null;
    this.queueDescription = null;
    setMaxRunTimeIsSet(false);
    this.maxRunTime = 0;
    setMaxNodesIsSet(false);
    this.maxNodes = 0;
    setMaxProcessorsIsSet(false);
    this.maxProcessors = 0;
    setMaxJobsInQueueIsSet(false);
    this.maxJobsInQueue = 0;
    setMaxMemoryIsSet(false);
    this.maxMemory = 0;
  }

  public String getQueueName() {
    return this.queueName;
  }

  public void setQueueName(String queueName) {
    this.queueName = queueName;
  }

  public void unsetQueueName() {
    this.queueName = null;
  }

  /** Returns true if field queueName is set (has been assigned a value) and false otherwise */
  public boolean isSetQueueName() {
    return this.queueName != null;
  }

  public void setQueueNameIsSet(boolean value) {
    if (!value) {
      this.queueName = null;
    }
  }

  public String getQueueDescription() {
    return this.queueDescription;
  }

  public void setQueueDescription(String queueDescription) {
    this.queueDescription = queueDescription;
  }

  public void unsetQueueDescription() {
    this.queueDescription = null;
  }

  /** Returns true if field queueDescription is set (has been assigned a value) and false otherwise */
  public boolean isSetQueueDescription() {
    return this.queueDescription != null;
  }

  public void setQueueDescriptionIsSet(boolean value) {
    if (!value) {
      this.queueDescription = null;
    }
  }

  public int getMaxRunTime() {
    return this.maxRunTime;
  }

  public void setMaxRunTime(int maxRunTime) {
    this.maxRunTime = maxRunTime;
    setMaxRunTimeIsSet(true);
  }

  public void unsetMaxRunTime() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __MAXRUNTIME_ISSET_ID);
  }

  /** Returns true if field maxRunTime is set (has been assigned a value) and false otherwise */
  public boolean isSetMaxRunTime() {
    return EncodingUtils.testBit(__isset_bitfield, __MAXRUNTIME_ISSET_ID);
  }

  public void setMaxRunTimeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __MAXRUNTIME_ISSET_ID, value);
  }

  public int getMaxNodes() {
    return this.maxNodes;
  }

  public void setMaxNodes(int maxNodes) {
    this.maxNodes = maxNodes;
    setMaxNodesIsSet(true);
  }

  public void unsetMaxNodes() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __MAXNODES_ISSET_ID);
  }

  /** Returns true if field maxNodes is set (has been assigned a value) and false otherwise */
  public boolean isSetMaxNodes() {
    return EncodingUtils.testBit(__isset_bitfield, __MAXNODES_ISSET_ID);
  }

  public void setMaxNodesIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __MAXNODES_ISSET_ID, value);
  }

  public int getMaxProcessors() {
    return this.maxProcessors;
  }

  public void setMaxProcessors(int maxProcessors) {
    this.maxProcessors = maxProcessors;
    setMaxProcessorsIsSet(true);
  }

  public void unsetMaxProcessors() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __MAXPROCESSORS_ISSET_ID);
  }

  /** Returns true if field maxProcessors is set (has been assigned a value) and false otherwise */
  public boolean isSetMaxProcessors() {
    return EncodingUtils.testBit(__isset_bitfield, __MAXPROCESSORS_ISSET_ID);
  }

  public void setMaxProcessorsIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __MAXPROCESSORS_ISSET_ID, value);
  }

  public int getMaxJobsInQueue() {
    return this.maxJobsInQueue;
  }

  public void setMaxJobsInQueue(int maxJobsInQueue) {
    this.maxJobsInQueue = maxJobsInQueue;
    setMaxJobsInQueueIsSet(true);
  }

  public void unsetMaxJobsInQueue() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __MAXJOBSINQUEUE_ISSET_ID);
  }

  /** Returns true if field maxJobsInQueue is set (has been assigned a value) and false otherwise */
  public boolean isSetMaxJobsInQueue() {
    return EncodingUtils.testBit(__isset_bitfield, __MAXJOBSINQUEUE_ISSET_ID);
  }

  public void setMaxJobsInQueueIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __MAXJOBSINQUEUE_ISSET_ID, value);
  }

  public int getMaxMemory() {
    return this.maxMemory;
  }

  public void setMaxMemory(int maxMemory) {
    this.maxMemory = maxMemory;
    setMaxMemoryIsSet(true);
  }

  public void unsetMaxMemory() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __MAXMEMORY_ISSET_ID);
  }

  /** Returns true if field maxMemory is set (has been assigned a value) and false otherwise */
  public boolean isSetMaxMemory() {
    return EncodingUtils.testBit(__isset_bitfield, __MAXMEMORY_ISSET_ID);
  }

  public void setMaxMemoryIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __MAXMEMORY_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case QUEUE_NAME:
      if (value == null) {
        unsetQueueName();
      } else {
        setQueueName((String)value);
      }
      break;

    case QUEUE_DESCRIPTION:
      if (value == null) {
        unsetQueueDescription();
      } else {
        setQueueDescription((String)value);
      }
      break;

    case MAX_RUN_TIME:
      if (value == null) {
        unsetMaxRunTime();
      } else {
        setMaxRunTime((Integer)value);
      }
      break;

    case MAX_NODES:
      if (value == null) {
        unsetMaxNodes();
      } else {
        setMaxNodes((Integer)value);
      }
      break;

    case MAX_PROCESSORS:
      if (value == null) {
        unsetMaxProcessors();
      } else {
        setMaxProcessors((Integer)value);
      }
      break;

    case MAX_JOBS_IN_QUEUE:
      if (value == null) {
        unsetMaxJobsInQueue();
      } else {
        setMaxJobsInQueue((Integer)value);
      }
      break;

    case MAX_MEMORY:
      if (value == null) {
        unsetMaxMemory();
      } else {
        setMaxMemory((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case QUEUE_NAME:
      return getQueueName();

    case QUEUE_DESCRIPTION:
      return getQueueDescription();

    case MAX_RUN_TIME:
      return getMaxRunTime();

    case MAX_NODES:
      return getMaxNodes();

    case MAX_PROCESSORS:
      return getMaxProcessors();

    case MAX_JOBS_IN_QUEUE:
      return getMaxJobsInQueue();

    case MAX_MEMORY:
      return getMaxMemory();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case QUEUE_NAME:
      return isSetQueueName();
    case QUEUE_DESCRIPTION:
      return isSetQueueDescription();
    case MAX_RUN_TIME:
      return isSetMaxRunTime();
    case MAX_NODES:
      return isSetMaxNodes();
    case MAX_PROCESSORS:
      return isSetMaxProcessors();
    case MAX_JOBS_IN_QUEUE:
      return isSetMaxJobsInQueue();
    case MAX_MEMORY:
      return isSetMaxMemory();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof BatchQueue)
      return this.equals((BatchQueue)that);
    return false;
  }

  public boolean equals(BatchQueue that) {
    if (that == null)
      return false;

    boolean this_present_queueName = true && this.isSetQueueName();
    boolean that_present_queueName = true && that.isSetQueueName();
    if (this_present_queueName || that_present_queueName) {
      if (!(this_present_queueName && that_present_queueName))
        return false;
      if (!this.queueName.equals(that.queueName))
        return false;
    }

    boolean this_present_queueDescription = true && this.isSetQueueDescription();
    boolean that_present_queueDescription = true && that.isSetQueueDescription();
    if (this_present_queueDescription || that_present_queueDescription) {
      if (!(this_present_queueDescription && that_present_queueDescription))
        return false;
      if (!this.queueDescription.equals(that.queueDescription))
        return false;
    }

    boolean this_present_maxRunTime = true && this.isSetMaxRunTime();
    boolean that_present_maxRunTime = true && that.isSetMaxRunTime();
    if (this_present_maxRunTime || that_present_maxRunTime) {
      if (!(this_present_maxRunTime && that_present_maxRunTime))
        return false;
      if (this.maxRunTime != that.maxRunTime)
        return false;
    }

    boolean this_present_maxNodes = true && this.isSetMaxNodes();
    boolean that_present_maxNodes = true && that.isSetMaxNodes();
    if (this_present_maxNodes || that_present_maxNodes) {
      if (!(this_present_maxNodes && that_present_maxNodes))
        return false;
      if (this.maxNodes != that.maxNodes)
        return false;
    }

    boolean this_present_maxProcessors = true && this.isSetMaxProcessors();
    boolean that_present_maxProcessors = true && that.isSetMaxProcessors();
    if (this_present_maxProcessors || that_present_maxProcessors) {
      if (!(this_present_maxProcessors && that_present_maxProcessors))
        return false;
      if (this.maxProcessors != that.maxProcessors)
        return false;
    }

    boolean this_present_maxJobsInQueue = true && this.isSetMaxJobsInQueue();
    boolean that_present_maxJobsInQueue = true && that.isSetMaxJobsInQueue();
    if (this_present_maxJobsInQueue || that_present_maxJobsInQueue) {
      if (!(this_present_maxJobsInQueue && that_present_maxJobsInQueue))
        return false;
      if (this.maxJobsInQueue != that.maxJobsInQueue)
        return false;
    }

    boolean this_present_maxMemory = true && this.isSetMaxMemory();
    boolean that_present_maxMemory = true && that.isSetMaxMemory();
    if (this_present_maxMemory || that_present_maxMemory) {
      if (!(this_present_maxMemory && that_present_maxMemory))
        return false;
      if (this.maxMemory != that.maxMemory)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_queueName = true && (isSetQueueName());
    list.add(present_queueName);
    if (present_queueName)
      list.add(queueName);

    boolean present_queueDescription = true && (isSetQueueDescription());
    list.add(present_queueDescription);
    if (present_queueDescription)
      list.add(queueDescription);

    boolean present_maxRunTime = true && (isSetMaxRunTime());
    list.add(present_maxRunTime);
    if (present_maxRunTime)
      list.add(maxRunTime);

    boolean present_maxNodes = true && (isSetMaxNodes());
    list.add(present_maxNodes);
    if (present_maxNodes)
      list.add(maxNodes);

    boolean present_maxProcessors = true && (isSetMaxProcessors());
    list.add(present_maxProcessors);
    if (present_maxProcessors)
      list.add(maxProcessors);

    boolean present_maxJobsInQueue = true && (isSetMaxJobsInQueue());
    list.add(present_maxJobsInQueue);
    if (present_maxJobsInQueue)
      list.add(maxJobsInQueue);

    boolean present_maxMemory = true && (isSetMaxMemory());
    list.add(present_maxMemory);
    if (present_maxMemory)
      list.add(maxMemory);

    return list.hashCode();
  }

  @Override
  public int compareTo(BatchQueue other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetQueueName()).compareTo(other.isSetQueueName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetQueueName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.queueName, other.queueName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetQueueDescription()).compareTo(other.isSetQueueDescription());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetQueueDescription()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.queueDescription, other.queueDescription);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMaxRunTime()).compareTo(other.isSetMaxRunTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMaxRunTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.maxRunTime, other.maxRunTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMaxNodes()).compareTo(other.isSetMaxNodes());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMaxNodes()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.maxNodes, other.maxNodes);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMaxProcessors()).compareTo(other.isSetMaxProcessors());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMaxProcessors()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.maxProcessors, other.maxProcessors);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMaxJobsInQueue()).compareTo(other.isSetMaxJobsInQueue());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMaxJobsInQueue()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.maxJobsInQueue, other.maxJobsInQueue);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMaxMemory()).compareTo(other.isSetMaxMemory());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMaxMemory()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.maxMemory, other.maxMemory);
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
    StringBuilder sb = new StringBuilder("BatchQueue(");
    boolean first = true;

    sb.append("queueName:");
    if (this.queueName == null) {
      sb.append("null");
    } else {
      sb.append(this.queueName);
    }
    first = false;
    if (isSetQueueDescription()) {
      if (!first) sb.append(", ");
      sb.append("queueDescription:");
      if (this.queueDescription == null) {
        sb.append("null");
      } else {
        sb.append(this.queueDescription);
      }
      first = false;
    }
    if (isSetMaxRunTime()) {
      if (!first) sb.append(", ");
      sb.append("maxRunTime:");
      sb.append(this.maxRunTime);
      first = false;
    }
    if (isSetMaxNodes()) {
      if (!first) sb.append(", ");
      sb.append("maxNodes:");
      sb.append(this.maxNodes);
      first = false;
    }
    if (isSetMaxProcessors()) {
      if (!first) sb.append(", ");
      sb.append("maxProcessors:");
      sb.append(this.maxProcessors);
      first = false;
    }
    if (isSetMaxJobsInQueue()) {
      if (!first) sb.append(", ");
      sb.append("maxJobsInQueue:");
      sb.append(this.maxJobsInQueue);
      first = false;
    }
    if (isSetMaxMemory()) {
      if (!first) sb.append(", ");
      sb.append("maxMemory:");
      sb.append(this.maxMemory);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetQueueName()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'queueName' is unset! Struct:" + toString());
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

  private static class BatchQueueStandardSchemeFactory implements SchemeFactory {
    public BatchQueueStandardScheme getScheme() {
      return new BatchQueueStandardScheme();
    }
  }

  private static class BatchQueueStandardScheme extends StandardScheme<BatchQueue> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, BatchQueue struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // QUEUE_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.queueName = iprot.readString();
              struct.setQueueNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // QUEUE_DESCRIPTION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.queueDescription = iprot.readString();
              struct.setQueueDescriptionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // MAX_RUN_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.maxRunTime = iprot.readI32();
              struct.setMaxRunTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // MAX_NODES
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.maxNodes = iprot.readI32();
              struct.setMaxNodesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // MAX_PROCESSORS
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.maxProcessors = iprot.readI32();
              struct.setMaxProcessorsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // MAX_JOBS_IN_QUEUE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.maxJobsInQueue = iprot.readI32();
              struct.setMaxJobsInQueueIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // MAX_MEMORY
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.maxMemory = iprot.readI32();
              struct.setMaxMemoryIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, BatchQueue struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.queueName != null) {
        oprot.writeFieldBegin(QUEUE_NAME_FIELD_DESC);
        oprot.writeString(struct.queueName);
        oprot.writeFieldEnd();
      }
      if (struct.queueDescription != null) {
        if (struct.isSetQueueDescription()) {
          oprot.writeFieldBegin(QUEUE_DESCRIPTION_FIELD_DESC);
          oprot.writeString(struct.queueDescription);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetMaxRunTime()) {
        oprot.writeFieldBegin(MAX_RUN_TIME_FIELD_DESC);
        oprot.writeI32(struct.maxRunTime);
        oprot.writeFieldEnd();
      }
      if (struct.isSetMaxNodes()) {
        oprot.writeFieldBegin(MAX_NODES_FIELD_DESC);
        oprot.writeI32(struct.maxNodes);
        oprot.writeFieldEnd();
      }
      if (struct.isSetMaxProcessors()) {
        oprot.writeFieldBegin(MAX_PROCESSORS_FIELD_DESC);
        oprot.writeI32(struct.maxProcessors);
        oprot.writeFieldEnd();
      }
      if (struct.isSetMaxJobsInQueue()) {
        oprot.writeFieldBegin(MAX_JOBS_IN_QUEUE_FIELD_DESC);
        oprot.writeI32(struct.maxJobsInQueue);
        oprot.writeFieldEnd();
      }
      if (struct.isSetMaxMemory()) {
        oprot.writeFieldBegin(MAX_MEMORY_FIELD_DESC);
        oprot.writeI32(struct.maxMemory);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class BatchQueueTupleSchemeFactory implements SchemeFactory {
    public BatchQueueTupleScheme getScheme() {
      return new BatchQueueTupleScheme();
    }
  }

  private static class BatchQueueTupleScheme extends TupleScheme<BatchQueue> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, BatchQueue struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.queueName);
      BitSet optionals = new BitSet();
      if (struct.isSetQueueDescription()) {
        optionals.set(0);
      }
      if (struct.isSetMaxRunTime()) {
        optionals.set(1);
      }
      if (struct.isSetMaxNodes()) {
        optionals.set(2);
      }
      if (struct.isSetMaxProcessors()) {
        optionals.set(3);
      }
      if (struct.isSetMaxJobsInQueue()) {
        optionals.set(4);
      }
      if (struct.isSetMaxMemory()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetQueueDescription()) {
        oprot.writeString(struct.queueDescription);
      }
      if (struct.isSetMaxRunTime()) {
        oprot.writeI32(struct.maxRunTime);
      }
      if (struct.isSetMaxNodes()) {
        oprot.writeI32(struct.maxNodes);
      }
      if (struct.isSetMaxProcessors()) {
        oprot.writeI32(struct.maxProcessors);
      }
      if (struct.isSetMaxJobsInQueue()) {
        oprot.writeI32(struct.maxJobsInQueue);
      }
      if (struct.isSetMaxMemory()) {
        oprot.writeI32(struct.maxMemory);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, BatchQueue struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.queueName = iprot.readString();
      struct.setQueueNameIsSet(true);
      BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.queueDescription = iprot.readString();
        struct.setQueueDescriptionIsSet(true);
      }
      if (incoming.get(1)) {
        struct.maxRunTime = iprot.readI32();
        struct.setMaxRunTimeIsSet(true);
      }
      if (incoming.get(2)) {
        struct.maxNodes = iprot.readI32();
        struct.setMaxNodesIsSet(true);
      }
      if (incoming.get(3)) {
        struct.maxProcessors = iprot.readI32();
        struct.setMaxProcessorsIsSet(true);
      }
      if (incoming.get(4)) {
        struct.maxJobsInQueue = iprot.readI32();
        struct.setMaxJobsInQueueIsSet(true);
      }
      if (incoming.get(5)) {
        struct.maxMemory = iprot.readI32();
        struct.setMaxMemoryIsSet(true);
      }
    }
  }

}

