package org.overworld.gpio4j.serial;

import java.util.Optional;
import java.util.stream.Stream;

import lombok.Getter;

public enum PinType {
	DIGITAL_IN(1), DIGITAL_IN_PULLUP(2), DIGITAL_OUT(3), ANALOG_IN(4), ANALOG_OUT(5), COSINE(6), BUFFER(7), PWM(8);

	@Getter
	private int id;

	private PinType(int type) {
		this.id = type;
	}
	
	public static Optional<PinType> forId(int id) {
		return Stream.of(PinType.values()).filter(pt -> id == pt.getId()).findFirst();
	}
}