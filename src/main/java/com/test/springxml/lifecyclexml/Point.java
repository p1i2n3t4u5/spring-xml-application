package com.test.springxml.lifecyclexml;

public class Point {

	private int x;
	private int y;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public void myInit() {
		System.out.println("myInit()   method of Point is called");

	}

	public void myDestroy() {
		System.out.println("myDestroy() method of Point is called");

	}

//	@Override
//	public String toString() {
//		return "Point [x=" + x + ", y=" + y + "]";
//	}

}
