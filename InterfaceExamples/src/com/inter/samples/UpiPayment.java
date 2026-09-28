package com.inter.samples;

public class UpiPayment implements IpaymentProcessor {

	@Override
	public void payAmount(double amount) {
		// TODO Auto-generated method stub
		System.out.println("The amount paid via UPI is "+amount);
		
	}

	@Override
	public void checkOffers() {
		// TODO Auto-generated method stub
		IpaymentProcessor.super.checkOffers();
		System.out.println("10% discount availble if paid via UPI");
	}
	
	

	
}
