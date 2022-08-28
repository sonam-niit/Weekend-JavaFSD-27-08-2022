package com.simplilearn.scan;

public class Method1 {

	public String greetings() {
		return "Good Morning";
	}
	public int add(int a,int b) {
		return a+b;
	}
	public float cube(float n) {
		return n*n*n;
	}
	
	public static void main(String[] args) {
		Method1 m= new Method1();
		String res= m.greetings();
		System.out.println("Result is "+res);
		//directly call the function in syso
		System.out.println("Addition "+ m.add(5, 7));
		System.out.println("Cube of 4 is "+ m.cube(4.0f));
		
	}
}
