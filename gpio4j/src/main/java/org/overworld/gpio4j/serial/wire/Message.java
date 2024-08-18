package org.overworld.gpio4j.serial.wire;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.overworld.gpio4j.serial.MessageType;

public interface Message {

	public Message parse(ByteArrayInputStream wireData) throws IOException;
	
	public ByteArrayOutputStream wireData();
	
	public MessageType getType();
}
