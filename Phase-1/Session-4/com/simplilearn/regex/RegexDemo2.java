package com.simplilearn.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo2 {

	public static void main(String[] args) {
		String regex="[a-zA-Z]+";
		String input="Welcome@ to the World Of Regex";
		Pattern pattern= Pattern.compile(regex);
		
		Matcher matcher=pattern.matcher(input);
		
		while(matcher.find()) {
			System.out.println
			(input.substring(matcher.start(),
					matcher.end()));
		}
		
	}
}
