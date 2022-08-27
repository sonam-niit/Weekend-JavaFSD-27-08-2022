package com.simplilearn.typecasting;

public class CharacterConversion {

	public static void main(String[] args) {
		
		char a='A';
		int b=a;
		System.out.println(b);
		int c= b+32; //97
		char x=(char) c;
		System.out.println(x);
	}
}
