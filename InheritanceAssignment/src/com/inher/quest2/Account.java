 	package com.inher.quest2;

public class Account {
double balance;

public Account(double balance) {
	super();
	this.balance = balance;
}
void withdraw(double amount){System.out.println("withdraw method from Account class");} 
void deposit(double amount){System.out.println("Depoist methid from Account class");} 
double getBalance(){return balance;} 
}
