package com.simplilearn.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {

		Set<String> set = new HashSet<>();
		set.add("john");
		set.add("jack");
		set.add("alex");
		set.add("jack");
		set.add("catty");

		System.out.println(set);
		set.remove("jack");
		System.out.println("After Remove: " + set);
		// try to use contains method by your own
		// print the size of your set
		Iterator<String> it = set.iterator();
		while (it.hasNext())
			System.out.println(it.next());
		//iterators are not reusable, create fresh iterator to use
	}
}
