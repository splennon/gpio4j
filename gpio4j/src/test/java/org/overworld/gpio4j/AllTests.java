package org.overworld.gpio4j;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;
import org.overworld.gpio4j.serial.LineByteTest;
import org.overworld.gpio4j.serial.PinTypeTest;
import org.overworld.gpio4j.serial.wire.LineTypesTest;

@Suite
@SelectClasses({ LineByteTest.class, PinTypeTest.class, LineTypesTest.class })
public class AllTests {

}
