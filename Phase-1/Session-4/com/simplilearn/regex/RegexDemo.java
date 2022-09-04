package com.simplilearn.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegexDemo {
	
	public static void main(String[] args) {
		String regex = "[987]{1}[0-9]{9}";
		Scanner sc = new Scanner(System.in);
		Pattern pattern = Pattern.compile("regex");

		String input = sc.next();
		Matcher matcher = pattern.matcher(input);
		if (matcher.matches())
			System.out.println("matched");
		else
			System.out.println("not");
		sc.close();

	}
}