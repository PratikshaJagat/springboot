package com.example.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("flight")
public class FlightConfiguration {
	
	private int maximum;
	private String flexi;
	private String flexirate;

	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}

	public int getMaximum() {
		return maximum;
	}

	public String getFlexi() {
		return flexi;
	}

	public void setFlexi(String flexi) {
		this.flexi = flexi;
	}

	public String getFlexirate() {
		return flexirate;
	}

	public void setFlexirate(String flexirate) {
		this.flexirate = flexirate;
	}
	
	

}
