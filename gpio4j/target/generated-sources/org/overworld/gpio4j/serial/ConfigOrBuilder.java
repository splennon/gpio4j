// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: serial.proto
// Protobuf Java Version: 4.27.3

package org.overworld.gpio4j.serial;

public interface ConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:serial.Config)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint32 pin = 1;</code>
   * @return The pin.
   */
  int getPin();

  /**
   * <code>.serial.PinType type = 2;</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <code>.serial.PinType type = 2;</code>
   * @return The type.
   */
  org.overworld.gpio4j.serial.PinType getType();

  /**
   * <code>bool interrupt = 3;</code>
   * @return The interrupt.
   */
  boolean getInterrupt();
}
