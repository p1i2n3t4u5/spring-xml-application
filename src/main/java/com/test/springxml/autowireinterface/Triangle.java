package com.test.springxml.autowireinterface;

public class Triangle implements Shape {
	private Point pointA;
	private Point pointB;
	private Point pointC;
	private String name;

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Triangle [pointA=" + pointA + ", pointB=" + pointB + ", pointC=" + pointC + ", name=" + name + "]";
	}

	@Override
	public void draw() {
		System.out.println("Drawing Triangle [pointA=" + pointA + ", pointB=" + pointB + ", pointC=" + pointC
				+ ", name=" + name + "]");

	}

}
