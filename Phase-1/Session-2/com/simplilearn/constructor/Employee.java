package com.simplilearn.constructor;

public class Employee {

	private int id;
	private String name;
	private String email;
	public Employee() {
		System.out.println("Default Constructor");
	}
	public Employee(int id) {
		this.id=id;
	}
	public Employee(int id, String name) {
		this.id=id;
		this.name=name;
	}
	public Employee(String name,String email) {
		this.name=name;
		this.email=email;
	}
	public Employee(int id, String name, String email) {
		this.id=id;
		this.name=name;
		this.email=email;
	}
	public void printData() {
		System.out.println("Id: "+id);
		System.out.println("Name: "+name);
		System.out.println("Email: "+email);
	}
	public static void main(String[] args) {
		Employee e1= new Employee(1,"alex","alex@gmail.com");
		Employee e2= new Employee(2,"john","john@gmail.com");
		Employee e3= new Employee("test","test");
		e1.printData();
		e2.printData();
		e3.printData();
	}
}
