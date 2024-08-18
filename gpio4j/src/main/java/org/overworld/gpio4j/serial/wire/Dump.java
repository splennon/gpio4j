package org.overworld.gpio4j.serial.wire;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

import org.overworld.gpio4j.serial.MessageType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.With;

@AllArgsConstructor
@With
@Data
public class Dump implements Message {

	@Override
	public Dump parse(ByteArrayInputStream wireData) {
		return this;
	}

	@Override
	public ByteArrayOutputStream wireData() {
		return new ByteArrayOutputStream();
	}

	@Override
	public MessageType getType() {
		return MessageType.DUMP;
	}
}
