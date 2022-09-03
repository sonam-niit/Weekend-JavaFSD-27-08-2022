package com.simplilearn.annonymous;

public class Test1 {

	public static void main(String[] args) {

		Car sachinscar = new Car() {
			
			@Override
			public void stop() {
				System.out.println("Sachin's car stopped");
			}
			@Override
			public void start() {
				System.out.println("Sachin's car started");
			}
		};
		sachinscar.start();
		sachinscar.stop();
		Car ambaniscar= new Car() {
			
			@Override
			public void stop() {
				System.out.println("Ambani's car stopped");
			}
			@Override
			public void start() {
				System.out.println("Ambani's car started");
			}
		};
		ambaniscar.start();
		ambaniscar.stop();
	}
}
