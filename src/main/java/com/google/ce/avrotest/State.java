package com.google.ce.avrotest;

/*
 * Copyright 2021 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * Autogenerated by Avro
 *
 * <p>DO NOT EDIT DIRECTLY
 */

/**
 * This file is created using Avro tools.
 *
 * <p>To download, visit https://avro.apache.org/releases.html#Download
 *
 * <p>Run the following command from the `samples/snippets` directory to generate this class:
 *
 * <p>`java -jar /location/to/your/avro-tools-1.10.1.jar compile schema
 * src/main/resources/us-states.avsc src/main/java/`
 */


import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.SchemaStore;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;

/** A list of states in the United States of America. */
@org.apache.avro.specific.AvroGenerated
public class State extends org.apache.avro.specific.SpecificRecordBase
    implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -6098929419967278282L;
  public static final org.apache.avro.Schema SCHEMA$ =
      new org.apache.avro.Schema.Parser()
          .parse(
              "{\"type\":\"record\",\"name\":\"State\",\"namespace\":\"utilities\",\"doc\":\"A list of states in the United States of America.\",\"fields\":[{\"name\":\"name\",\"type\":\"string\",\"doc\":\"The common name of the state.\"},{\"name\":\"post_abbr\",\"type\":\"string\",\"doc\":\"The postal code abbreviation of the state.\"}]}");

  public static org.apache.avro.Schema getClassSchema() {
    return SCHEMA$;
  }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<State> ENCODER =
      new BinaryMessageEncoder<State>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<State> DECODER =
      new BinaryMessageDecoder<State>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   *
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<State> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   *
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<State> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link
   * SchemaStore}.
   *
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<State> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<State>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this State to a ByteBuffer.
   *
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a State from a ByteBuffer.
   *
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a State instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of
   *     this class
   */
  public static State fromByteBuffer(java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  /** The common name of the state. */
  private java.lang.CharSequence name;
  /** The postal code abbreviation of the state. */
  private java.lang.CharSequence post_abbr;

  /**
   * Default constructor. Note that this does not initialize fields to their default values from the
   * schema. If that is desired then one should use <code>newBuilder()</code>.
   */
  public State() {}

  /**
   * All-args constructor.
   *
   * @param name The common name of the state.
   * @param post_abbr The postal code abbreviation of the state.
   */
  public State(java.lang.CharSequence name, java.lang.CharSequence post_abbr) {
    this.name = name;
    this.post_abbr = post_abbr;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() {
    return MODEL$;
  }

  public org.apache.avro.Schema getSchema() {
    return SCHEMA$;
  }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
      case 0:
        return name;
      case 1:
        return post_abbr;
      default:
        throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value = "unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
      case 0:
        name = (java.lang.CharSequence) value$;
        break;
      case 1:
        post_abbr = (java.lang.CharSequence) value$;
        break;
      default:
        throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'name' field.
   *
   * @return The common name of the state.
   */
  public java.lang.CharSequence getName() {
    return name;
  }

  /**
   * Sets the value of the 'name' field. The common name of the state.
   *
   * @param value the value to set.
   */
  public void setName(java.lang.CharSequence value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'post_abbr' field.
   *
   * @return The postal code abbreviation of the state.
   */
  public java.lang.CharSequence getPostAbbr() {
    return post_abbr;
  }

  /**
   * Sets the value of the 'post_abbr' field. The postal code abbreviation of the state.
   *
   * @param value the value to set.
   */
  public void setPostAbbr(java.lang.CharSequence value) {
    this.post_abbr = value;
  }

  /**
   * Creates a new State RecordBuilder.
   *
   * @return A new State RecordBuilder
   */
  public static State.Builder newBuilder() {
	  return new State.Builder();
    
  }

  /**
   * Creates a new State RecordBuilder by copying an existing Builder.
   *
   * @param other The existing builder to copy.
   * @return A new State RecordBuilder
   */
  public static State.Builder newBuilder(State.Builder other) {
    if (other == null) {
      return new State.Builder();
    } else {
      return new State.Builder(other);
    }
  }

  /**
   * Creates a new State RecordBuilder by copying an existing State instance.
   *
   * @param other The existing instance to copy.
   * @return A new State RecordBuilder
   */
  public static State.Builder newBuilder(State other) {
    if (other == null) {
      return new State.Builder();
    } else {
      return new State.Builder(other);
    }
  }

  /** RecordBuilder for State instances. */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<State>
      implements org.apache.avro.data.RecordBuilder<State> {

    /** The common name of the state. */
    private java.lang.CharSequence name;
    /** The postal code abbreviation of the state. */
    private java.lang.CharSequence post_abbr;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     *
     * @param other The existing Builder to copy.
     */
    private Builder(State.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.post_abbr)) {
        this.post_abbr = data().deepCopy(fields()[1].schema(), other.post_abbr);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
    }

    /**
     * Creates a Builder by copying an existing State instance
     *
     * @param other The existing instance to copy.
     */
    private Builder(State other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.post_abbr)) {
        this.post_abbr = data().deepCopy(fields()[1].schema(), other.post_abbr);
        fieldSetFlags()[1] = true;
      }
    }

    /**
     * Gets the value of the 'name' field. The common name of the state.
     *
     * @return The value.
     */
    public java.lang.CharSequence getName() {
      return name;
    }

    /**
     * Sets the value of the 'name' field. The common name of the state.
     *
     * @param value The value of 'name'.
     * @return This builder.
     */
    public State.Builder setName(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.name = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
     * Checks whether the 'name' field has been set. The common name of the state.
     *
     * @return True if the 'name' field has been set, false otherwise.
     */
    public boolean hasName() {
      return fieldSetFlags()[0];
    }

    /**
     * Clears the value of the 'name' field. The common name of the state.
     *
     * @return This builder.
     */
    public State.Builder clearName() {
      name = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
     * Gets the value of the 'post_abbr' field. The postal code abbreviation of the state.
     *
     * @return The value.
     */
    public java.lang.CharSequence getPostAbbr() {
      return post_abbr;
    }

    /**
     * Sets the value of the 'post_abbr' field. The postal code abbreviation of the state.
     *
     * @param value The value of 'post_abbr'.
     * @return This builder.
     */
    public State.Builder setPostAbbr(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.post_abbr = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
     * Checks whether the 'post_abbr' field has been set. The postal code abbreviation of the state.
     *
     * @return True if the 'post_abbr' field has been set, false otherwise.
     */
    public boolean hasPostAbbr() {
      return fieldSetFlags()[1];
    }

    /**
     * Clears the value of the 'post_abbr' field. The postal code abbreviation of the state.
     *
     * @return This builder.
     */
    public State.Builder clearPostAbbr() {
      post_abbr = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    
    @SuppressWarnings("unchecked")
    public State build() {
      try {
        State record = new State();
        record.name =
            fieldSetFlags()[0] ? this.name : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.post_abbr =
            fieldSetFlags()[1]
                ? this.post_abbr
                : (java.lang.CharSequence) defaultValue(fields()[1]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<State> WRITER$ =
      (org.apache.avro.io.DatumWriter<State>) MODEL$.createDatumWriter(SCHEMA$);

  @Override
  public void writeExternal(java.io.ObjectOutput out) throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<State> READER$ =
      (org.apache.avro.io.DatumReader<State>) MODEL$.createDatumReader(SCHEMA$);

  @Override
  public void readExternal(java.io.ObjectInput in) throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override
  protected boolean hasCustomCoders() {
    return true;
  }

  @Override
  public void customEncode(org.apache.avro.io.Encoder out) throws java.io.IOException {
    out.writeString(this.name);

    out.writeString(this.post_abbr);
  }

  @Override
  public void customDecode(org.apache.avro.io.ResolvingDecoder in) throws java.io.IOException {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.name = in.readString(this.name instanceof Utf8 ? (Utf8) this.name : null);

      this.post_abbr = in.readString(this.post_abbr instanceof Utf8 ? (Utf8) this.post_abbr : null);

    } else {
      for (int i = 0; i < 2; i++) {
        switch (fieldOrder[i].pos()) {
          case 0:
            this.name = in.readString(this.name instanceof Utf8 ? (Utf8) this.name : null);
            break;

          case 1:
            this.post_abbr =
                in.readString(this.post_abbr instanceof Utf8 ? (Utf8) this.post_abbr : null);
            break;

          default:
            throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}