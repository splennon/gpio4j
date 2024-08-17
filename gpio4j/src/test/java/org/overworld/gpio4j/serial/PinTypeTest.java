package org.overworld.gpio4j.serial;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PinTypeTest {

	@Test
	void testCreate() {
		PinType p = PinType.ANALOG_OUT;
		assertEquals(4, p.getType());
	}

	@Test
	void testCreateByNumber() {
		PinType p = PinType.forId(5).get();
		assertEquals(PinType.COSINE, p);
	}
}
