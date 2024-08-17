package org.overworld.gpio4j.serial.wire;

import org.overworld.gpio4j.serial.MessageType;

public class Interrupt implements Message {
	
	@Override
	public Message parse(byte[] wireData) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public byte[] wireData() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MessageType getType() {
		return MessageType.INTERRUPT;
	}
}
