package com.cleancode.functions.polymorphic;

import java.awt.Point;

public class Rectangle implements Shape {
	
	private Point topLeft;
	private double height;
	private double width;

	public double area() {
		return height * width;
	}
}