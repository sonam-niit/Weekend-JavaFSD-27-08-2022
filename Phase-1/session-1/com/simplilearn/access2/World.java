package com.simplilearn.access2;

import com.simplilearn.access1.MyClass;

public class World {

	public static void main(String[] args) {
		//let's try to access them in same class
		MyClass obj= new MyClass(); //object created for MyClass
		System.out.println("Public: "+obj.numPublic);
		System.out.println("Default: "+obj.numDefault);
		System.out.println("Protected: "+obj.numProtected);
		System.out.println("Private: "+obj.numPrivate);
	}
}
