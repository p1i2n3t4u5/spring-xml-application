package com.test.springxml.innerbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApplication {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans3.xml");
		Triangle triangle = (Triangle) applicationContext.getBean("triangle");
		System.out.println(triangle); 
		
		Triangle triangle2 = (Triangle) applicationContext.getBean("triangle_alias");
		System.out.println(triangle2); 
		
		Triangle triangle3 = (Triangle) applicationContext.getBean("triangle-name");
		System.out.println(triangle3); 
		
	}

}
