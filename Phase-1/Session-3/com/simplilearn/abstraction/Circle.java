package com.simplilearn.abstraction;

public class Circle extends Shape{

	private double radius;
	public Circle(String color,double radius) {
		super(color);
		this.radius= radius;
	}
	@Override
	double area() {
		return Math.PI * Math.pow(radius, 2);
	}

	public String toString() {
		return "Circle color: "+getColor()+" and Area: "+area();
	}
}
