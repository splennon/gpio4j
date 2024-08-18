package org.overworld.gpio4j.serial;

import java.util.Optional;
import java.util.stream.Stream;

import org.overworld.gpio4j.serial.wire.Analog;
import org.overworld.gpio4j.serial.wire.Config;
import org.overworld.gpio4j.serial.wire.Digital;
import org.overworld.gpio4j.serial.wire.Deconfig;
import org.overworld.gpio4j.serial.wire.Dump;
import org.overworld.gpio4j.serial.wire.Interrupt;
import org.overworld.gpio4j.serial.wire.Message;
import org.overworld.gpio4j.serial.wire.Notify;
import org.overworld.gpio4j.serial.wire.Read;
import org.overworld.gpio4j.serial.wire.Write;

import lombok.Getter;

public enum MessageType {
	READ(1), WRITE(2), CONFIG(3), DECONFIG(4), DUMP(5), DIGITAL(6), ANALOG(7), INTERRUPT(8), NOTIFY(9);

	@Getter
	private int id;

	private MessageType(int type) {
		this.id = type;
	}
	
	public static Optional<MessageType> forId(int id) {
		return Stream.of(MessageType.values()).filter(mt-> id == mt.getId()).findFirst();
	}
	
	public Message newInstance() {
		return switch (this) {
			case CONFIG -> new Config();
			case DIGITAL -> new Digital();
			case DECONFIG -> new Deconfig();
			case DUMP -> new Dump();
			case INTERRUPT -> new Interrupt();
			case READ -> new Read();
			case WRITE -> new Write();
		    case ANALOG -> new Analog();
		    case NOTIFY -> new Notify();
		};
	}
}