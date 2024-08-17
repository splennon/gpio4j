package org.overworld.gpio4j.serial.wire;

import org.overworld.gpio4j.serial.MessageType;
import org.overworld.gpio4j.serial.PinType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.With;

@AllArgsConstructor
@With
@Data
public class Dump implements Message {

	@Override
	public Message parse(byte[] wireData) {
		
		if (wireData.length != 0) throw new IllegalStateException("Incorrect number of bytes");
		
		return this;
	}

	@Override
	public byte[] wireData() {
		return new byte[0];
	}

	@Override
	public MessageType getType() {
		return MessageType.DUMP;
	}
}
