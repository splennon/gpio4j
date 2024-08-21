#include "Comms.h"
#include "MessageType.h"
#include "PinType.h"

uint8_t bytes[BUFFER_SIZE];

void readMessage(uint8_t pin);
void digitalWriteMessage(uint8_t pin, uint8_t data, uint64_t ts);
void analogWriteMessage(uint8_t pin, uint8_t data, uint64_t ts);
void configMessage(uint8_t pin, PinType pinType, bool interrupt);
void deconfigMessage(uint8_t pin);
void dumpMessage();

uint8_t[] digitalNotifyMessage(uint8_t pin, bool data, bool interrupt);
uint8_t[] analogNotifyMessage(uint8_t pin, uint8_t data, bool interrupt);

void getNextMessage() {

  if (Serial.available()) {
    int r = Serial.readBytes(bytes, 1);

    // READ(1), WRITE(2), CONFIG(3), DECONFIG(4), DUMP(5), DIGITAL(6), ANALOG(7), INTERRUPT(8), NOTIFY(9);

    if (r) {
      switch (bytes[0]) {
        case MessageType::MT_READ:
          {
            Serial.readBytes(bytes, 2);
            readMessage(LineByte(bytes[0], bytes[1]).asByte());
            break;
          }
        case MessageType::MT_WRITE:
          {
            Serial.read(bytes, 3);
            uint8_t pin = LineByte(bytes[0], bytes[1]).asByte();
            uint8_t data;
            MessageType dataType;
            switch (bytes[2]) {
              case MessageType::MT_DIGITAL:
                {
                  dataType = MessageType::MT_DIGITAL;
                  Serial.read(bytes, 1);
                  data = (bytes[0] > 0);
                  break;
                }
              case MessageType::MT_ANALOG:
                {
                  dataType = MessageType::MT_ANALOG;
                  Serial.read(bytes, 2);
                  data = LineByte(bytes[0], bytes[1]).asByte();
                  break;
                }
            }
            Serial.read(bytes, 8);
            int64_t ts = 0;
            for (int i = 0; i < 8; i++)
              ts = (ts << 8) | bytes[i];

            if (dataType == MessageType::MT_DIGITAL)
              digitalWriteMessage(pin, data, ts);
            else
              analogWriteMessage(pin, data, ts);
            break;
          }
        case MessageType::MT_CONFIG:
          {
            Serial.readBytes(bytes, 4);
            configMessage(LineByte(bytes[0], bytes[1]).asByte(), (PinType)bytes[2], (bytes[3] > 0));
            break;
          }
        case MessageType::MT_DECONFIG:
          {
            Serial.readBytes(bytes, 2);
            deconfigMessage(LineByte(bytes[0], bytes[1]).asByte());
            break;
          }
        case MessageType::MT_DUMP:
          {
            dumpMessage();
            break;
          }
        default:  // Out of Sync
          break;
      }
    }
  }
}

void readMessage(uint8_t pin) {}
void digitalWriteMessage(uint8_t pin, uint8_t data, uint64_t ts) {}
void analogWriteMessage(uint8_t pin, uint8_t data, uint64_t ts) {}
void configMessage(uint8_t pin, PinType pinType, bool interrupt) {}
void deconfigMessage(uint8_t pin) {}
void dumpMessage() {}

uint8_t[] digitalNotifyMessage(uint8_t pin, bool data, bool interrupt) {

}

uint8_t[] analogNotifyMessage(uint8_t pin, uint8_t data, bool interrupt) {

  
}
