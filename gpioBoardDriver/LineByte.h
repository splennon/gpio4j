#ifndef LINEBYTE_H
#define LINEBYTE_H

#include <iostream>
#include <stdexcept>
#include <vector>
#include <bitset>

class LineByte {

private:
  uint8_t data;

public:

  LineByte(uint8_t b);

  LineByte(uint8_t hi, uint8_t lo);

  LineByte(const std::vector<uint8_t>& ba)
    : LineByte(ba[0], ba[1]) {};

  uint8_t getHi();

  uint8_t getLo();

  uint8_t asByte();

  std::vector<uint8_t> getHiLo();

  std::string toString();
};

#endif
