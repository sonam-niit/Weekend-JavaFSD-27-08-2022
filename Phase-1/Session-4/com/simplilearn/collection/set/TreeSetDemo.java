package com.simplilearn.collection.set;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		SortedSet<String> set= new TreeSet<>();
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
		
		SortedSet<String> desc= 
				((TreeSet<String>) set).descendingSet();
		System.out.println(desc);
	}
}
