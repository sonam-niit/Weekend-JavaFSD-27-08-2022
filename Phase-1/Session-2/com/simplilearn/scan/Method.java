package com.simplilearn.scan;

public class Method {

	//method which return nothing and without any parameter
	public void print() {
		System.out.println("Print method called");
	}
	//method return nothing and with 2 int parameters
	public void calculate(int a,int b) {
		System.out.println("Addition "+(a+b));
	}
	public void fullname(String fname, String mname,String lname) {
		System.out.println("Fullname is "+fname+" "+mname+" "+lname);
	}
	
	public static void main(String[] args) {
		Method m= new Method();
		m.print();
		m.fullname("alex", "david", "john");
		m.calculate(10, 20); //call by value
	}
}
