// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: google/protobuf/type.proto
// Protobuf Java Version: 4.27.3

package com.google.protobuf;

public interface TypeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.protobuf.Type)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The fully qualified message name.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The fully qualified message name.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The list of fields.
   * </pre>
   *
   * <code>repeated .google.protobuf.Field fields = 2;</code>
   */
  java.util.List<com.google.protobuf.Field> 
      getFieldsList();
  /**
   * <pre>
   * The list of fields.
   * </pre>
   *
   * <code>repeated .google.protobuf.Field fields = 2;</code>
   */
  com.google.protobuf.Field getFields(int index);
  /**
   * <pre>
   * The list of fields.
   * </pre>
   *
   * <code>repeated .google.protobuf.Field fields = 2;</code>
   */
  int getFieldsCount();
  /**
   * <pre>
   * The list of fields.
   * </pre>
   *
   * <code>repeated .google.protobuf.Field fields = 2;</code>
   */
  java.util.List<? extends com.google.protobuf.FieldOrBuilder> 
      getFieldsOrBuilderList();
  /**
   * <pre>
   * The list of fields.
   * </pre>
   *
   * <code>repeated .google.protobuf.Field fields = 2;</code>
   */
  com.google.protobuf.FieldOrBuilder getFieldsOrBuilder(
      int index);

  /**
   * <pre>
   * The list of types appearing in `oneof` definitions in this type.
   * </pre>
   *
   * <code>repeated string oneofs = 3;</code>
   * @return A list containing the oneofs.
   */
  java.util.List<java.lang.String>
      getOneofsList();
  /**
   * <pre>
   * The list of types appearing in `oneof` definitions in this type.
   * </pre>
   *
   * <code>repeated string oneofs = 3;</code>
   * @return The count of oneofs.
   */
  int getOneofsCount();
  /**
   * <pre>
   * The list of types appearing in `oneof` definitions in this type.
   * </pre>
   *
   * <code>repeated string oneofs = 3;</code>
   * @param index The index of the element to return.
   * @return The oneofs at the given index.
   */
  java.lang.String getOneofs(int index);
  /**
   * <pre>
   * The list of types appearing in `oneof` definitions in this type.
   * </pre>
   *
   * <code>repeated string oneofs = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the oneofs at the given index.
   */
  com.google.protobuf.ByteString
      getOneofsBytes(int index);

  /**
   * <pre>
   * The protocol buffer options.
   * </pre>
   *
   * <code>repeated .google.protobuf.Option options = 4;</code>
   */
  java.util.List<com.google.protobuf.Option> 
      getOptionsList();
  /**
   * <pre>
   * The protocol buffer options.
   * </pre>
   *
   * <code>repeated .google.protobuf.Option options = 4;</code>
   */
  com.google.protobuf.Option getOptions(int index);
  /**
   * <pre>
   * The protocol buffer options.
   * </pre>
   *
   * <code>repeated .google.protobuf.Option options = 4;</code>
   */
  int getOptionsCount();
  /**
   * <pre>
   * The protocol buffer options.
   * </pre>
   *
   * <code>repeated .google.protobuf.Option options = 4;</code>
   */
  java.util.List<? extends com.google.protobuf.OptionOrBuilder> 
      getOptionsOrBuilderList();
  /**
   * <pre>
   * The protocol buffer options.
   * </pre>
   *
   * <code>repeated .google.protobuf.Option options = 4;</code>
   */
  com.google.protobuf.OptionOrBuilder getOptionsOrBuilder(
      int index);

  /**
   * <pre>
   * The source context.
   * </pre>
   *
   * <code>.google.protobuf.SourceContext source_context = 5;</code>
   * @return Whether the sourceContext field is set.
   */
  boolean hasSourceContext();
  /**
   * <pre>
   * The source context.
   * </pre>
   *
   * <code>.google.protobuf.SourceContext source_context = 5;</code>
   * @return The sourceContext.
   */
  com.google.protobuf.SourceContext getSourceContext();
  /**
   * <pre>
   * The source context.
   * </pre>
   *
   * <code>.google.protobuf.SourceContext source_context = 5;</code>
   */
  com.google.protobuf.SourceContextOrBuilder getSourceContextOrBuilder();

  /**
   * <pre>
   * The source syntax.
   * </pre>
   *
   * <code>.google.protobuf.Syntax syntax = 6;</code>
   * @return The enum numeric value on the wire for syntax.
   */
  int getSyntaxValue();
  /**
   * <pre>
   * The source syntax.
   * </pre>
   *
   * <code>.google.protobuf.Syntax syntax = 6;</code>
   * @return The syntax.
   */
  com.google.protobuf.Syntax getSyntax();

  /**
   * <pre>
   * The source edition string, only valid when syntax is SYNTAX_EDITIONS.
   * </pre>
   *
   * <code>string edition = 7;</code>
   * @return The edition.
   */
  java.lang.String getEdition();
  /**
   * <pre>
   * The source edition string, only valid when syntax is SYNTAX_EDITIONS.
   * </pre>
   *
   * <code>string edition = 7;</code>
   * @return The bytes for edition.
   */
  com.google.protobuf.ByteString
      getEditionBytes();
}
