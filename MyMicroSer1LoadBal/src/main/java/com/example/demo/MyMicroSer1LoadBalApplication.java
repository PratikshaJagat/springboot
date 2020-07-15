package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients("com.example.demo")
@SpringBootApplication
public class MyMicroSer1LoadBalApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyMicroSer1LoadBalApplication.class, args);
	}

}
