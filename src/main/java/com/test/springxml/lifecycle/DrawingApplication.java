package com.test.springxml.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//only issue in this approach Triangle class is no more 
//pojo as it is iplimenting spring provided interfaces

public class DrawingApplication {
	public static void main(String[] args) {
		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans11.xml");
		//this method will register hook so that when program ends beans will be destroyed
		applicationContext.registerShutdownHook();
		Triangle triangle = (Triangle) applicationContext.getBean("triangle");
		System.out.println(triangle);
		//for closing application context
		applicationContext.close();
	}

}
