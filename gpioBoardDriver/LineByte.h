#ifndef LINEBYTE_H
#define LINEBYTE_H

#include <iostream>
#include <stdexcept>
#include <vector>
#include <bitset>

/**
 * Facilitates the handling of byte values as nibbles spread over two bytes
 */
class LineByte {
private:
    int data;

public:
    /**
     * Construct a byte from an int with only the low 8 bits set
     * 
     * @param b the value to use
     * @throws std::invalid_argument if the parameter is greater than a byte (more than 8 bits are used)
     */
    LineByte(int b);
    
    /**
     * Construct a byte with parameter provided
     * 
     * @param b the value to use
     */
    LineByte(char b);
    
    /**
     * Construct a byte from two bytes containing the hi and lo nibble respectively
     * 
     * @param hi the high nibble (four bits)
     * @param lo the low nibble (four bits)
     * @throws std::invalid_argument either parameter is greater than a nibble (more than 4 bits are used)
     */
    LineByte(int hi, int lo);
    
    /**
     * Construct a byte from a byte array containing the hi and lo nibble respectively
     * 
     * @param hi the high nibble (four bits)
     * @param lo the low nibble (four bits)
     * @throws std::invalid_argument either parameter is greater than a nibble (more than 4 bits are used)
     */
    LineByte(const std::vector<char>& ba) : LineByte(ba[0], ba[1]);
    
    /**
     * @return the value as a byte
     */
    char asByte();
    
    /**
     * @return the hi nibble of the value
     */
    char getHi();
    
    /**
     * @return the lo nibble of the value
     */
    char getLo();

    /**
     * @return the hi and lo nibbles of the value in that order
     */
    std::vector<char> getHiLo();
    
    /**
     * @return the value as an int, without sign extension, of which only the low 8 bits are used
     */
    int asInt();
    
    std::string toString();
};

#endif