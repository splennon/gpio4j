#include "LineByte.h"

/**
 * Facilitates the handling of byte values as nibbles spread over two bytes
 */
class LineByte {
private:
    int data = 0;

public:
    /**
     * Construct a byte from an int with only the low 8 bits set
     * 
     * @param b the value to use
     * @throws std::invalid_argument if the parameter is greater than a byte (more than 8 bits are used)
     */
    LineByte(int b) {
        if ((b & 0b1111111111111111111111100000000) != 0) {
            throw std::invalid_argument("The parameter contains more than eight bits: " + std::bitset<32>(b).to_string());
        }
        
        data = b & 0b00000000000000000000000011111111;
    }
    
    /**
     * Construct a byte with parameter provided
     * 
     * @param b the value to use
     */
    LineByte(char b) {
        data = b & 0b00000000000000000000000011111111;
    }
    
    /**
     * Construct a byte from two bytes containing the hi and lo nibble respectively
     * 
     * @param hi the high nibble (four bits)
     * @param lo the low nibble (four bits)
     * @throws std::invalid_argument either parameter is greater than a nibble (more than 4 bits are used)
     */
    LineByte(int hi, int lo) {
        if ((hi & 0b11111111111111111111111111110000) != 0) {
            throw std::invalid_argument("Hi byte contains more than four bits: " + std::bitset<32>(hi).to_string());
        }
        
        if ((lo & 0b11111111111111111111111111110000) != 0) {
            throw std::invalid_argument("Lo byte contains more than four bits: " + std::bitset<32>(lo).to_string());
        }
        
        data = hi & 0b00000000000000000000000000001111;
        data = (data << 4) | (lo & 0b00000000000000000000000000001111);
    }
    
    /**
     * Construct a byte from a byte array containing the hi and lo nibble respectively
     * 
     * @param hi the high nibble (four bits)
     * @param lo the low nibble (four bits)
     * @throws std::invalid_argument either parameter is greater than a nibble (more than 4 bits are used)
     */
    LineByte(const std::vector<char>& ba) : LineByte(ba[0], ba[1]) {}
    
    /**
     * @return the value as a byte
     */
    char asByte() const {
        return static_cast<char>(data & 0b00000000000000000000000011111111);
    }
    
    /**
     * @return the hi nibble of the value
     */
    char getHi() const {
        return static_cast<char>((data & 0b00000000000000000000000011110000) >> 4);
    }
    
    /**
     * @return the lo nibble of the value
     */
    char getLo() const {
        return static_cast<char>(data & 0b00000000000000000000000000001111);
    }

    /**
     * @return the hi and lo nibbles of the value in that order
     */
    std::vector<char> getHiLo() const {
        return {getHi(), getLo()};
    }
    
    /**
     * @return the value as an int, without sign extension, of which only the low 8 bits are used
     */
    int asInt() const {
        return data;
    }
    
    std::string toString() const {
        return std::bitset<32>(data).to_string();
    }
};
