package com.example.demo;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MyCtr {
	
	@Autowired
	private MyProxy proxy;
	@Autowired
	private MyProxyForConfig proxyConf;
	
	@GetMapping("/currency-converter/from/{from}/to/{to}/quantity/{quantity}")
	public String convertCurrency(@PathVariable String from,
			@PathVariable String to,
			@PathVariable BigDecimal quantity
			){
		
		ExchangeValue response = proxy.retrieveExchangeValue(from, to);
		String maxInt = proxyConf.retrieveLimitsFromConfigurations();
		System.out.println(maxInt);
		BigDecimal multiplier = response.getConversionMultiple();
		BigDecimal max = new BigDecimal(maxInt);
		if(quantity.compareTo(max)>0) {
			multiplier = multiplier.subtract(new BigDecimal(1));
		}
		
		String resp = "Port No :: " + response.getPort() + " Calculated Value :: " + quantity.multiply(multiplier);
		
		return resp ; 
	}
	

}
