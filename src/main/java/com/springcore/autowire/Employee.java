package com.springcore.autowire;

public class Employee {
	
	private Address address;

	public Employee(Address address) {
		super();
		System.out.println("Inside Employee constructor");
		this.address = address;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		System.out.println("inside Employee setter method");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}
	
	

}
