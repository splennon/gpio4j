package org.overworld.gpio4j.serial;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class PinTypeTest {

	@Test
	void testCreate() {
		PinType p = PinType.ANALOG_OUT;
		assertEquals(5, p.getId());
	}

	@Test
	void testCreateByNumber() {
		PinType p = PinType.forId(6).get();
		assertEquals(PinType.COSINE, p);
	}
}
