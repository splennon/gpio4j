#ifndef EXECUTOR_H
#define EXECUTOR_H

#include "Arduino.h"
#include "serial.h"

class Executor {

public:

  Executor() = default;
  ~Executor() = default;

  void execHostMessage(serial::HostMessage message);

private:
};

#endif  // EXECUTOR_H
