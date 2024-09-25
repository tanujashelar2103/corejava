package com.Interface;

//It can access all parent class methods and only overridden methods of child class

public class MainBill {
	public static void main(String[] args) {
	Jio jio = new Jio();
	System.out.println("Your mobile bill is "+jio.generateBill(40));
	BSNL bsnl = new BSNL();
	System.out.println("Your mobile bill is "+bsnl.generateBill(80));
	}

}
