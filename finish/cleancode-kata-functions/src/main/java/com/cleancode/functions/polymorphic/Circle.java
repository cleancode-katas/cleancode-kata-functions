package com.cleancode.functions.polymorphic;

import java.awt.Point;

public class Circle implements Shape {
	
	private Point center;
	private double radius;
	public final double PI = 3.141592653589793;

	public double area() {
		return PI * radius * radius;
	}
}