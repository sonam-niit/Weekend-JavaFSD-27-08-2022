package com.simplilearn.collection.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		
		Set<String> set= new LinkedHashSet<>();
		set.add("john");
		set.add("jack");
		set.add("alex");
		set.add("jack");
		set.add("catty");
		
		System.out.println(set);
		set.remove("jack");
		System.out.println("After Remove: "+set);
		//try to use contains method by your own
		//try to use iterator
		//print the size of your set
	}
}
