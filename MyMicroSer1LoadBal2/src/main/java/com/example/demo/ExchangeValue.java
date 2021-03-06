package com.example.demo;


import java.math.BigDecimal;


public class ExchangeValue {
	
	private Long id;
	
	private String from;
	
	private String to;
	
	private BigDecimal conversionMultiple;

	private int port;

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	
	public Long getId() {
		return id;
	}

	public String getFrom() {
		return from;
	}

	public String getTo() {
		return to;
	}

	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}
	
}
