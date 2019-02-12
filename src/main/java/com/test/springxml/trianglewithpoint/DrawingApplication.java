package com.test.springxml.trianglewithpoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApplication {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans2.xml");
		Triangle triangle = (Triangle) applicationContext.getBean("triangle");
		System.out.println(triangle); 
		
		System.out.println(triangle.getPointA());
		System.out.println(triangle.getPointA().getX());
		triangle.getPointA().setX(50);
		Triangle triangle2 = (Triangle) applicationContext.getBean("triangle2");
		System.out.println(triangle2); 
		
		System.out.println(triangle2.getPointA());
		System.out.println(triangle2.getPointA().getX());
	}

}
