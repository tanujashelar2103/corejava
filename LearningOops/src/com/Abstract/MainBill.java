package com.Abstract;

public class MainBill {

	public static void main(String[] args) {
		Bill bill = new ResidentialBill();
		System.out.println("Your electricity bill is "+bill.generateBill(64));
		ResidentialBill kk = new ResidentialBill();
		System.out.println(kk.generateBill(35));
	

	}

}
