// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: google/protobuf/type.proto
// Protobuf Java Version: 4.27.3

package com.google.protobuf;

/**
 * <pre>
 * The syntax in which a protocol buffer element is defined.
 * </pre>
 *
 * Protobuf enum {@code google.protobuf.Syntax}
 */
public enum Syntax
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Syntax `proto2`.
   * </pre>
   *
   * <code>SYNTAX_PROTO2 = 0;</code>
   */
  SYNTAX_PROTO2(0),
  /**
   * <pre>
   * Syntax `proto3`.
   * </pre>
   *
   * <code>SYNTAX_PROTO3 = 1;</code>
   */
  SYNTAX_PROTO3(1),
  /**
   * <pre>
   * Syntax `editions`.
   * </pre>
   *
   * <code>SYNTAX_EDITIONS = 2;</code>
   */
  SYNTAX_EDITIONS(2),
  UNRECOGNIZED(-1),
  ;

  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 3,
      /* suffix= */ "",
      Syntax.class.getName());
  }
  /**
   * <pre>
   * Syntax `proto2`.
   * </pre>
   *
   * <code>SYNTAX_PROTO2 = 0;</code>
   */
  public static final int SYNTAX_PROTO2_VALUE = 0;
  /**
   * <pre>
   * Syntax `proto3`.
   * </pre>
   *
   * <code>SYNTAX_PROTO3 = 1;</code>
   */
  public static final int SYNTAX_PROTO3_VALUE = 1;
  /**
   * <pre>
   * Syntax `editions`.
   * </pre>
   *
   * <code>SYNTAX_EDITIONS = 2;</code>
   */
  public static final int SYNTAX_EDITIONS_VALUE = 2;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static Syntax valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static Syntax forNumber(int value) {
    switch (value) {
      case 0: return SYNTAX_PROTO2;
      case 1: return SYNTAX_PROTO3;
      case 2: return SYNTAX_EDITIONS;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<Syntax>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      Syntax> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Syntax>() {
          public Syntax findValueByNumber(int number) {
            return Syntax.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.google.protobuf.TypeProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final Syntax[] VALUES = values();

  public static Syntax valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private Syntax(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.protobuf.Syntax)
}

