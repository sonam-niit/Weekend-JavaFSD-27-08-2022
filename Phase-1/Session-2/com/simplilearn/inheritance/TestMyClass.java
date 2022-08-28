package com.simplilearn.inheritance;

public class TestMyClass {

	public static void main(String[] args) {
		
		//Abstraction
		//Hiding the complex functionality from user and just show the interface to user
		BuildingInterface ref= new MyBuilding();
		ref.RK();
		ref.OneBHK();
		ref.TwoBHK();
		ref.ThreBHK();
	}
}
