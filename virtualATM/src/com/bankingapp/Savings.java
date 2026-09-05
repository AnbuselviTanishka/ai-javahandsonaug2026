package com.bankingapp;

public class Savings extends Account{

	public Savings(double balance) {
		super(balance);
	}

	@Override
	void deposit(double amount) {
		//	super.deposit(amount);
		System.out.println("deposit in Current");
		balance=balance+amount+50;
	}

	@Override
	void withdraw(double amount) {
		
		//super.withdraw(amount);
		System.out.println("Withdraw in Current");
		balance=balance+amount-150;
	}
	

}
