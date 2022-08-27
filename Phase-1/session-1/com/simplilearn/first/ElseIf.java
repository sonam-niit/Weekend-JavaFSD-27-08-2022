package com.simplilearn.first;

public class ElseIf {

	public static void main(String[] args) {

		int per = 35;
		if (per >= 70 && per <= 100) {
			System.out.println("Distinction");
		} else if (per >= 60 && per < 70) {
			System.out.println("First class");
		} else if (per >= 50 && per < 60) {
			System.out.println("Second class");
		} else if (per >= 35 && per < 50) {
			System.out.println("Pass class");
		} else if (per >= 00 && per < 35) {
			System.out.println("Fail");
		} else {
			System.out.println("Enter valid result");
		}
	}
}
