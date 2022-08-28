package com.simplilearn.inheritance;

//child
public class B extends A{

	public B() {
		super(10);
		System.out.println("Child class constructor");
	}
	public static void main(String[] args) {
		
		//create object of child class
		B b = new B();
		b.print(); // child can access the properties and behaviour of parent class
	}
}
