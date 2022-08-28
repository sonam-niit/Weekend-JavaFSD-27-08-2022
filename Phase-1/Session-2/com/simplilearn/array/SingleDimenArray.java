package com.simplilearn.array;

public class SingleDimenArray {

	public static void main(String[] args) {
		
		int a[]= {10,20,30,40,50};
		String name[]= {"sonam","pooja","nikunj","alex"};
		
		System.out.println("Array Length: "+a.length);
		System.out.println("String Array Length: "+name.length);
		
		System.out.println(a[4]);
		System.out.println(name[2]);
		System.out.println("Print using for loop");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		System.out.println("Advanced For loop (for each loop)");
		for(String s:name) {
			System.out.println(s);
		}
	}
}
