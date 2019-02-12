package com.test.springxml.simple;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApplication {

//	@Autowired
//	Triangle triangle;
//
//	@Autowired
//	Triangle triangle2;

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		Triangle triangle = (Triangle) applicationContext.getBean("triangle");
		triangle.draw();
		System.out.println(triangle);

		Triangle triangle2 = (Triangle) applicationContext.getBean("triangle2");
		System.out.println(triangle2);
		triangle2.draw();

//		Triangle triangle3 = (Triangle) applicationContext.getBean(Triangle.class);
//		triangle3.draw();
//		System.out.println(triangle3);

//		DrawingApplication drawingApplication=new DrawingApplication();
//		drawingApplication.print();

	}

//	public void print() {
//		System.out.println("Hii"+triangle);
//		
//		System.out.println("Hello"+triangle2);
//	}

}
