package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!, I am in constructor-injection branch");
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		// Dependency injection
		/*
		 * We will get the object from XML without creating it with the new keyword. The
		 * benefit of this will be, we just need to change the values from xml without
		 * doing anything in java code
		 */
		Student student1 = (Student) context.getBean("student1");
		System.out.println(student1);
		
		Student student2 = (Student) context.getBean("student2");
		System.out.println(student2);
		
		Student student3 = (Student) context.getBean("student3");
		System.out.println(student3);

	}
}
