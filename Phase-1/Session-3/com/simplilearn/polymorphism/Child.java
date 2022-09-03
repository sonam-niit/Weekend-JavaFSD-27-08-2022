package com.simplilearn.polymorphism;

public class Child extends Parent{

	public void test() {
		super.test();//call parent class method
		System.out.println("Child class Test method");
	}
}
