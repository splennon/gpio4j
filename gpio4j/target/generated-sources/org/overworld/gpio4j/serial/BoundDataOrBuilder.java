// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: serial.proto
// Protobuf Java Version: 4.27.3

package org.overworld.gpio4j.serial;

public interface BoundDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:serial.BoundData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint32 pin = 1;</code>
   * @return The pin.
   */
  int getPin();

  /**
   * <code>.google.protobuf.Timestamp time = 2;</code>
   * @return Whether the time field is set.
   */
  boolean hasTime();
  /**
   * <code>.google.protobuf.Timestamp time = 2;</code>
   * @return The time.
   */
  com.google.protobuf.Timestamp getTime();
  /**
   * <code>.google.protobuf.Timestamp time = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getTimeOrBuilder();

  /**
   * <code>uint32 number = 3;</code>
   * @return Whether the number field is set.
   */
  boolean hasNumber();
  /**
   * <code>uint32 number = 3;</code>
   * @return The number.
   */
  int getNumber();

  /**
   * <code>bool boolean = 4;</code>
   * @return Whether the boolean field is set.
   */
  boolean hasBoolean();
  /**
   * <code>bool boolean = 4;</code>
   * @return The boolean.
   */
  boolean getBoolean();

  /**
   * <code>.serial.IntArray buffer = 5;</code>
   * @return Whether the buffer field is set.
   */
  boolean hasBuffer();
  /**
   * <code>.serial.IntArray buffer = 5;</code>
   * @return The buffer.
   */
  org.overworld.gpio4j.serial.IntArray getBuffer();
  /**
   * <code>.serial.IntArray buffer = 5;</code>
   */
  org.overworld.gpio4j.serial.IntArrayOrBuilder getBufferOrBuilder();

  org.overworld.gpio4j.serial.BoundData.DataCase getDataCase();
}
