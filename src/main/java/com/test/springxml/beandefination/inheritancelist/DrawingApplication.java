package com.test.springxml.beandefination.inheritancelist;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApplication {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans10.xml");
		Triangle triangle = (Triangle) applicationContext.getBean("triangle1");
		System.out.println(triangle);
		triangle.draw();

	}

}
