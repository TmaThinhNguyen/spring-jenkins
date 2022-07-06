package com.java.demojenkins;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DemoJenkinsApplicationTests {

	public static Logger logger = LoggerFactory.getLogger(DemoJenkinsApplication.class);

	@Test
	public contextLoads() {
		logger.info("Test case excuting...");
		logger.info("Test case excuting second log statement....");
		assertEquals(true, true);
	}

}
