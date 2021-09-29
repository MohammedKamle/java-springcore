package com.springcore.autowire.withannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	
	/*
	 * We can use this annotation above Address variable as shown below, or we can
	 * also use it above setter method or constructor, spring container will set the value of Adress 
	 * accordingly.
	 * 
	 * @Qualifier will help us specify the exact Address bean which we need to inject if we have multiple
	 * bean of the same type "Address"
	 * */
	
	@Autowired
	@Qualifier("address2")
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
