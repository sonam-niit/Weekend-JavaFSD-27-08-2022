package com.simplilearn.first;

public class Loops {

	public static void main(String[] args) {
		System.out.println("While Loop");
		int i=1;
		while(i<=5)
		{
			System.out.println(i);
			i++; // increase the value of i by 1
		}
		System.out.println("Do while loop");
		do {
			System.out.println(i);
			i++;
		}while(i<=10);
		
		System.out.println("For loop");
		for(i=1;i<=5;i++) {
			System.out.println(i);
		}
	}
}
