package com.simplilearn.typecasting;

public class ExplicitTypeCast {

	public static void main(String[] args) {
		
		int a=10;
		//convert int to byte
		byte b=(byte) a;//convert forcefully 
		
		System.out.println("int "+a);
		System.out.println("Byte: "+b);
		
		double d= 20.890;
		int i=(int) d;
		System.out.println("Double: "+d);
		System.out.println("Int: "+i);
	}
}
