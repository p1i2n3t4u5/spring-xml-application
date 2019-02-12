package com.test.springxml.lifecyclexml;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//only issue in this approach Triangle class is no more 
//pojo as it is implementing  spring provided interfaces
//These callback methods are not called for prototype bean

//we can have both  Have implementation of InitializingBean and DisposibleBean and init-method="myInit"
//destroy-method="myDestroy" at the same time also

public class DrawingApplication {
	public static void main(String[] args) {
		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans12.xml");
		// this method will register hook so that when program ends beans will be
		// destroyed
		applicationContext.registerShutdownHook();
		Triangle triangle = (Triangle) applicationContext.getBean("triangle");
		System.out.println(triangle);
		// for closing application context
		applicationContext.close();
	}

}
