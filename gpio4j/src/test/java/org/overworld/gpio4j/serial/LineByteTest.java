package org.overworld.gpio4j.serial;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class LineByteTest {

	@Test
	void testSimple() {
		LineByte b = new LineByte(0b10101111);
		assertEquals(0b10101111, b.asInt());
		assertEquals(0b10101111, b.asByte() & 0xFF);
		assertEquals((byte) 0b10101111, b.asByte());
	}
	
	@Test
	void testSimpleByte() {
		LineByte b = new LineByte((byte) (0b10101111 & 0xFF));
		assertEquals(0b10101111, b.asInt());
		assertEquals(0b10101111, b.asByte() & 0xFF);
		assertEquals((byte) 0b10101111, b.asByte());
	}

	@Test
	void testNibbles() {
		LineByte b = new LineByte(0b1010, 0b1111);
		assertEquals(0b10101111, b.asInt());
		assertEquals(0b10101111, b.asByte() & 0xFF);
		assertEquals((byte) 0b10101111, b.asByte());
	}
	
	@Test
	void testNibblesArray() {
		LineByte b = new LineByte(new byte[] {0b1010, 0b1111});
		assertEquals(0b10101111, b.asInt());
		assertEquals(0b10101111, b.asByte() & 0xFF);
		assertEquals((byte) 0b10101111, b.asByte());
	}	
	
	@Test
	void testHiOutOfRange() {
		assertThrows(
			IllegalArgumentException.class,
			() -> new LineByte(0b11010, 0b1111)
		);
	}
	
	@Test
	void testLoOutOfRange() {
		assertThrows(
			IllegalArgumentException.class,
			() -> new LineByte(0b1010, 0b11111)
		);
	}
	
	@Test
	void testIntOutOfRange() {
		assertThrows(
			IllegalArgumentException.class,
			() -> new LineByte(0b100000000)
		);
	}
	
	@Test
	void tesGetNibbles() {
		LineByte b = new LineByte(0b10101111);
		assertEquals(0b00001111, b.getLo() & 0xFF);
		assertEquals(0b00001010, b.getHi() & 0xFF);
	}
	
	@Test
	void tesGetNibblesArray() {
		LineByte b = new LineByte(0b10101111);		
		assertArrayEquals(new byte[] {0b00001010, 0b00001111}, b.getHiLo());
	}
	
	@Test
	void testToString() {
		LineByte b = new LineByte(0b10101111);
		assertEquals("10101111", b.toString());
	}
}
