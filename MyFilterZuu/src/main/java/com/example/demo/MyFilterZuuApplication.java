package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableZuulProxy
public class MyFilterZuuApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyFilterZuuApplication.class, args);
	}
	
	 
    @Bean
    public MyLogZuul preFilter() {
        return new MyLogZuul();
    }

}
