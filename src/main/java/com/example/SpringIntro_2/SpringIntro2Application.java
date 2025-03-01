package com.example.SpringIntro_2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.SpringIntro_2.component.DemoBean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org. springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringIntro2Application {
	public static final Logger logger = LoggerFactory.getLogger(SpringIntro2Application.class);

	//Run | Debug
	public static void main(String[] args) {
		logger.debug("Welcome to Spring Concept Demo");
		ApplicationContext context = SpringApplication.run(SpringIntro2Application.class, args);
		logger.debug("Checking Context: {}", context.getBean(DemoBean.class));
		logger.debug("\n *** Example Using @Autowire annotation on property *** ");

	}
}