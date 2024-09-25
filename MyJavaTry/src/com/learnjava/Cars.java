package com.learnjava;
//Abstract class can have abstract and non-abstract methods
//abstract method don't have body
//abstract keywords define abstract class
//You cannot make objects of abstract class in main method
//the child class must implement the method and provide functionality

public abstract class Cars {
	void brake() {
		System.out.println("The car stops when we apply brake");
	}
	abstract void seats();

}
 class Learning extends Cars {

	@Override
	void seats() {
		System.out.println("4 seats ");
		
	}
	
}