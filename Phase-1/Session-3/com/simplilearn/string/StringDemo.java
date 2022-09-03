package com.simplilearn.string;

public class StringDemo {

	public static void main(String[] args) {
		
		String s1= "Hello World";
		String s2= "Hello World";
		
		String s3= new String("Hello World");
		String s4= new String("Hello World");
		
		System.out.println(s1==s2);
		System.out.println(s3==s4);
	}
}
