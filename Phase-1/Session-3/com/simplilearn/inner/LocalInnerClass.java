package com.simplilearn.inner;

public class LocalInnerClass {

	//write a class inside a method block
	//You can use it inside a method only because its a local scope
	public void display() {
		
		class Inner{
			int num=10;
			void print() {
				System.out.println("Print method called from inner class");
				System.out.println("Value: "+num);
			}
		}
		
		Inner inner= new Inner();
		inner.print();
	}
	
	public static void main(String[] args) {
		LocalInnerClass l= new LocalInnerClass();
		l.display();
	}
}
