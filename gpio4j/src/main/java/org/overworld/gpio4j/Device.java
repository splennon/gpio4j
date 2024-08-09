package org.overworld.gpio4j;

import org.overworld.gpio4j.serial.HostMessage;
import org.overworld.gpio4j.serial.PinType;

import com.google.protobuf.InvalidProtocolBufferException;

public class Device {

	public void play() throws InvalidProtocolBufferException {
		
		HostMessage.Builder mess = HostMessage.newBuilder();
		mess.getConfigBuilder().setPin(23).setType(PinType.ANALOG_OUT);
		HostMessage m = mess.build();
		
		System.out.println(m.getMessageCase());
		
		
		HostMessage.Builder mess2 = HostMessage.newBuilder();	
		
		mess2.mergeFrom(m.toByteString());
		System.out.println(mess2);
		
	}
	
	public static void main(String[] args) throws InvalidProtocolBufferException {
		(new Device()).play();
	}
}
