#include <time.h>
#include "settings.h"
#include "Comms.h"

void setup() {
  Serial.begin(SERIAL_BAUD);

}

void loop() {

  getNextMessage();
  delay(10);
}
