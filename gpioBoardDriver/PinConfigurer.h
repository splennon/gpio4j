
#ifndef PIN_CONFIGURER_H
#define PIN_CONFIGURER_H

#define DIGITAL_WRITE 1
#define DIGITAL_READ 2
#define ANALOG_WRITE 3
#define ANALOG_READ 4
#define PWM 5
#define BUFFER 6
#define COSINE 7

#include <map>
#include "Arduino.h"

class PinConfigurer {

public:

  PinConfigurer() = default;
  ~PinConfigurer() = default;

  void add(int pin, int type, bool interrupt);
  void remove(int pin);

private:
  std::map<int, int> config;
};

#endif  // PIN_CONFIGURER_H