// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: google/protobuf/api.proto
// Protobuf Java Version: 4.27.3

package com.google.protobuf;

/**
 * <pre>
 * Declares an API Interface to be included in this interface. The including
 * interface must redeclare all the methods from the included interface, but
 * documentation and options are inherited as follows:
 *
 * - If after comment and whitespace stripping, the documentation
 * string of the redeclared method is empty, it will be inherited
 * from the original method.
 *
 * - Each annotation belonging to the service config (http,
 * visibility) which is not set in the redeclared method will be
 * inherited.
 *
 * - If an http annotation is inherited, the path pattern will be
 * modified as follows. Any version prefix will be replaced by the
 * version of the including interface plus the [root][] path if
 * specified.
 *
 * Example of a simple mixin:
 *
 * package google.acl.v1;
 * service AccessControl {
 * // Get the underlying ACL object.
 * rpc GetAcl(GetAclRequest) returns (Acl) {
 * option (google.api.http).get = "/v1/{resource=**}:getAcl";
 * }
 * }
 *
 * package google.storage.v2;
 * service Storage {
 * rpc GetAcl(GetAclRequest) returns (Acl);
 *
 * // Get a data record.
 * rpc GetData(GetDataRequest) returns (Data) {
 * option (google.api.http).get = "/v2/{resource=**}";
 * }
 * }
 *
 * Example of a mixin configuration:
 *
 * apis:
 * - name: google.storage.v2.Storage
 * mixins:
 * - name: google.acl.v1.AccessControl
 *
 * The mixin construct implies that all methods in `AccessControl` are
 * also declared with same name and request/response types in
 * `Storage`. A documentation generator or annotation processor will
 * see the effective `Storage.GetAcl` method after inherting
 * documentation and annotations as follows:
 *
 * service Storage {
 * // Get the underlying ACL object.
 * rpc GetAcl(GetAclRequest) returns (Acl) {
 * option (google.api.http).get = "/v2/{resource=**}:getAcl";
 * }
 * ...
 * }
 *
 * Note how the version in the path pattern changed from `v1` to `v2`.
 *
 * If the `root` field in the mixin is specified, it should be a
 * relative path under which inherited HTTP paths are placed. Example:
 *
 * apis:
 * - name: google.storage.v2.Storage
 * mixins:
 * - name: google.acl.v1.AccessControl
 * root: acls
 *
 * This implies the following inherited HTTP annotation:
 *
 * service Storage {
 * // Get the underlying ACL object.
 * rpc GetAcl(GetAclRequest) returns (Acl) {
 * option (google.api.http).get = "/v2/acls/{resource=**}:getAcl";
 * }
 * ...
 * }
 * </pre>
 *
 * Protobuf type {@code google.protobuf.Mixin}
 */
