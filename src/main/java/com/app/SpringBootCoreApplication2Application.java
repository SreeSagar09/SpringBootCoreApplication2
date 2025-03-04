package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootCoreApplication2Application {

	public static void main(String[] args) {
		SpringApplication springApplication = new SpringApplication(SpringBootCoreApplication2Application.class);
		springApplication.run(args);
	}

}
