package com.Interface;

public class Jio  implements BillGenerator{

	@Override
	public float generateBill(int networkUsage) {
		return networkUsage * 19;
	}

}
