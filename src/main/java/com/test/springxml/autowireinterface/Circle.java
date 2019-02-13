package com.test.springxml.autowireinterface;

public class Circle implements Shape {

	private Point center;

	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

	@Override
	public void draw() {
		System.out.println("Drawing Circle with center"+center);

	}

}
