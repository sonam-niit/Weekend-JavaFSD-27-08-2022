package com.simplilearn.collection.map;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class HashTableDemo {

	public static void main(String[] args) {
		//Hashtable methods are synchronized
		Map<Integer, String> map= new Hashtable<>();
		
		map.put(1, "jack");
		map.put(6, "john");
		map.put(3, "bob");
		map.put(4, "alex");
		
		System.out.println(map);
		System.out.println("Contains key 6? "+map.containsKey(6));
		System.out.println("Get value of key 4: "+map.get(4));
		System.out.println("Iterate using for each");
		for(Map.Entry<Integer, String> entry:map.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		System.out.println("Iterate using iterator");
		Iterator<Map.Entry<Integer, String>> it=map.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry<Integer, String> entry=it.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}
}
