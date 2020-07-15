package com.example.demo;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient(name="limits-service", url="localhost:8080")
//@FeignClient(name="flight-booking-limits-service", url="localhost:8765/limits-service")
@FeignClient(name="flight-booking-limits-service", url="localhost:8080")
public interface MyProxyForConfig {
	@GetMapping("/maximum")
	public ResponseEntity<Object> getMAxFromConf();
	
	@GetMapping("/flexi")
	public ResponseEntity<Object> getFlexiFromConf(); 	
}