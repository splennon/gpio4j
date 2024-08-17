package org.overworld.gpio4j.serial;

import lombok.Getter;

/**
 * Facilitates the handling of byte values as nibbles spread over two bytes
 */
public class LineByte {

	private int data = 0;
	
	/**
	 * Construct a byte from an int with only the low 8 bits set
	 * 
	 * @param b the value to use
	 * @throws IllegalArgumentException if the parameter is greater than a byte (more than 8 bits are used)
	 */
	public LineByte(int b) {
		
		if ((b & 0b1111111_11111111_11111111_00000000) != 0) {
			throw new IllegalArgumentException("The parameter contains more than eight bits: " + Integer.toBinaryString(b));
		}
		
		data = b & 0b00000000_00000000_00000000_11111111;
	}
	
	/**
	 * Construct a byte with parameter provided
	 * 
	 * @param b the value to use
	 */
	public LineByte(byte b) {
		data = b & 0b00000000_00000000_00000000_11111111;
	}
	
	/**
	 * Construct a byte from two bytes containing the low and high nibble respectively
	 * 
	 * @param hi the high nibble (four bits)
	 * @param lo the low nibble (four bits)
	 * @throws IllegalArgumentException either parameter is greater than a nibble (more than 4 bits are used)
	 */
	public LineByte(int hi, int lo) {
		
		if ((hi & 0b1111111_11111111_11111111_11110000) != 0) {
			throw new IllegalArgumentException("Hi byte contains more than four bits: " + Integer.toBinaryString(hi));
		}
		
		if ((lo & 0b1111111_11111111_11111111_11110000) != 0) {
			throw new IllegalArgumentException("Lo byte contains more than four bits: " + Integer.toBinaryString(lo));
		}
		
		data = hi & 0b00000000_00000000_00000000_00001111;
		data = (data << 4) | (lo & 0b00000000_00000000_00000000_00001111);
	}
	
	/**
	 * @return the value as a byte
	 */
	public byte asByte() {
		return (byte) (data & 0b00000000_00000000_00000000_11111111);
	}
	
	/**
	 * @return the hi nibble of the value
	 */
	public byte getHi() {
		return  (byte) ((data & 0b00000000_00000000_00000000_11110000) >>> 4);
	}
	
	/**
	 * @return the lo nibble of the value
	 */
	public byte getLo() {
		return (byte) (data & 0b00000000_00000000_00000000_00001111);
	}

	/**
	 * @return the hi and lo nibbles of the value in that order
	 */
	public byte[] getHiLo() {
		return new byte[] {this.getHi(), this.getLo()};
	}
	
	/**
	 * @return the value as an int, without sign extension, of which only the low 8 bits are used
	 */
	public int asInt() {
		return data;
	}
	
	public String toString() {
		return Integer.toBinaryString(data);
	}
}
