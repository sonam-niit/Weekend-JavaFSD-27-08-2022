package com.simplilearn.inner;

public class Outer {
	private int num=10;
	class Inner{
		int innerVariable=30;
		void display() {
			System.out.println("Inner class Display method called");
			System.out.println("Display: "+innerVariable);
			System.out.println("Can access outer class variables "+num);
		}
		class Depth{
			 void print() {
				 System.out.println("Depth class print method");
			 }
		}
	}
	public static void main(String[] args) {
		//let's create an object of Outer class
		Outer outer= new Outer();
		//Let's create an object of Inner Class
		Outer.Inner inner= outer. new Inner();
		inner.display();
		Outer.Inner.Depth depth= inner. new Depth();
		depth.print();
	}
}
