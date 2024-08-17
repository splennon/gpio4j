package org.overworld.gpio4j.serial.wire;

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
	private PinType pt;
	private boolean interrupt = false;
	
	@Override
	public Message parse(byte[] wireData) {

		if (wireData.length != 4) throw new IllegalStateException("Incorrect number of bytes");
		
		pin = new LineByte(wireData[0], wireData[1]).asInt();
		pt = PinType.forId(wireData[2]).get();
		interrupt = wireData[2] == (byte) 0 ? false : true;
		return this;
	}

	@Override
	public byte[] wireData() {

		if (pin == null) throw new IllegalStateException("Pin is not set when generating wire data");
		if (pt == null) throw new IllegalStateException("Pin Type is not set when generating wire data");

		LineByte lb = new LineByte(pin);
		return new byte[] { lb.getHi(), lb.getLo(), (byte) pt.getType(), interrupt ? (byte) 1 : (byte) 0 };
	}

	@Override
	public MessageType getType() {
		return MessageType.CONFIG;
	}
}
