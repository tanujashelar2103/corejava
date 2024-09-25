package com.Interface;

public class BSNL implements BillGenerator {

	@Override
	public float generateBill(int internetUsage) {
		// TODO Auto-generated method stub
		return internetUsage * 6;
	}

}
