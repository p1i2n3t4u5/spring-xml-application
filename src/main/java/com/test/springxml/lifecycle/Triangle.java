package com.test.springxml.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware,
		ApplicationContextAware, BeanPostProcessor {
	private Point pointA;
	private Point pointB;
	private Point pointC;

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}
//		@Override
//		public String toString() {
//			return "Point [pointA=" + pointA + ", pointB=" + pointB + ", pointC=" + pointC + "]";
//		}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet() of InitializingBean  means init method of trangle is called");

	}

	@Override
	public void destroy() throws Exception {
		System.out.println("destroy() method DisposableBean is called");

	}

	@Override
	public void setBeanName(String name) {
		System.out.println("setBeanName() of BeanNameAware:" + name);

	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("setBeanFactory() of BeanFactoryAware");

	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("setApplicationContext() of ApplicationContextAware ");

	}
	
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("postProcessBeforeInitialization() BeanPostProcessor");
		return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
	}
	
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("postProcessAfterInitialization() BeanPostProcessor");
		return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
	}
	
	
	public void myInit() {
		System.out.println(" my custom init method  myInit() ");
	}
	
	public void myDestroy() {
		System.out.println(" my custom destroy method  myDestroy() ");
	}

}
