package org.overworld.gpio4j.serial.wire;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.junit.jupiter.api.Test;
import org.overworld.gpio4j.serial.MessageType;
import org.overworld.gpio4j.serial.PinType;

public class LineTypesTest {

	@Test
	void testNotify() throws IOException {
		
		Notify expected = new Notify(3, new Analog(200), 1723937995357L);
		
		Notify typeGen = (Notify) MessageType.NOTIFY.newInstance();
		Analog analog = ((Analog) MessageType.ANALOG.newInstance()).withValue(200);
		typeGen = typeGen.withPin(3).withData(analog).withTimestamp(1723937995357L);

		assertEquals(expected, typeGen);
		
		ByteArrayOutputStream baos = expected.wireData();
		assertArrayEquals(new byte[] { 0, 3, 7, 12, 8, 0, 0, 0, 0, 0, 1, 9, 1, 6, 2, 11, 6, 3, 10, 5, 13 }, baos.toByteArray());
		
		Notify readback = (new Notify()).parse(new ByteArrayInputStream(baos.toByteArray()));
		assertEquals(expected, readback);
		assertEquals(MessageType.NOTIFY, readback.getType());
		
		// System.out.println(Arrays.toString(expected.wireData().toByteArray()));
	}
	
	@Test
	void testInterrupt() throws IOException {
		
		Interrupt expected = new Interrupt(3, new Digital(true), 1723937995357L);
		
		Interrupt typeGen = (Interrupt) MessageType.INTERRUPT.newInstance();
		Digital digital = ((Digital) MessageType.DIGITAL.newInstance()).withValue(true);
		typeGen = typeGen.withPin(3).withData(digital).withTimestamp(1723937995357L);

		assertEquals(expected, typeGen);
		
		ByteArrayOutputStream baos = expected.wireData();
		assertArrayEquals(new byte[] { 0, 3, 6, 1, 0, 0, 0, 0, 0, 1, 9, 1, 6, 2, 11, 6, 3, 10, 5, 13 }, baos.toByteArray());
		
		Interrupt readback = (new Interrupt()).parse(new ByteArrayInputStream(baos.toByteArray()));
		assertEquals(expected, readback);
		assertEquals(MessageType.INTERRUPT, readback.getType());
		
		// System.out.println(Arrays.toString(expected.wireData().toByteArray()));
	}
	
	@Test
	void testDump() throws IOException {
		
		Dump expected = new Dump();
		
		Dump typeGen = (Dump) MessageType.DUMP.newInstance();

		assertEquals(expected, typeGen);
		
		ByteArrayOutputStream baos = expected.wireData();
		assertArrayEquals(new byte[] { }, baos.toByteArray());
		
		Dump readback = (new Dump()).parse(new ByteArrayInputStream(baos.toByteArray()));
		assertEquals(expected, readback);
		assertEquals(MessageType.DUMP, readback.getType());
		
		// System.out.println(Arrays.toString(expected.wireData().toByteArray()));
	}
	
	@Test
	void testRead() throws IOException {
		
		Read expected = new Read(5);
		
		Read typeGen = (Read) MessageType.READ.newInstance();
		typeGen = typeGen.withPin(5);

		assertEquals(expected, typeGen);
		
		ByteArrayOutputStream baos = expected.wireData();
		assertArrayEquals(new byte[] { 0, 5 }, baos.toByteArray());
		
		Read readback = (new Read()).parse(new ByteArrayInputStream(baos.toByteArray()));
		assertEquals(expected, readback);
		assertEquals(MessageType.READ, readback.getType());
		
		// System.out.println(Arrays.toString(expected.wireData().toByteArray()));
	}
	
	@Test
	void testWrite() throws IOException {
		
		Write expected = new Write(6, new Analog(200), 1723937995357L);
		
		Write typeGen = (Write) MessageType.WRITE.newInstance();
		Analog analog = ((Analog) MessageType.ANALOG.newInstance()).withValue(200);
		typeGen = typeGen.withPin(6).withData(analog).withTimestamp(1723937995357L);

		assertEquals(expected, typeGen);
		
		ByteArrayOutputStream baos = expected.wireData();
		assertArrayEquals(new byte[] { 0, 6, 7, 12, 8, 0, 0, 0, 0, 0, 1, 9, 1, 6, 2, 11, 6, 3, 10, 5, 13 }, baos.toByteArray());
		
		Write readback = (new Write()).parse(new ByteArrayInputStream(baos.toByteArray()));
		assertEquals(expected, readback);
		assertEquals(MessageType.WRITE, readback.getType());
		
		// System.out.println(Arrays.toString(expected.wireData().toByteArray()));
	}
	
	@Test
	void testConfig() throws IOException {
		
		Config expected = new Config(6, PinType.ANALOG_IN, true);
		
		Config typeGen = (Config) MessageType.CONFIG.newInstance();
		typeGen = typeGen.withPin(6).withPinType(PinType.ANALOG_IN).withInterrupt(true);

		assertEquals(expected, typeGen);
		
		ByteArrayOutputStream baos = expected.wireData();
		assertArrayEquals(new byte[] { 0, 6, 4, 1 }, baos.toByteArray());
		
		Config readback = (new Config()).parse(new ByteArrayInputStream(baos.toByteArray()));
		assertEquals(expected, readback);
		assertEquals(MessageType.CONFIG, readback.getType());
		
		// System.out.println(Arrays.toString(expected.wireData().toByteArray()));
	}
	
	@Test
	void testDeconfig() throws IOException {
		
		Deconfig expected = new Deconfig(255);
		
		Deconfig typeGen = (Deconfig) MessageType.DECONFIG.newInstance();
		typeGen = typeGen.withPin(255);

		assertEquals(expected, typeGen);
		
		ByteArrayOutputStream baos = expected.wireData();
		assertArrayEquals(new byte[] { 15, 15 }, baos.toByteArray());
		
		Deconfig readback = (new Deconfig()).parse(new ByteArrayInputStream(baos.toByteArray()));
		assertEquals(expected, readback);
		assertEquals(MessageType.DECONFIG, readback.getType());
		
		// System.out.println(Arrays.toString(expected.wireData().toByteArray()));
	}
}
