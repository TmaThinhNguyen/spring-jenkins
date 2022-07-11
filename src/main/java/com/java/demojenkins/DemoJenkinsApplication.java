package com.java.demojenkins;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class DemoJenkinsApplication {

	public static Logger logger = LoggerFactory.getLogger(DemoJenkinsApplication.class);

	// @PostConstruct
	// public void int(){
	// 	logger.info("Application start...");
	// }

	public static void main(String[] args) {

		logger.info("Application excuted...");
		SpringApplication.run(DemoJenkinsApplication.class, args);
	}

}
