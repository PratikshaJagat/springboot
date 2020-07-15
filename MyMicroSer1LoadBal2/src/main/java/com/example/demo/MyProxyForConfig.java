package com.example.demo;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="limits-service", url="localhost:8080")
public interface MyProxyForConfig {
	@GetMapping("/limits")
	public String retrieveLimitsFromConfigurations(); 
}
