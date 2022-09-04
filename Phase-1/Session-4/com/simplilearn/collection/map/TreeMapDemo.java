package com.simplilearn.collection.map;

import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> map= new TreeMap<>();
		
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
		NavigableMap<Integer, String> desc=map.descendingMap();
		System.out.println("Iterate using iterator");
		Iterator<Map.Entry<Integer, String>> it=desc.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry<Integer, String> entry=it.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}
}
