package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		//ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
		
		/*
		 * Here, we will use AbstractApplicationContext in order to have access to 
		 * context.registerShutdownHook() and so it calls the destroy() method in Samosa class. 
		 * */
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
		Samosa s1 = (Samosa) context.getBean("s1");
		System.out.println(s1);
		
		// registering shutdown hook
		context.registerShutdownHook();

	}

}
