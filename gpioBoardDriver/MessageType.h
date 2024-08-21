#ifndef MESSAGETYPE_H
#define MESSAGETYPE_H

enum MessageType {
  MT_READ = 1,
  MT_WRITE = 2,
  MT_CONFIG = 3,
  MT_DECONFIG = 4,
  MT_DUMP = 5,
  MT_DIGITAL = 6,
  MT_ANALOG = 7,
  MT_INTERRUPT = 8,
  MT_NOTIFY = 9
};

#endif // MESSAGETYPE_H