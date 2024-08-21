#ifndef PINTYPE_H
#define PINTYPE_H

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

#endif // PINTYPE_H