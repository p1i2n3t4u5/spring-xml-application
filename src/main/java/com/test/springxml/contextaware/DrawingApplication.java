package com.test.springxml.contextaware;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApplication {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans8.xml");
		Triangle triangle = (Triangle) applicationContext.getBean("triangle");
		System.out.println(triangle);

	}

}
