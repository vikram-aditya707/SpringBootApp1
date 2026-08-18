package com.example.SpringBootApp1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages ="com.example.model")
public class SpringBootApp1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootApp1Application.class, args);
	}

}