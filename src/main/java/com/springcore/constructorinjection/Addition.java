package com.springcore.constructorinjection;

public class Addition {
	
	private int a;
	private int b;
	
	public Addition(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("Constructor with int called.");
	}
	
	public Addition(double a, double b) {
		this.a = (int) a;
		this.b = (int) b;
		System.out.println("Constructor with double called.");
	}
	
	public Addition(String a, String b) {
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
		System.out.println("Constructor with String called.");
	}
	
	
	public void doSum() {
		System.out.println("Sum is "+(this.a+this.b));
	}

}
