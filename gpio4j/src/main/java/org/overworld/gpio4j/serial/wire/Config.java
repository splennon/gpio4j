package org.overworld.gpio4j.serial.wire;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.overworld.gpio4j.serial.LineByte;
import org.overworld.gpio4j.serial.MessageType;
import org.overworld.gpio4j.serial.PinType;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.With;
import lombok.Data;

@NoArgsConstructor
@AllArgsConstructor
@With
@Data
public class Config implements Message {
	
	private Integer pin;
	private PinType pinType;
	private boolean interrupt = false;
	
	@Override
	public Config parse(ByteArrayInputStream wireData) throws IOException {

		if (wireData.available() < 4) throw new IllegalStateException("Incorrect number of bytes");
		
		pin = new LineByte(wireData.readNBytes(2)).asInt();
		pinType = PinType.forId(wireData.readNBytes(1)[0]).get();
		interrupt = wireData.readNBytes(1)[0] == (byte) 0 ? false : true;
		return this;
	}

	@Override
	public ByteArrayOutputStream wireData() {

		if (pin == null) throw new IllegalStateException("Pin is not set when generating wire data");
		if (pinType == null) throw new IllegalStateException("Pin Type is not set when generating wire data");

		ByteArrayOutputStream result = new ByteArrayOutputStream();
		result.writeBytes((new LineByte(pin)).getHiLo());
		result.write((byte) pinType.getId());
		result.write(interrupt ? (byte) 1 : (byte) 0);
		return result;
	}

	@Override
	public MessageType getType() {
		return MessageType.CONFIG;
	}
}
