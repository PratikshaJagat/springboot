package com.example.demo;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient(name="cur-exch-ser", url="localhost:8000")
@FeignClient(name="cur-exch-ser")
@RibbonClient(name="cur-exch-ser")
public interface MyProxy {
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ExchangeValue retrieveExchangeValue(@PathVariable String from, @PathVariable String to);	
}
