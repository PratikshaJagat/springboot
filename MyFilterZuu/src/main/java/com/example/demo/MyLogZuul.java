package com.example.demo;

import javax.servlet.http.HttpServletRequest;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

public class MyLogZuul extends ZuulFilter{

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public Object run() throws ZuulException {
		String s1 = "=============================================\n"
				+ "=============================================\n"
		+ "=============================================\n";
		System.out.println(s1);
		System.out.println("Zuul filter run hua.......");
		 RequestContext ctx = RequestContext.getCurrentContext();
		 HttpServletRequest request = ctx.getRequest();		 
		 System.out.println("Request Method : " + request.getMethod() + " Request URL : " + request.getRequestURL().toString());
			System.out.println(s1);		  
		return null;
	}

	@Override
	public String filterType() {
		return "pre";
	}

	@Override
	public int filterOrder() {
		return 1;
	}

}
