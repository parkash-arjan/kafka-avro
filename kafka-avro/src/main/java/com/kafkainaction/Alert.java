/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.kafkainaction;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Alert extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 6603519530490577601L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Alert\",\"namespace\":\"com.kafkainaction\",\"fields\":[{\"name\":\"sensor_id\",\"type\":\"long\",\"doc\":\"The unique id that identifies the sensor\"},{\"name\":\"time\",\"type\":\"long\",\"doc\":\"Time the alert was generated as UTC milliseconds from the epoch\"},{\"name\":\"status\",\"type\":{\"type\":\"enum\",\"name\":\"alert_status\",\"symbols\":[\"Critical\",\"Major\",\"Minor\",\"Warning\"]},\"doc\":\"The allowed values that our sensors will use to emit current status\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Alert> ENCODER =
      new BinaryMessageEncoder<Alert>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Alert> DECODER =
      new BinaryMessageDecoder<Alert>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<Alert> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<Alert> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Alert>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this Alert to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a Alert from a ByteBuffer. */
  public static Alert fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  /** The unique id that identifies the sensor */
  @Deprecated public long sensor_id;
  /** Time the alert was generated as UTC milliseconds from the epoch */
  @Deprecated public long time;
  /** The allowed values that our sensors will use to emit current status */
  @Deprecated public com.kafkainaction.alert_status status;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Alert() {}

  /**
   * All-args constructor.
   * @param sensor_id The unique id that identifies the sensor
   * @param time Time the alert was generated as UTC milliseconds from the epoch
   * @param status The allowed values that our sensors will use to emit current status
   */
  public Alert(java.lang.Long sensor_id, java.lang.Long time, com.kafkainaction.alert_status status) {
    this.sensor_id = sensor_id;
    this.time = time;
    this.status = status;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return sensor_id;
    case 1: return time;
    case 2: return status;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: sensor_id = (java.lang.Long)value$; break;
    case 1: time = (java.lang.Long)value$; break;
    case 2: status = (com.kafkainaction.alert_status)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'sensor_id' field.
   * @return The unique id that identifies the sensor
   */
  public java.lang.Long getSensorId() {
    return sensor_id;
  }

  /**
   * Sets the value of the 'sensor_id' field.
   * The unique id that identifies the sensor
   * @param value the value to set.
   */
  public void setSensorId(java.lang.Long value) {
    this.sensor_id = value;
  }

  /**
   * Gets the value of the 'time' field.
   * @return Time the alert was generated as UTC milliseconds from the epoch
   */
  public java.lang.Long getTime() {
    return time;
  }

  /**
   * Sets the value of the 'time' field.
   * Time the alert was generated as UTC milliseconds from the epoch
   * @param value the value to set.
   */
  public void setTime(java.lang.Long value) {
    this.time = value;
  }

  /**
   * Gets the value of the 'status' field.
   * @return The allowed values that our sensors will use to emit current status
   */
  public com.kafkainaction.alert_status getStatus() {
    return status;
  }

  /**
   * Sets the value of the 'status' field.
   * The allowed values that our sensors will use to emit current status
   * @param value the value to set.
   */
  public void setStatus(com.kafkainaction.alert_status value) {
    this.status = value;
  }

  /**
   * Creates a new Alert RecordBuilder.
   * @return A new Alert RecordBuilder
   */
  public static com.kafkainaction.Alert.Builder newBuilder() {
    return new com.kafkainaction.Alert.Builder();
  }

  /**
   * Creates a new Alert RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Alert RecordBuilder
   */
  public static com.kafkainaction.Alert.Builder newBuilder(com.kafkainaction.Alert.Builder other) {
    return new com.kafkainaction.Alert.Builder(other);
  }

  /**
   * Creates a new Alert RecordBuilder by copying an existing Alert instance.
   * @param other The existing instance to copy.
   * @return A new Alert RecordBuilder
   */
  public static com.kafkainaction.Alert.Builder newBuilder(com.kafkainaction.Alert other) {
    return new com.kafkainaction.Alert.Builder(other);
  }

  /**
   * RecordBuilder for Alert instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Alert>
    implements org.apache.avro.data.RecordBuilder<Alert> {

    /** The unique id that identifies the sensor */
    private long sensor_id;
    /** Time the alert was generated as UTC milliseconds from the epoch */
    private long time;
    /** The allowed values that our sensors will use to emit current status */
    private com.kafkainaction.alert_status status;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.kafkainaction.Alert.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.sensor_id)) {
        this.sensor_id = data().deepCopy(fields()[0].schema(), other.sensor_id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.time)) {
        this.time = data().deepCopy(fields()[1].schema(), other.time);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.status)) {
        this.status = data().deepCopy(fields()[2].schema(), other.status);
        fieldSetFlags()[2] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing Alert instance
     * @param other The existing instance to copy.
     */
    private Builder(com.kafkainaction.Alert other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.sensor_id)) {
        this.sensor_id = data().deepCopy(fields()[0].schema(), other.sensor_id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.time)) {
        this.time = data().deepCopy(fields()[1].schema(), other.time);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.status)) {
        this.status = data().deepCopy(fields()[2].schema(), other.status);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'sensor_id' field.
      * The unique id that identifies the sensor
      * @return The value.
      */
    public java.lang.Long getSensorId() {
      return sensor_id;
    }

    /**
      * Sets the value of the 'sensor_id' field.
      * The unique id that identifies the sensor
      * @param value The value of 'sensor_id'.
      * @return This builder.
      */
    public com.kafkainaction.Alert.Builder setSensorId(long value) {
      validate(fields()[0], value);
      this.sensor_id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'sensor_id' field has been set.
      * The unique id that identifies the sensor
      * @return True if the 'sensor_id' field has been set, false otherwise.
      */
    public boolean hasSensorId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'sensor_id' field.
      * The unique id that identifies the sensor
      * @return This builder.
      */
    public com.kafkainaction.Alert.Builder clearSensorId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'time' field.
      * Time the alert was generated as UTC milliseconds from the epoch
      * @return The value.
      */
    public java.lang.Long getTime() {
      return time;
    }

    /**
      * Sets the value of the 'time' field.
      * Time the alert was generated as UTC milliseconds from the epoch
      * @param value The value of 'time'.
      * @return This builder.
      */
    public com.kafkainaction.Alert.Builder setTime(long value) {
      validate(fields()[1], value);
      this.time = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'time' field has been set.
      * Time the alert was generated as UTC milliseconds from the epoch
      * @return True if the 'time' field has been set, false otherwise.
      */
    public boolean hasTime() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'time' field.
      * Time the alert was generated as UTC milliseconds from the epoch
      * @return This builder.
      */
    public com.kafkainaction.Alert.Builder clearTime() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'status' field.
      * The allowed values that our sensors will use to emit current status
      * @return The value.
      */
    public com.kafkainaction.alert_status getStatus() {
      return status;
    }

    /**
      * Sets the value of the 'status' field.
      * The allowed values that our sensors will use to emit current status
      * @param value The value of 'status'.
      * @return This builder.
      */
    public com.kafkainaction.Alert.Builder setStatus(com.kafkainaction.alert_status value) {
      validate(fields()[2], value);
      this.status = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'status' field has been set.
      * The allowed values that our sensors will use to emit current status
      * @return True if the 'status' field has been set, false otherwise.
      */
    public boolean hasStatus() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'status' field.
      * The allowed values that our sensors will use to emit current status
      * @return This builder.
      */
    public com.kafkainaction.Alert.Builder clearStatus() {
      status = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Alert build() {
      try {
        Alert record = new Alert();
        record.sensor_id = fieldSetFlags()[0] ? this.sensor_id : (java.lang.Long) defaultValue(fields()[0]);
        record.time = fieldSetFlags()[1] ? this.time : (java.lang.Long) defaultValue(fields()[1]);
        record.status = fieldSetFlags()[2] ? this.status : (com.kafkainaction.alert_status) defaultValue(fields()[2]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Alert>
    WRITER$ = (org.apache.avro.io.DatumWriter<Alert>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Alert>
    READER$ = (org.apache.avro.io.DatumReader<Alert>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
