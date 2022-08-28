package com.simplilearn.scan;

import java.util.Scanner;

public class ScanDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Enter any two numbers");
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();

			System.out.println("enter any operator + - * /");
			String operator = sc.next();
			char c = operator.charAt(0);
			if (c == '+')
				System.out.println("Addition" + (num1 + num2));
			else if (c == '-')
				System.out.println("Subtraction " + (num1 - num2));
			else
				System.out.println("Select proper operator");
			
			System.out.println("Enter y to continue and n to exit");
			char input= sc.next().charAt(0);
			if(input=='y' || input == 'Y')
				continue;
			else
				break;
		}
	}
}
