package org.overworld.gpio4j.serial.wire;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.overworld.gpio4j.serial.MessageType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.With;

@AllArgsConstructor
@NoArgsConstructor
@With
@Data
public class Digital implements Message {
	
	private Boolean value;
	
	@Override
	public Digital parse(ByteArrayInputStream wireData) throws IOException {
		
		if (wireData.available() < 1) throw new IllegalStateException("Incorrect number of bytes");
		
		value = wireData.readNBytes(1)[0] != 0;
		return this;
	}

	@Override
	public ByteArrayOutputStream wireData() {

		if (value == null) throw new IllegalStateException("Value is not set when generating wire data");
		
		ByteArrayOutputStream result = new ByteArrayOutputStream();
		result.write(value ? 0b00000001 : 0b00000000);
		return result;
	}

	@Override
	public MessageType getType() {
		return MessageType.DIGITAL;
	}
}
