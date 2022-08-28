package com.simplilearn.classobject;

public class EncaptulationDemo {
 
	public static void main(String[] args) {
		
		Product p= new Product();
		p.setId(1);
		p.setName("Pen");
		p.setPrice(12);
		p.setDescription("easy to use");
		
		//call getters
		System.out.println("Id: "+p.getId());
		System.out.println("Name: "+p.getName());
		System.out.println("Price: "+p.getPrice());
		System.out.println("Description: "+p.getDescription());
	}
}
