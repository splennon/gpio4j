# Gpio4J

A library that allows an Esp32 or Arduino to act as a GPIO extension board, programmable over serial from Java.

The project consists of two parts:

## Java Library

The gpio4j java library connects to your dev board and configures the GPIO pins on the board into different configurations such as digital write, analoge read etc. Then you can read and write to the board over the serial link built into the dev board.

This allows you to create hardware projects with lights, switches, and simple data pins such as passive infrared sensors and relay boards.

Devices that communicate over serial links such as led matrix displays and temperature sensors are not supported as they usually need their own drivers running on the board.

## Board Driver

The Esp32 or Android development board runs a C++ program that receives commands from the Java library over the serial connection, configures, reads and writes pins.

## Major Dependencies

The dependencies of the Java library are included in the Maven pom.xml file. The system uses Protobuf to communicate between the host and the board.

The board driver is relatively simple C++ code and depends on EmbeddedProto for Protobuf communication.