public final class Mixin extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:google.protobuf.Mixin)
    MixinOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 3,
      /* suffix= */ "",
      Mixin.class.getName());
  }
  // Use Mixin.newBuilder() to construct.
  private Mixin(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private Mixin() {
    name_ = "";
    root_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.protobuf.ApiProto.internal_static_google_protobuf_Mixin_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.protobuf.ApiProto.internal_static_google_protobuf_Mixin_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.protobuf.Mixin.class, com.google.protobuf.Mixin.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   * <pre>
   * The fully qualified name of the interface which is included.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The fully qualified name of the interface which is included.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ROOT_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object root_ = "";
  /**
   * <pre>
   * If non-empty specifies a path under which inherited HTTP paths
   * are rooted.
   * </pre>
   *
   * <code>string root = 2;</code>
   * @return The root.
   */
  @java.lang.Override
  public java.lang.String getRoot() {
    java.lang.Object ref = root_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      root_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * If non-empty specifies a path under which inherited HTTP paths
   * are rooted.
   * </pre>
   *
   * <code>string root = 2;</code>
   * @return The bytes for root.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRootBytes() {
    java.lang.Object ref = root_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      root_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, name_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(root_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 2, root_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, name_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(root_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(2, root_);
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
    if (!(obj instanceof com.google.protobuf.Mixin)) {
      return super.equals(obj);
    }
    com.google.protobuf.Mixin other = (com.google.protobuf.Mixin) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (!getRoot()
        .equals(other.getRoot())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + ROOT_FIELD_NUMBER;
    hash = (53 * hash) + getRoot().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.protobuf.Mixin parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.protobuf.Mixin parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.protobuf.Mixin parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.protobuf.Mixin parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.protobuf.Mixin parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.protobuf.Mixin parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.protobuf.Mixin parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.google.protobuf.Mixin parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.protobuf.Mixin parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.protobuf.Mixin parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.protobuf.Mixin parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.google.protobuf.Mixin parseFrom(
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
  public static Builder newBuilder(com.google.protobuf.Mixin prototype) {
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
   * <pre>
   * Declares an API Interface to be included in this interface. The including
   * interface must redeclare all the methods from the included interface, but
   * documentation and options are inherited as follows:
   *
   * - If after comment and whitespace stripping, the documentation
   * string of the redeclared method is empty, it will be inherited
   * from the original method.
   *
   * - Each annotation belonging to the service config (http,
   * visibility) which is not set in the redeclared method will be
   * inherited.
   *
   * - If an http annotation is inherited, the path pattern will be
   * modified as follows. Any version prefix will be replaced by the
   * version of the including interface plus the [root][] path if
   * specified.
   *
   * Example of a simple mixin:
   *
   * package google.acl.v1;
   * service AccessControl {
   * // Get the underlying ACL object.
   * rpc GetAcl(GetAclRequest) returns (Acl) {
   * option (google.api.http).get = "/v1/{resource=**}:getAcl";
   * }
   * }
   *
   * package google.storage.v2;
   * service Storage {
   * rpc GetAcl(GetAclRequest) returns (Acl);
   *
   * // Get a data record.
   * rpc GetData(GetDataRequest) returns (Data) {
   * option (google.api.http).get = "/v2/{resource=**}";
   * }
   * }
   *
   * Example of a mixin configuration:
   *
   * apis:
   * - name: google.storage.v2.Storage
   * mixins:
   * - name: google.acl.v1.AccessControl
   *
   * The mixin construct implies that all methods in `AccessControl` are
   * also declared with same name and request/response types in
   * `Storage`. A documentation generator or annotation processor will
   * see the effective `Storage.GetAcl` method after inherting
   * documentation and annotations as follows:
   *
   * service Storage {
   * // Get the underlying ACL object.
   * rpc GetAcl(GetAclRequest) returns (Acl) {
   * option (google.api.http).get = "/v2/{resource=**}:getAcl";
   * }
   * ...
   * }
   *
   * Note how the version in the path pattern changed from `v1` to `v2`.
   *
   * If the `root` field in the mixin is specified, it should be a
   * relative path under which inherited HTTP paths are placed. Example:
   *
   * apis:
   * - name: google.storage.v2.Storage
   * mixins:
   * - name: google.acl.v1.AccessControl
   * root: acls
   *
   * This implies the following inherited HTTP annotation:
   *
   * service Storage {
   * // Get the underlying ACL object.
   * rpc GetAcl(GetAclRequest) returns (Acl) {
   * option (google.api.http).get = "/v2/acls/{resource=**}:getAcl";
   * }
   * ...
   * }
   * </pre>
   *
   * Protobuf type {@code google.protobuf.Mixin}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.protobuf.Mixin)
      com.google.protobuf.MixinOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.protobuf.ApiProto.internal_static_google_protobuf_Mixin_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.protobuf.ApiProto.internal_static_google_protobuf_Mixin_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.protobuf.Mixin.class, com.google.protobuf.Mixin.Builder.class);
    }

    // Construct using com.google.protobuf.Mixin.newBuilder()
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
      name_ = "";
      root_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.protobuf.ApiProto.internal_static_google_protobuf_Mixin_descriptor;
    }

    @java.lang.Override
    public com.google.protobuf.Mixin getDefaultInstanceForType() {
      return com.google.protobuf.Mixin.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.protobuf.Mixin build() {
      com.google.protobuf.Mixin result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.protobuf.Mixin buildPartial() {
      com.google.protobuf.Mixin result = new com.google.protobuf.Mixin(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.protobuf.Mixin result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.root_ = root_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.protobuf.Mixin) {
        return mergeFrom((com.google.protobuf.Mixin)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.protobuf.Mixin other) {
      if (other == com.google.protobuf.Mixin.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getRoot().isEmpty()) {
        root_ = other.root_;
        bitField0_ |= 0x00000002;
        onChanged();
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
              name_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              root_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
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

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * The fully qualified name of the interface which is included.
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The fully qualified name of the interface which is included.
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The fully qualified name of the interface which is included.
     * </pre>
     *
     * <code>string name = 1;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The fully qualified name of the interface which is included.
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The fully qualified name of the interface which is included.
     * </pre>
     *
     * <code>string name = 1;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object root_ = "";
    /**
     * <pre>
     * If non-empty specifies a path under which inherited HTTP paths
     * are rooted.
     * </pre>
     *
     * <code>string root = 2;</code>
     * @return The root.
     */
    public java.lang.String getRoot() {
      java.lang.Object ref = root_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        root_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * If non-empty specifies a path under which inherited HTTP paths
     * are rooted.
     * </pre>
     *
     * <code>string root = 2;</code>
     * @return The bytes for root.
     */
    public com.google.protobuf.ByteString
        getRootBytes() {
      java.lang.Object ref = root_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        root_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * If non-empty specifies a path under which inherited HTTP paths
     * are rooted.
     * </pre>
     *
     * <code>string root = 2;</code>
     * @param value The root to set.
     * @return This builder for chaining.
     */
    public Builder setRoot(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      root_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If non-empty specifies a path under which inherited HTTP paths
     * are rooted.
     * </pre>
     *
     * <code>string root = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearRoot() {
      root_ = getDefaultInstance().getRoot();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If non-empty specifies a path under which inherited HTTP paths
     * are rooted.
     * </pre>
     *
     * <code>string root = 2;</code>
     * @param value The bytes for root to set.
     * @return This builder for chaining.
     */
    public Builder setRootBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      root_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:google.protobuf.Mixin)
  }

  // @@protoc_insertion_point(class_scope:google.protobuf.Mixin)
  private static final com.google.protobuf.Mixin DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.protobuf.Mixin();
  }

  public static com.google.protobuf.Mixin getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Mixin>
      PARSER = new com.google.protobuf.AbstractParser<Mixin>() {
    @java.lang.Override
    public Mixin parsePartialFrom(
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

  public static com.google.protobuf.Parser<Mixin> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Mixin> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Mixin getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

