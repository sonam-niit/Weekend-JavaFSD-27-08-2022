package com.simplilearn.access1;

public class MyClass {

	//declared all variables in class
	
	public int numPublic=10;
	int numDefault=20; // default (in same package)
	protected int numProtected=30;
	private int numPrivate=40;
	
	public static void main(String[] args) {
		//let's try to access them in same class
		MyClass obj= new MyClass(); //object created for MyClass
		System.out.println("Public: "+obj.numPublic);
		System.out.println("Default: "+obj.numDefault);
		System.out.println("Protected: "+obj.numProtected);
		System.out.println("Private: "+obj.numPrivate);
	}
	
}
//In same class all type of variables are accessible
