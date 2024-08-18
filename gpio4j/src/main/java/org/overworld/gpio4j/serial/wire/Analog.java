package org.overworld.gpio4j.serial.wire;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.overworld.gpio4j.serial.LineByte;
import org.overworld.gpio4j.serial.MessageType;
import org.overworld.gpio4j.serial.PinType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.With;

@NoArgsConstructor
@AllArgsConstructor
@With
@Data
public class Analog implements Message {
	
	private Integer value;
	
	@Override
	public Analog parse(ByteArrayInputStream wireData) throws IOException {
		
		if (wireData.available() < 2) throw new IllegalStateException("Incorrect number of bytes");
		
		value = new LineByte(wireData.readNBytes(2)).asInt();
		
		return this;
	}

	@Override
	public ByteArrayOutputStream wireData() {

		if (value == null) throw new IllegalStateException("Value is not set when generating wire data");
		
		ByteArrayOutputStream result = new ByteArrayOutputStream();
		result.writeBytes(new LineByte(value).getHiLo());
		return result;
	}

	@Override
	public MessageType getType() {
		return MessageType.ANALOG;
	}
}
