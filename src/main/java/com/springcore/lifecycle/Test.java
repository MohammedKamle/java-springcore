package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");

		Vada v1 = (Vada) context.getBean("v1");
		System.out.println(v1);
		// registering the shutdown hook, this will be called last, no matter where you
		// place it.
		context.registerShutdownHook();

	}

}
