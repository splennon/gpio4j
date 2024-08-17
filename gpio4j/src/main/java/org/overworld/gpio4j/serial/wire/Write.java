package org.overworld.gpio4j.serial.wire;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.overworld.gpio4j.serial.LineByte;
import org.overworld.gpio4j.serial.MessageType;

public class Write implements Message {

	private Integer pin;
	private MessagePart data;
	private Long timestamp;

	@Override
	public Message parse(byte[] wireData) throws IOException {
		
		// if (wireData.length != 2) throw new IllegalStateException("Incorrect number of bytes");
		// TODO Don't know length, need better check
		
		ByteArrayInputStream input = new ByteArrayInputStream(wireData);
		byte[] pinBytes = input.readNBytes(2);
		pin = (new LineByte(pinBytes[0], pinBytes[1]).asInt());
		
		data = data.parse()

		return this;
	}

	@Override
	public byte[] wireData() {
		
		if (pin == null) throw new IllegalStateException("Pin is not set when generating wire data");
		if (data == null) throw new IllegalStateException("Data is not set when generating wire data");
		if (timestamp == null) throw new IllegalStateException("Timestamp is not set when generating wire data");
		
		LineByte lb = new LineByte(pin);
		
		ByteArrayOutputStream result = new ByteArrayOutputStream();
		result.write(lb.getHi());
		result.write(lb.getLo());
		result.writeBytes(data.wireData());
		result.writeBytes(new LineByte((byte)((timestamp & 0xFF000000) >>> 24)).getHiLo());
		result.writeBytes(new LineByte((byte)((timestamp & 0x00FF0000) >>> 16)).getHiLo());
		result.writeBytes(new LineByte((byte)((timestamp & 0x0000FF00) >>> 8)).getHiLo());
		result.writeBytes(new LineByte((byte)((timestamp & 0x000000FF))).getHiLo());
		return result.toByteArray();
	}

	@Override
	public MessageType getType() {
		return MessageType.WRITE;
	}
}
