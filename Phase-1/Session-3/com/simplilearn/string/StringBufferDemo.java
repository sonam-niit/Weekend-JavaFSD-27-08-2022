package com.simplilearn.string;

public class StringBufferDemo {

	public static void main(String[] args) {
		
		String s1= new String("Hello World"); //immutable
		StringBuffer buffer= new StringBuffer(s1); //mutable
		
		buffer.append(" Test");
		System.out.println(buffer);
		buffer.replace(6, 11,"User");
		System.out.println(buffer);
		buffer.reverse();
		System.out.println(buffer);
	}
}
