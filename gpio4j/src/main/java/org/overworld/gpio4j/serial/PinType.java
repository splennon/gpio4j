package org.overworld.gpio4j.serial;

import java.util.Optional;
import java.util.stream.Stream;

import lombok.Getter;

public enum PinType {
	DIGITAL_IN(1), DIGITAL_OUT(2), ANALOG_IN(3), ANALOG_OUT(4), COSINE(5), BUFFER(6), PWM(7);

	@Getter
	private int type;

	private PinType(int type) {
		this.type = type;
	}
	
	public static Optional<PinType> forId(int id) {
		return Stream.of(PinType.values()).filter(pt -> id == pt.getType()).findFirst();
	}
}