package com.learnjava;

public class Static1 {
	static int age = 12;
	static String name  = "Tanuja";
	static {
		System.out.println("I am Tanuja");
	}
	static void stati1() {
		System.out.println("I want to change name");
		System.out.println("21");
		
	}
	public static void main(String[] args) {
		System.out.println(Static1.age);
		System.out.println(Static1.name);
		Static1.stati1();
		
	}

}
