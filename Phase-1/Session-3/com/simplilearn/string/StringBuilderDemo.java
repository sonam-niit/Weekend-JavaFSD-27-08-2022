package com.simplilearn.string;

public class StringBuilderDemo {

	public static void main(String[] args) {
		
		String s1= new String("Hello World"); //immutable
		StringBuilder sb= new StringBuilder(s1); //mutable
		
		sb.append(" Test");
		System.out.println(sb);
		sb.replace(12, 16,"");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
	}
}
