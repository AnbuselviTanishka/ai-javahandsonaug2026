package com.basics.quest2;

public class Bank {
	double balance ;
	
	public Bank(double balance) {
		super();
		this.balance = balance;
	}
	void withdraw(double amount) 
	{
		balance=balance-amount;
	}
	void deposit(double amount) 
	{
		balance=balance+amount;
	}
	double getBalance()
	{
		
		return balance;
	}

}
