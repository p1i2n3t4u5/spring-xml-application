package com.test.springxml.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Triangle implements InitializingBean,DisposableBean {
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
		System.out.println("afterPropertiesSet()  means init method of trangle is called");

	}

	@Override
	public void destroy() throws Exception {
		System.out.println("destroy() method DisposableBean is called");
		
	}
}
