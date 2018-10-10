package com.cleancode.functions.polymorphic;

import java.awt.Point;

public class Square implements Shape {
	
	private Point topLeft;
	private double side;

	public double area() {
		return side * side;
	}
}