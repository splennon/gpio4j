package org.overworld.gpio4j.serial.wire;

import java.io.IOException;

public interface MessagePart {

	public MessagePart parse(byte[] wireData) throws IOException;
	
	public byte[] wireData();
}
