package com.bankingapp;

public class Current extends Account{
String accountType;

public Current(double balance, String accountType) {
	super(balance);
	this.accountType = accountType;
}

@Override
void deposit(double amount) {
	// TODO Auto-generated method stub
	//super.deposit(amount);
	System.out.println("deposit in Current");
	balance=balance+amount+50;
}

@Override
void withdraw(double amount) {
	// TODO Auto-generated method stub
	//super.withdraw(amount);
	System.out.println("Withdraw in Current");
	balance=balance+amount-150;
}

}
