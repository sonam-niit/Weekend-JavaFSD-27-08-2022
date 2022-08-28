package com.simplilearn.scan;

public class StaticMethod {

	public static void test() {
		System.out.println("Test method called");
	}
	
	public static void main(String[] args) {
		
		//static method you can call directly without creating object of a class
		//classname.methodname
		StaticMethod.test();
	}
}
