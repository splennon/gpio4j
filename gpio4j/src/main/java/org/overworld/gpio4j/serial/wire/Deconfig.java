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

@AllArgsConstructor
@NoArgsConstructor
@With
@Data
public class Deconfig implements Message {
	
	private Integer pin;

	@Override
	public Deconfig parse(ByteArrayInputStream wireData) throws IOException {
		
		if (wireData.available() < 2) throw new IllegalStateException("Incorrect number of bytes");
		
		pin = new LineByte(wireData.readNBytes(2)).asInt();
		return this;
	}

	@Override
	public ByteArrayOutputStream wireData() {
		
		if (pin == null) throw new IllegalStateException("Pin is not set when generating wire data");
		
		ByteArrayOutputStream result = new ByteArrayOutputStream();
		result.writeBytes(new LineByte(pin).getHiLo());
		return result;
	}

	@Override
	public MessageType getType() {
		return MessageType.DECONFIG;
	}
}
