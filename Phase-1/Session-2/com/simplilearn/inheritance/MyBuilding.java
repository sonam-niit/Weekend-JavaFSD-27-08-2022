package com.simplilearn.inheritance;

public class MyBuilding implements BuildingInterface{

	@Override
	public void RK() {
		System.out.println("room kitchen");
	}
	@Override
	public void OneBHK() {
		System.out.println("One Bedroom, Hall and Kitchen");
	}
	@Override
	public void TwoBHK() {
		System.out.println("Two Bedroom, Hall and Kitchen");
	}
	@Override
	public void ThreBHK() {
		System.out.println("Three Bedroom, Hall and Kitchen");
	}

}
