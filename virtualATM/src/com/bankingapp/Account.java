package com.bankingapp;

public class Account {
double balance;

public Account(double balance) {
	super();
	this.balance = balance;
}
void deposit(double amount)
{
	System.out.println("withdraw done");
}
void withdraw (double amount)
{
	System.out.println("deposit done");
}
double getBalance()
{
	return balance;
}
}
