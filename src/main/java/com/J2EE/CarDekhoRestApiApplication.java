package com.J2EE;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CarDekhoRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarDekhoRestApiApplication.class, args);
		System.err.println("API Started....");
	}

}
