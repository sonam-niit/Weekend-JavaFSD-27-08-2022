package com.simplilearn.typecasting;

public class ImplicitTypeCast {

	public static void main(String[] args) {
		//implicit conversion
		byte a=10;
		short b=a; //converting byte to short
		int c=b; //converting short to int
		long d=c; //convert int to long
		float e= d; //convert long to float
		double f=e; //convert float to double
		
		System.out.println("Byte "+a);
		System.out.println("Long "+d);
		System.out.println("Double "+f);
	}
}
