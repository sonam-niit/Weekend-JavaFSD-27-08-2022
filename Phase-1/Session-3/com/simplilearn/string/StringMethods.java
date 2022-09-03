package com.simplilearn.string;

public class StringMethods {

	public static void main(String[] args) {
		
		String s1= "Hello World";
		
		System.out.println("Length of String: "+s1.length());
		System.out.println("Contains World? "+s1.contains("World"));
		System.out.println("Character at Index 4: "+s1.charAt(4));
		System.out.println("Uppercase: "+s1.toUpperCase());
		System.out.println("LoweCase: "+s1.toLowerCase());
		System.out.println("Concat: "+s1.concat("Test"));
		System.out.println("Sub String: "+s1.substring(6));
		System.out.println("Sub STring: "+s1.substring(0, 5));
		
		String s2= new String("hello world");
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		
	}
}
