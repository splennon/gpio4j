package org.overworld.gpio4j.serial;

import java.util.Optional;
import java.util.stream.Stream;

import org.overworld.gpio4j.serial.wire.Config;
import org.overworld.gpio4j.serial.wire.Data;
import org.overworld.gpio4j.serial.wire.Deconfig;
import org.overworld.gpio4j.serial.wire.Dump;
import org.overworld.gpio4j.serial.wire.Interrupt;
import org.overworld.gpio4j.serial.wire.Message;
import org.overworld.gpio4j.serial.wire.Read;
import org.overworld.gpio4j.serial.wire.Write;

import lombok.Getter;

public enum MessageType {
	READ(1), WRITE(2), CONFIG(3), DECONFIG(4), DUMP(5), DATA(6), INTERRUPT(7);

	@Getter
	private int type;

	private MessageType(int type) {
		this.type = type;
	}
	
	public static Optional<MessageType> forId(int id) {
		return Stream.of(MessageType.values()).filter(mt-> id == mt.getType()).findFirst();
	}
	
	public Message newInstance() {
		return switch (this) {
			case CONFIG -> new Config();
			case DATA -> new Data();
			case DECONFIG -> new Deconfig();
			case DUMP -> new Dump();
			case INTERRUPT -> new Interrupt();
			case READ -> new Read();
			case WRITE -> new Write();
		};
	}
}