package com.kh.test.shape.model.vo;

public class Circle {
	public double PI = Math.PI;
	private int radius;
	
	public Circle() {
	}
	public Circle(int radius) {
		this.radius = radius;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public void draw() {
		System.out.println("반지름 " + radius + "cm인 원을 그립니다.");
	}
}
