package com.overworld.gpio.client;

import org.junit.jupiter.api.Test;
import org.overworld.gpio4j.Device;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GpioclientApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void loadDevice() {
		Device d = new Device();
	}
}
