package com.test.springxml.autowireinterface;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DrawingApplication {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans15.xml");
		Triangle triangle = (Triangle) applicationContext.getBean("triangle");
		System.out.println(triangle);
		triangle.draw();
		Circle circle = (Circle) applicationContext.getBean("circle");
		System.out.println(triangle);
		circle.draw();
		
		//coding by interface
		Shape shape = (Shape) applicationContext.getBean("circle");
		shape.draw();

	}

}
