package com.simplilearn.diamondproblem;

public class Child implements A,B{

	@Override
	public void print() {
		System.out.println("Prin method called");
	}

	public static void main(String[] args) {
		
		Child c= new Child();
		c.print();
		
		A a = new Child();
		B b = new Child();
		a.print();
		b.print();
	}
}
