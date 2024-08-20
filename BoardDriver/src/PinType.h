#ifndef PINTYPE_H
#define PINTYPE_H

#include <iostream>
#include <vector>
#include <optional>
#include <algorithm>

enum PinType {
  DIGITAL_IN = 1,
  DIGITAL_IN_PULLUP = 2,
  DIGITAL_OUT = 3,
  ANALOG_IN = 4,
  ANALOG_OUT = 5,
  COSINE = 6,
  BUFFER = 7,
  PWM = 8
};

class PinTypeHelper {
public:
  static uint8_t getId(PinType type);

  static PinType forId(uint8_t id);
};

#endif
