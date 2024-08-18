package org.overworld.gpio4j.serial.wire;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.overworld.gpio4j.serial.LineByte;
import org.overworld.gpio4j.serial.MessageType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.With;

@NoArgsConstructor
@AllArgsConstructor
@With
@Data
public class Notify implements Message {

	private Integer pin;
	private Message data;
	private Long timestamp;

	@Override
	public Notify parse(ByteArrayInputStream wireData) throws IOException {
		
		// if (wireData.length != 2) throw new IllegalStateException("Incorrect number of bytes");
		// TODO Don't know length, need better check
		
		pin = (new LineByte(wireData.readNBytes(2)).asInt());
		
		data = MessageType.forId(wireData.read()).get().newInstance();
		data.parse(wireData);
		
		long l = (new LineByte(wireData.readNBytes(2))).asInt();
		l = (l << 8) | (new LineByte(wireData.readNBytes(2))).asInt();
		l = (l << 8) | (new LineByte(wireData.readNBytes(2))).asInt();		
		l = (l << 8) | (new LineByte(wireData.readNBytes(2))).asInt();
		l = (l << 8) | (new LineByte(wireData.readNBytes(2))).asInt();		
		l = (l << 8) | (new LineByte(wireData.readNBytes(2))).asInt();
		l = (l << 8) | (new LineByte(wireData.readNBytes(2))).asInt();		
		l = (l << 8) | (new LineByte(wireData.readNBytes(2))).asInt();
		timestamp = l;

		return this;
	}

	@Override
	public ByteArrayOutputStream wireData() {
		
		if (pin == null) throw new IllegalStateException("Pin is not set when generating wire data");
		if (data == null) throw new IllegalStateException("Data is not set when generating wire data");
		if (timestamp == null) throw new IllegalStateException("Timestamp is not set when generating wire data");
		
		ByteArrayOutputStream result = new ByteArrayOutputStream();
		result.writeBytes((new LineByte(pin)).getHiLo());
		result.write(data.getType().getId());
		result.writeBytes(data.wireData().toByteArray());

		result.writeBytes(new LineByte((byte)((timestamp & 0xFF00000000000000L) >>> 56)).getHiLo());
		result.writeBytes(new LineByte((byte)((timestamp & 0x00FF000000000000L) >>> 48)).getHiLo());
		result.writeBytes(new LineByte((byte)((timestamp & 0x0000FF0000000000L) >>> 40)).getHiLo());
		result.writeBytes(new LineByte((byte)((timestamp & 0x000000FF00000000L) >>> 32)).getHiLo());
		result.writeBytes(new LineByte((byte)((timestamp & 0x00000000FF000000L) >>> 24)).getHiLo());
		result.writeBytes(new LineByte((byte)((timestamp & 0x0000000000FF0000L) >>> 16)).getHiLo());
		result.writeBytes(new LineByte((byte)((timestamp & 0x000000000000FF00L) >>> 8)).getHiLo());
		result.writeBytes(new LineByte((byte)((timestamp & 0x00000000000000FFL))).getHiLo());
		return result;
	}

	@Override
	public MessageType getType() {
		return MessageType.NOTIFY;
	}
}
