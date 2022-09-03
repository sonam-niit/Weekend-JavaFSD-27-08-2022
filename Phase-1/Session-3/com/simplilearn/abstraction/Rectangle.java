package com.simplilearn.abstraction;

public class Rectangle extends Shape{

	private double length;
	private double width;
	
	public Rectangle(String color,double length,double width) {
		super(color);
		this.length=length;
		this.width=width;
	}
	@Override
	double area() {
		return length * width;
	}

	public String toString() {
		return "Rectangle color: "+getColor()+" and Area: "+area();
	}
	//when you print object it will call its toString method directly
}
