#include "Comms.h"

Comms::Comms() {
  Serial.setTimeout(SERIAL_TIMEOUT);
}

void Comms::sendBoardMessage(::serial::BoardMessage message) {
  // TODO: PAULA IMPLEMENT WITH THINKY-THOUGHTY
}

::serial::HostMessage Comms::receiveHostMessage() {

  //uint8_t sizeBuffer[2];

  //size_t read = Serial.readBytes(sizeBuffer, 2);

}