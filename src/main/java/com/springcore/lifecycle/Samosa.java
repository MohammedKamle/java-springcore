package com.springcore.lifecycle;

public class Samosa {
	
	private double price;
	
	public Samosa() {
		super();
		// TODO Auto-generated constructor stub
	}


	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting the samosa price property");
		this.price = price;
	}
	
	// life cycle methods(init() and destroy()), reference given in bean tag in xml
	public void init() {
		System.out.println("Inside init() method through xml");
	}
	public void destroy() {
		System.out.println("Inside destroy() method through xml");
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
	

}
