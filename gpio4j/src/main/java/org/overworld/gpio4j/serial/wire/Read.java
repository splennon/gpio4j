package org.overworld.gpio4j.serial.wire;

import org.overworld.gpio4j.serial.LineByte;
import org.overworld.gpio4j.serial.MessageType;

public class Read implements Message {
	
	private Integer pin;

	@Override
	public Message parse(byte[] wireData) {
		
		if (wireData.length != 2) throw new IllegalStateException("Incorrect number of bytes");
		
		pin = new LineByte(wireData[0], wireData[1]).asInt();
		return this;
	}

	@Override
	public byte[] wireData() {
		
		if (pin == null) throw new IllegalStateException("Pin is not set when generating wire data");
		
		LineByte lb = new LineByte(pin);
		return new byte[] { lb.getHi(), lb.getLo() };
	}

	@Override
	public MessageType getType() {
		return MessageType.READ;
	}
}
