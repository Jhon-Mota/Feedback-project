package com.api.feedback;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;


@SpringBootApplication(exclude= {SecurityAutoConfiguration.class})
public class FeedbackApplication {
	public static void main(String[] args) {
		SpringApplication.run(FeedbackApplication.class, args);	
	}



}
