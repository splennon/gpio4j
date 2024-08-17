#ifndef COMMS_H
#define COMMS_H

#include "settings.h"
#include "serial.h"
#include "Arduino.h"
#include <WriteBufferFixedSize.h>
#include <ReadBufferFixedSize.h>

class Comms {

public:

  Comms();
  ~Comms() = default;

  ::serial::HostMessage receiveHostMessage();
  void sendBoardMessage(::serial::BoardMessage message);

private:

  EmbeddedProto::ReadBufferFixedSize<BUFFER_SIZE> read_buffer;
  EmbeddedProto::WriteBufferFixedSize<BUFFER_SIZE> write_buffer;
};

#endif  // COMMS_H
