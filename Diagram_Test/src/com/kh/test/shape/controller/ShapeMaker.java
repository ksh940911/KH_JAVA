package com.kh.test.shape.controller;

import com.kh.test.shape.model.vo.Circle;
import com.kh.test.shape.model.vo.RectAngle;

public class ShapeMaker {

	public static void main(String[] args) {
		Circle c1 = new Circle(20);
		Circle c2 = new Circle(40);
		Circle c3 = new Circle(50);
		
		RectAngle r1 = new RectAngle(20,20);
		RectAngle r2 = new RectAngle(50,60);
		
		c1.draw();
		c2.draw();
		c3.draw();
		System.out.println();
		r1.draw();
		r2.draw();
	}

}
