package com.springcore.constructorinjection;

import java.util.List;

public class Person {
	private String name;
	private int personId;
	private Certificate certi;
	private List<String> hobbies;
	
	

	public Person(String name, int personId, Certificate certi, List<String> hobbies ) {
		super();
		this.name = name;
		this.personId = personId;
		this.certi = certi;
		this.hobbies = hobbies;
	}



	@Override
	public String toString() {
		return "Person [name=" + name + ", personId=" + personId + ", certi=" + certi + ", hobbies=" + hobbies + "]";
	}



//	@Override
//	public String toString() {
//		return this.name+" : "+this.personId+" { "+this.certi.name+" } "+this.hobbies;
//	}
	
	





	
	
	
	
	
	
}
