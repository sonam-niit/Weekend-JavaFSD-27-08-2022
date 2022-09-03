package com.simplilearn.polymorphism;

public class MethodOverload {

	public int add(int a,int b) {
		return a+b;
	}
	public double add(double a, double b) {
		return a+b;
	}
	public float add(float a,float b) {
		return a+b;
	}
	public int add(int a,int b, int c) {
		return a+b+c;
	}
	
	public static void main(String[] args) {
		MethodOverload m= new MethodOverload();
		System.out.println("Double Addition: "+m.add(2.3, 4.5));
		System.out.println("Float addition: "+m.add(4.5f, 1.2f));
		System.out.println("Int addition: "+m.add(34, 34));
		System.out.println("Int 3 addition: "+m.add(7, 8, 9));
		
		
	}
}
