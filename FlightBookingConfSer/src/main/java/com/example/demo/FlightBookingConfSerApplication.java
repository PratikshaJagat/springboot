package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class FlightBookingConfSerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlightBookingConfSerApplication.class, args);
	}

}
