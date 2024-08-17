package org.overworld.gpio4j.serial.wire;

import org.overworld.gpio4j.serial.MessageType;

public interface Message extends MessagePart {

	public MessageType getType();
}
