package com.springcore.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/constructorinjection/ciconfig.xml");
		
		Person person1 = (Person) context.getBean("person1");
		Person person2 = (Person) context.getBean("person2");
		
		System.out.println(person1);
		System.out.println(person2);
		
		Addition addition = (Addition) context.getBean("addition");
		addition.doSum();
	}

}
