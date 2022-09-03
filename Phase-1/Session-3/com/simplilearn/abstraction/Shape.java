package com.simplilearn.abstraction;

public abstract class Shape {

	private String color;
	// constructor
	public Shape(String color) {
		this.color = color;
	}
	// getter method
	public String getColor() {
		return color;
	}
	// abstract method
	abstract double area();
}
