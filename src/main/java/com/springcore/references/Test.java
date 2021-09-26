package com.springcore.references;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/references/refconfig.xml");
		A aReference = (A) context.getBean("aReference");
		System.out.println(aReference.getX());
		System.out.println(aReference.getOb().getY());
	}

}
