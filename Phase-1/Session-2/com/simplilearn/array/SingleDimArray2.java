package com.simplilearn.array;

import java.util.Scanner;

public class SingleDimArray2 {

	public static void main(String[] args) {
		
		int a[]= new int[5];
		//store elements using scanner in this array
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter any number");
			a[i]=sc.nextInt();
		}
		
		System.out.println("Let's print it");
		for(int n:a) {
			System.out.println(n);
		}
	}
}
