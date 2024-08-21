#ifndef MESSAGETYPE_H
#define MESSAGETYPE_H

enum MessageType {
  READ = 1,
  WRITE = 2,
  CONFIG = 3,
  DECONFIG = 4,
  DUMP = 5,
  DIGITAL = 6,
  ANALOG = 7,
  INTERRUPT = 8,
  NOTIFY = 9
};

#endif
