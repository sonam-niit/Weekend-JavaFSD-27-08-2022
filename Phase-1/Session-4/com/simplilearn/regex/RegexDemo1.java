package com.simplilearn.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo1 {

	public static void main(String[] args) {
		
		Pattern pattern= Pattern.compile("[a-zA-Z0-9]+@");
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any values");
		String input= sc.next();
		
		Matcher matcher= pattern.matcher(input);
		if(matcher.matches()) 
			System.out.println("pattern matched");
		else
			System.out.println("Not matched");
		
		sc.close();
		
	}
}
