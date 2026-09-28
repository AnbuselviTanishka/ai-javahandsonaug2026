package com.inter.samples;

public abstract class CardPayment implements IpaymentProcessor {

	String paymentmethod;
	public void cardType(String paymentmethod)
	{
		this.paymentmethod=paymentmethod;
	}
	

}

class CreditCardPayment extends CardPayment
{

	@Override
	public void payAmount(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Payint through "+paymentmethod+" is "+ amount);
	}
	void cardLimit(double amount)
	{
		System.out.println("Credit card limit raised to " + amount);
	}
}

class DebitCardPayment extends CardPayment
{

	@Override
	public void payAmount(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Payint through "+paymentmethod+" is "+ amount);
	}
	
}