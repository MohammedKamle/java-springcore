package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Vada {
	
	private String price;

	public Vada() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Inside init() method through annotation");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Inside destroy() method through annotation");
	}

	@Override
	public String toString() {
		return "Vada [price=" + price + "]";
	}
	
	

}
