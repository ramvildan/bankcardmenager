package com.javamaster.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class BankCardDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankCardDemoApplication.class, args);
	}

}
