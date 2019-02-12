package com.test.springxml.beandefination.inheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApplication {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans9.xml");
		Triangle triangle = (Triangle) applicationContext.getBean("triangle1");
		System.out.println(triangle);
		
		Triangle triangle2 = (Triangle) applicationContext.getBean("triangle2");
		System.out.println(triangle2);

	}

}
