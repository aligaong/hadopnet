// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: main/java/com/firecode/hadooptest/hbase/protobuf/CallRecord.proto

package com.firecode.hadooptest.hbase.protobuf;

public final class CallRecordBuilder {
  private CallRecordBuilder() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface CallRecordOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.firecode.hadooptest.hbase.protobuf.CallRecord)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required string dnumPhone = 1;</code>
     */
    java.lang.String getDnumPhone();
    /**
     * <code>required string dnumPhone = 1;</code>
     */
    com.google.protobuf.ByteString
        getDnumPhoneBytes();

    /**
     * <code>required string length = 2;</code>
     */
    boolean hasLength();
    /**
     * <code>required string length = 2;</code>
     */
    java.lang.String getLength();
    /**
     * <code>required string length = 2;</code>
     */
    com.google.protobuf.ByteString
        getLengthBytes();

    /**
     * <code>required string type = 3;</code>
     */
    boolean hasType();
    /**
     * <code>required string type = 3;</code>
     */
    java.lang.String getType();
    /**
     * <code>required string type = 3;</code>
     */
    com.google.protobuf.ByteString
        getTypeBytes();

    /**
     * <code>required string date = 4;</code>
     */
    boolean hasDate();
    /**
     * <code>required string date = 4;</code>
     */
    java.lang.String getDate();
    /**
     * <code>required string date = 4;</code>
     */
    com.google.protobuf.ByteString
        getDateBytes();
  }
  /**
   * Protobuf type {@code com.firecode.hadooptest.hbase.protobuf.CallRecord}
   *
   * <pre>
   *通话记录类(后面跟的是：属性名=顺序)
   * </pre>
   */
  public static final class CallRecord extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:com.firecode.hadooptest.hbase.protobuf.CallRecord)
      CallRecordOrBuilder {
    // Use CallRecord.newBuilder() to construct.
    private CallRecord(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private CallRecord(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final CallRecord defaultInstance;
    public static CallRecord getDefaultInstance() {
      return defaultInstance;
    }

    public CallRecord getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private CallRecord(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000001;
              dnumPhone_ = bs;
              break;
            }
            case 18: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000002;
              length_ = bs;
              break;
            }
            case 26: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000004;
              type_ = bs;
              break;
            }
            case 34: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000008;
              date_ = bs;
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.firecode.hadooptest.hbase.protobuf.CallRecordBuilder.internal_static_com_firecode_hadooptest_hbase_protobuf_CallRecord_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.firecode.hadooptest.hbase.protobuf.CallRecordBuilder.internal_static_com_firecode_hadooptest_hbase_protobuf_CallRecord_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.firecode.hadooptest.hbase.protobuf.CallRecordBuilder.CallRecord.class, com.firecode.hadooptest.hbase.protobuf.CallRecordBuilder.CallRecord.Builder.class);
    }

    public static com.google.protobuf.Parser<CallRecord> PARSER =
        new com.google.protobuf.AbstractParser<CallRecord>() {
      public CallRecord parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new CallRecord(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<CallRecord> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int DNUMPHONE_FIELD_NUMBER = 1;
    private java.lang.Object dnumPhone_;
    /**
     * <code>required string dnumPhone = 1;</code>
     */
    public boolean hasDnumPhone() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required string dnumPhone = 1;</code>
     */
    public java.lang.String getDnumPhone() {
      java.lang.Object ref = dnumPhone_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          dnumPhone_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string dnumPhone = 1;</code>
     */
    public com.google.protobuf.ByteString
        getDnumPhoneBytes() {
      java.lang.Object ref = dnumPhone_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        dnumPhone_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int LENGTH_FIELD_NUMBER = 2;
    private java.lang.Object length_;
    /**
     * <code>required string length = 2;</code>
     */
    public boolean hasLength() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required string length = 2;</code>
     */
    public java.lang.String getLength() {
      java.lang.Object ref = length_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          length_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string length = 2;</code>
     */
    public com.google.protobuf.ByteString
        getLengthBytes() {
      java.lang.Object ref = length_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        length_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int TYPE_FIELD_NUMBER = 3;
    private java.lang.Object type_;
    /**
     * <code>required string type = 3;</code>
     */
    public boolean hasType() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required string type = 3;</code>
     */
    public java.lang.String getType() {
      java.lang.Object ref = type_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          type_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string type = 3;</code>
     */
    public com.google.protobuf.ByteString
        getTypeBytes() {
      java.lang.Object ref = type_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        type_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int DATE_FIELD_NUMBER = 4;
    private java.lang.Object date_;
    /**
     * <code>required string date = 4;</code>
     */
    public boolean hasDate() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>required string date = 4;</code>
     */
    public java.lang.String getDate() {
      java.lang.Object ref = date_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          date_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string date = 4;</code>
     */
    public com.google.protobuf.ByteString
        getDateBytes() {
      java.lang.Object ref = date_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        date_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      dnumPhone_ = "";
      length_ = "";
      type_ = "";
      date_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasDnumPhone()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasLength()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasType()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasDate()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getDnumPhoneBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getLengthBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(3, getTypeBytes());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeBytes(4, getDateBytes());
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getDnumPhoneBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getLengthBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, getTypeBytes());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(4, getDateBytes());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static com.firecode.hadooptest.hbase.protobuf.CallRecordBuilder.CallRecord parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.firecode.hadooptest.hbase.protobuf.CallRecordBuilder.CallRecord parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.firecode.hadooptest.hbase.protobuf.CallRecordBuilder.CallRecord parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.firecode.hadooptest.hbase.protobuf.CallRecordBuilder.CallRecord parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.firecode.hadooptest.hbase.protobuf.CallRecordBuilder.CallRecord parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.firecode.hadooptest.hbase.protobuf.CallRecordBuilder.CallRecord parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.firecode.hadooptest.hbase.protobuf.CallRecordBuilder.CallRecord parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.firecode.hadooptest.hbase.protobuf.CallRecordBuilder.CallRecord parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.firecode.hadooptest.hbase.protobuf.CallRecordBuilder.CallRecord parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.firecode.hadooptest.hbase.protobuf.CallRecordBuilder.CallRecord parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.firecode.hadooptest.hbase.protobuf.CallRecordBuilder.CallRecord prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code com.firecode.hadooptest.hbase.protobuf.CallRecord}
     *
     * <pre>
     *通话记录类(后面跟的是：属性名=顺序)
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:com.firecode.hadooptest.hbase.protobuf.CallRecord)
        com.firecode.hadooptest.hbase.protobuf.CallRecordBuilder.CallRecordOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.firecode.hadooptest.hbase.protobuf.CallRecordBuilder.internal_static_com_firecode_hadooptest_hbase_protobuf_CallRecord_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.firecode.hadooptest.hbase.protobuf.CallRecordBuilder.internal_static_com_firecode_hadooptest_hbase_protobuf_CallRecord_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.firecode.hadooptest.hbase.protobuf.CallRecordBuilder.CallRecord.class, com.firecode.hadooptest.hbase.protobuf.CallRecordBuilder.CallRecord.Builder.class);
      }

      // Construct using com.firecode.hadooptest.hbase.protobuf.CallRecordBuilder.CallRecord.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        dnumPhone_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        length_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        type_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        date_ = "";
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.firecode.hadooptest.hbase.protobuf.CallRecordBuilder.internal_static_com_firecode_hadooptest_hbase_protobuf_CallRecord_descriptor;
      }

      public com.firecode.hadooptest.hbase.protobuf.CallRecordBuilder.CallRecord getDefaultInstanceForType() {
        return com.firecode.hadooptest.hbase.protobuf.CallRecordBuilder.CallRecord.getDefaultInstance();
      }

      public com.firecode.hadooptest.hbase.protobuf.CallRecordBuilder.CallRecord build() {
        com.firecode.hadooptest.hbase.protobuf.CallRecordBuilder.CallRecord result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.firecode.hadooptest.hbase.protobuf.CallRecordBuilder.CallRecord buildPartial() {
        com.firecode.hadooptest.hbase.protobuf.CallRecordBuilder.CallRecord result = new com.firecode.hadooptest.hbase.protobuf.CallRecordBuilder.CallRecord(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.dnumPhone_ = dnumPhone_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.length_ = length_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.type_ = type_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.date_ = date_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.firecode.hadooptest.hbase.protobuf.CallRecordBuilder.CallRecord) {
          return mergeFrom((com.firecode.hadooptest.hbase.protobuf.CallRecordBuilder.CallRecord)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.firecode.hadooptest.hbase.protobuf.CallRecordBuilder.CallRecord other) {
        if (other == com.firecode.hadooptest.hbase.protobuf.CallRecordBuilder.CallRecord.getDefaultInstance()) return this;
        if (other.hasDnumPhone()) {
          bitField0_ |= 0x00000001;
          dnumPhone_ = other.dnumPhone_;
          onChanged();
        }
        if (other.hasLength()) {
          bitField0_ |= 0x00000002;
          length_ = other.length_;
          onChanged();
        }
        if (other.hasType()) {
          bitField0_ |= 0x00000004;
          type_ = other.type_;
          onChanged();
        }
        if (other.hasDate()) {
          bitField0_ |= 0x00000008;
          date_ = other.date_;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasDnumPhone()) {
          
          return false;
        }
        if (!hasLength()) {
          
          return false;
        }
        if (!hasType()) {
          
          return false;
        }
        if (!hasDate()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.firecode.hadooptest.hbase.protobuf.CallRecordBuilder.CallRecord parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.firecode.hadooptest.hbase.protobuf.CallRecordBuilder.CallRecord) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object dnumPhone_ = "";
      /**
       * <code>required string dnumPhone = 1;</code>
       */
      public boolean hasDnumPhone() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required string dnumPhone = 1;</code>
       */
      public java.lang.String getDnumPhone() {
        java.lang.Object ref = dnumPhone_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            dnumPhone_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string dnumPhone = 1;</code>
       */
      public com.google.protobuf.ByteString
          getDnumPhoneBytes() {
        java.lang.Object ref = dnumPhone_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          dnumPhone_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string dnumPhone = 1;</code>
       */
      public Builder setDnumPhone(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        dnumPhone_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string dnumPhone = 1;</code>
       */
      public Builder clearDnumPhone() {
        bitField0_ = (bitField0_ & ~0x00000001);
        dnumPhone_ = getDefaultInstance().getDnumPhone();
        onChanged();
        return this;
      }
      /**
       * <code>required string dnumPhone = 1;</code>
       */
      public Builder setDnumPhoneBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        dnumPhone_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object length_ = "";
      /**
       * <code>required string length = 2;</code>
       */
      public boolean hasLength() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required string length = 2;</code>
       */
      public java.lang.String getLength() {
        java.lang.Object ref = length_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            length_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string length = 2;</code>
       */
      public com.google.protobuf.ByteString
          getLengthBytes() {
        java.lang.Object ref = length_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          length_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string length = 2;</code>
       */
      public Builder setLength(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        length_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string length = 2;</code>
       */
      public Builder clearLength() {
        bitField0_ = (bitField0_ & ~0x00000002);
        length_ = getDefaultInstance().getLength();
        onChanged();
        return this;
      }
      /**
       * <code>required string length = 2;</code>
       */
      public Builder setLengthBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        length_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object type_ = "";
      /**
       * <code>required string type = 3;</code>
       */
      public boolean hasType() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>required string type = 3;</code>
       */
      public java.lang.String getType() {
        java.lang.Object ref = type_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            type_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string type = 3;</code>
       */
      public com.google.protobuf.ByteString
          getTypeBytes() {
        java.lang.Object ref = type_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          type_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string type = 3;</code>
       */
      public Builder setType(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        type_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string type = 3;</code>
       */
      public Builder clearType() {
        bitField0_ = (bitField0_ & ~0x00000004);
        type_ = getDefaultInstance().getType();
        onChanged();
        return this;
      }
      /**
       * <code>required string type = 3;</code>
       */
      public Builder setTypeBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        type_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object date_ = "";
      /**
       * <code>required string date = 4;</code>
       */
      public boolean hasDate() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>required string date = 4;</code>
       */
      public java.lang.String getDate() {
        java.lang.Object ref = date_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            date_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string date = 4;</code>
       */
      public com.google.protobuf.ByteString
          getDateBytes() {
        java.lang.Object ref = date_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          date_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string date = 4;</code>
       */
      public Builder setDate(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        date_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string date = 4;</code>
       */
      public Builder clearDate() {
        bitField0_ = (bitField0_ & ~0x00000008);
        date_ = getDefaultInstance().getDate();
        onChanged();
        return this;
      }
      /**
       * <code>required string date = 4;</code>
       */
      public Builder setDateBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        date_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:com.firecode.hadooptest.hbase.protobuf.CallRecord)
    }

    static {
      defaultInstance = new CallRecord(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:com.firecode.hadooptest.hbase.protobuf.CallRecord)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_firecode_hadooptest_hbase_protobuf_CallRecord_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_firecode_hadooptest_hbase_protobuf_CallRecord_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nAmain/java/com/firecode/hadooptest/hbas" +
      "e/protobuf/CallRecord.proto\022&com.firecod" +
      "e.hadooptest.hbase.protobuf\"K\n\nCallRecor" +
      "d\022\021\n\tdnumPhone\030\001 \002(\t\022\016\n\006length\030\002 \002(\t\022\014\n\004" +
      "type\030\003 \002(\t\022\014\n\004date\030\004 \002(\tB;\n&com.firecode" +
      ".hadooptest.hbase.protobufB\021CallRecordBu" +
      "ilder"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_com_firecode_hadooptest_hbase_protobuf_CallRecord_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_firecode_hadooptest_hbase_protobuf_CallRecord_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_firecode_hadooptest_hbase_protobuf_CallRecord_descriptor,
        new java.lang.String[] { "DnumPhone", "Length", "Type", "Date", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
