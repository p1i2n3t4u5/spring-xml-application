package com.test.springxml.lifecyclexml;

public class Triangle {
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

	public void myInit() {
		System.out.println("myInit()  method of trangle is called");

	}

	public void myDestroy() {
		System.out.println("myDestroy() method of trangle is called");

	}
}
