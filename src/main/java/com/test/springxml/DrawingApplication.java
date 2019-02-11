package com.test.springxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApplication {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		Triangle triangle = (Triangle) applicationContext.getBean("trangle");
		triangle.draw();
		System.out.println(triangle);

//		Triangle triangle2 = (Triangle) applicationContext.getBean(Triangle.class);
//		triangle2.draw();
//		System.out.println(triangle2);

	}

}
