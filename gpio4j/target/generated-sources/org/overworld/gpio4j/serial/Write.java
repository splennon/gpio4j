// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: serial.proto
// Protobuf Java Version: 4.27.3

package org.overworld.gpio4j.serial;

/**
 * Protobuf type {@code serial.Write}
 */
public final class Write extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:serial.Write)
    WriteOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 3,
      /* suffix= */ "",
      Write.class.getName());
  }
  // Use Write.newBuilder() to construct.
  private Write(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private Write() {
    data_ = java.util.Collections.emptyList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.overworld.gpio4j.serial.SerialProtos.internal_static_serial_Write_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.overworld.gpio4j.serial.SerialProtos.internal_static_serial_Write_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.overworld.gpio4j.serial.Write.class, org.overworld.gpio4j.serial.Write.Builder.class);
  }

  public static final int DATA_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<org.overworld.gpio4j.serial.BoundData> data_;
  /**
   * <code>repeated .serial.BoundData data = 1;</code>
   */
  @java.lang.Override
  public java.util.List<org.overworld.gpio4j.serial.BoundData> getDataList() {
    return data_;
  }
  /**
   * <code>repeated .serial.BoundData data = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends org.overworld.gpio4j.serial.BoundDataOrBuilder> 
      getDataOrBuilderList() {
    return data_;
  }
  /**
   * <code>repeated .serial.BoundData data = 1;</code>
   */
  @java.lang.Override
  public int getDataCount() {
    return data_.size();
  }
  /**
   * <code>repeated .serial.BoundData data = 1;</code>
   */
  @java.lang.Override
  public org.overworld.gpio4j.serial.BoundData getData(int index) {
    return data_.get(index);
  }
  /**
   * <code>repeated .serial.BoundData data = 1;</code>
   */
  @java.lang.Override
  public org.overworld.gpio4j.serial.BoundDataOrBuilder getDataOrBuilder(
      int index) {
    return data_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < data_.size(); i++) {
      output.writeMessage(1, data_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < data_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, data_.get(i));
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.overworld.gpio4j.serial.Write)) {
      return super.equals(obj);
    }
    org.overworld.gpio4j.serial.Write other = (org.overworld.gpio4j.serial.Write) obj;

    if (!getDataList()
        .equals(other.getDataList())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getDataCount() > 0) {
      hash = (37 * hash) + DATA_FIELD_NUMBER;
      hash = (53 * hash) + getDataList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.overworld.gpio4j.serial.Write parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.overworld.gpio4j.serial.Write parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.overworld.gpio4j.serial.Write parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.overworld.gpio4j.serial.Write parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.overworld.gpio4j.serial.Write parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.overworld.gpio4j.serial.Write parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.overworld.gpio4j.serial.Write parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static org.overworld.gpio4j.serial.Write parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static org.overworld.gpio4j.serial.Write parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static org.overworld.gpio4j.serial.Write parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.overworld.gpio4j.serial.Write parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static org.overworld.gpio4j.serial.Write parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.overworld.gpio4j.serial.Write prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code serial.Write}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:serial.Write)
      org.overworld.gpio4j.serial.WriteOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.overworld.gpio4j.serial.SerialProtos.internal_static_serial_Write_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.overworld.gpio4j.serial.SerialProtos.internal_static_serial_Write_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.overworld.gpio4j.serial.Write.class, org.overworld.gpio4j.serial.Write.Builder.class);
    }

    // Construct using org.overworld.gpio4j.serial.Write.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (dataBuilder_ == null) {
        data_ = java.util.Collections.emptyList();
      } else {
        data_ = null;
        dataBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.overworld.gpio4j.serial.SerialProtos.internal_static_serial_Write_descriptor;
    }

    @java.lang.Override
    public org.overworld.gpio4j.serial.Write getDefaultInstanceForType() {
      return org.overworld.gpio4j.serial.Write.getDefaultInstance();
    }

    @java.lang.Override
    public org.overworld.gpio4j.serial.Write build() {
      org.overworld.gpio4j.serial.Write result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.overworld.gpio4j.serial.Write buildPartial() {
      org.overworld.gpio4j.serial.Write result = new org.overworld.gpio4j.serial.Write(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(org.overworld.gpio4j.serial.Write result) {
      if (dataBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          data_ = java.util.Collections.unmodifiableList(data_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.data_ = data_;
      } else {
        result.data_ = dataBuilder_.build();
      }
    }

    private void buildPartial0(org.overworld.gpio4j.serial.Write result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.overworld.gpio4j.serial.Write) {
        return mergeFrom((org.overworld.gpio4j.serial.Write)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.overworld.gpio4j.serial.Write other) {
      if (other == org.overworld.gpio4j.serial.Write.getDefaultInstance()) return this;
      if (dataBuilder_ == null) {
        if (!other.data_.isEmpty()) {
          if (data_.isEmpty()) {
            data_ = other.data_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureDataIsMutable();
            data_.addAll(other.data_);
          }
          onChanged();
        }
      } else {
        if (!other.data_.isEmpty()) {
          if (dataBuilder_.isEmpty()) {
            dataBuilder_.dispose();
            dataBuilder_ = null;
            data_ = other.data_;
            bitField0_ = (bitField0_ & ~0x00000001);
            dataBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getDataFieldBuilder() : null;
          } else {
            dataBuilder_.addAllMessages(other.data_);
          }
        }
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              org.overworld.gpio4j.serial.BoundData m =
                  input.readMessage(
                      org.overworld.gpio4j.serial.BoundData.parser(),
                      extensionRegistry);
              if (dataBuilder_ == null) {
                ensureDataIsMutable();
                data_.add(m);
              } else {
                dataBuilder_.addMessage(m);
              }
              break;
            } // case 10
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.util.List<org.overworld.gpio4j.serial.BoundData> data_ =
      java.util.Collections.emptyList();
    private void ensureDataIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        data_ = new java.util.ArrayList<org.overworld.gpio4j.serial.BoundData>(data_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        org.overworld.gpio4j.serial.BoundData, org.overworld.gpio4j.serial.BoundData.Builder, org.overworld.gpio4j.serial.BoundDataOrBuilder> dataBuilder_;

    /**
     * <code>repeated .serial.BoundData data = 1;</code>
     */
    public java.util.List<org.overworld.gpio4j.serial.BoundData> getDataList() {
      if (dataBuilder_ == null) {
        return java.util.Collections.unmodifiableList(data_);
      } else {
        return dataBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .serial.BoundData data = 1;</code>
     */
    public int getDataCount() {
      if (dataBuilder_ == null) {
        return data_.size();
      } else {
        return dataBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .serial.BoundData data = 1;</code>
     */
    public org.overworld.gpio4j.serial.BoundData getData(int index) {
      if (dataBuilder_ == null) {
        return data_.get(index);
      } else {
        return dataBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .serial.BoundData data = 1;</code>
     */
    public Builder setData(
        int index, org.overworld.gpio4j.serial.BoundData value) {
      if (dataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDataIsMutable();
        data_.set(index, value);
        onChanged();
      } else {
        dataBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .serial.BoundData data = 1;</code>
     */
    public Builder setData(
        int index, org.overworld.gpio4j.serial.BoundData.Builder builderForValue) {
      if (dataBuilder_ == null) {
        ensureDataIsMutable();
        data_.set(index, builderForValue.build());
        onChanged();
      } else {
        dataBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .serial.BoundData data = 1;</code>
     */
    public Builder addData(org.overworld.gpio4j.serial.BoundData value) {
      if (dataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDataIsMutable();
        data_.add(value);
        onChanged();
      } else {
        dataBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .serial.BoundData data = 1;</code>
     */
    public Builder addData(
        int index, org.overworld.gpio4j.serial.BoundData value) {
      if (dataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDataIsMutable();
        data_.add(index, value);
        onChanged();
      } else {
        dataBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .serial.BoundData data = 1;</code>
     */
    public Builder addData(
        org.overworld.gpio4j.serial.BoundData.Builder builderForValue) {
      if (dataBuilder_ == null) {
        ensureDataIsMutable();
        data_.add(builderForValue.build());
        onChanged();
      } else {
        dataBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .serial.BoundData data = 1;</code>
     */
    public Builder addData(
        int index, org.overworld.gpio4j.serial.BoundData.Builder builderForValue) {
      if (dataBuilder_ == null) {
        ensureDataIsMutable();
        data_.add(index, builderForValue.build());
        onChanged();
      } else {
        dataBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .serial.BoundData data = 1;</code>
     */
    public Builder addAllData(
        java.lang.Iterable<? extends org.overworld.gpio4j.serial.BoundData> values) {
      if (dataBuilder_ == null) {
        ensureDataIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, data_);
        onChanged();
      } else {
        dataBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .serial.BoundData data = 1;</code>
     */
    public Builder clearData() {
      if (dataBuilder_ == null) {
        data_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        dataBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .serial.BoundData data = 1;</code>
     */
    public Builder removeData(int index) {
      if (dataBuilder_ == null) {
        ensureDataIsMutable();
        data_.remove(index);
        onChanged();
      } else {
        dataBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .serial.BoundData data = 1;</code>
     */
    public org.overworld.gpio4j.serial.BoundData.Builder getDataBuilder(
        int index) {
      return getDataFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .serial.BoundData data = 1;</code>
     */
    public org.overworld.gpio4j.serial.BoundDataOrBuilder getDataOrBuilder(
        int index) {
      if (dataBuilder_ == null) {
        return data_.get(index);  } else {
        return dataBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .serial.BoundData data = 1;</code>
     */
    public java.util.List<? extends org.overworld.gpio4j.serial.BoundDataOrBuilder> 
         getDataOrBuilderList() {
      if (dataBuilder_ != null) {
        return dataBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(data_);
      }
    }
    /**
     * <code>repeated .serial.BoundData data = 1;</code>
     */
    public org.overworld.gpio4j.serial.BoundData.Builder addDataBuilder() {
      return getDataFieldBuilder().addBuilder(
          org.overworld.gpio4j.serial.BoundData.getDefaultInstance());
    }
    /**
     * <code>repeated .serial.BoundData data = 1;</code>
     */
    public org.overworld.gpio4j.serial.BoundData.Builder addDataBuilder(
        int index) {
      return getDataFieldBuilder().addBuilder(
          index, org.overworld.gpio4j.serial.BoundData.getDefaultInstance());
    }
    /**
     * <code>repeated .serial.BoundData data = 1;</code>
     */
    public java.util.List<org.overworld.gpio4j.serial.BoundData.Builder> 
         getDataBuilderList() {
      return getDataFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        org.overworld.gpio4j.serial.BoundData, org.overworld.gpio4j.serial.BoundData.Builder, org.overworld.gpio4j.serial.BoundDataOrBuilder> 
        getDataFieldBuilder() {
      if (dataBuilder_ == null) {
        dataBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            org.overworld.gpio4j.serial.BoundData, org.overworld.gpio4j.serial.BoundData.Builder, org.overworld.gpio4j.serial.BoundDataOrBuilder>(
                data_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        data_ = null;
      }
      return dataBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:serial.Write)
  }

  // @@protoc_insertion_point(class_scope:serial.Write)
  private static final org.overworld.gpio4j.serial.Write DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.overworld.gpio4j.serial.Write();
  }

  public static org.overworld.gpio4j.serial.Write getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Write>
      PARSER = new com.google.protobuf.AbstractParser<Write>() {
    @java.lang.Override
    public Write parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<Write> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Write> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.overworld.gpio4j.serial.Write getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

