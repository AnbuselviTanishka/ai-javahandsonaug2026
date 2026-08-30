package com.basics.quest2;

import java.util.Scanner;
public class BankMain {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		double amount=0.0d;
		System.out.println("Transactions");
		System.out.println("1-Deposit");
		System.out.println("2-Withdraw");
		String transaction=sc.next();
		double balance=10000;
		Bank b1=new Bank(balance);
		switch(transaction)
		{
		
		case "1":
		System.out.println("Enter the amount to deposit");
		amount=sc.nextDouble();
		b1.deposit(amount);
		System.out.println("The balance after deposit"+b1.getBalance() );
		break;
		case "2":
		System.out.println("Enter the amount to withdrow");
		amount=sc.nextDouble();
		if(amount<balance)
		{
			b1.withdraw(amount);
		System.out.println("The balance after deposit"+b1.getBalance() );
		}
		break;
		default:
			System.out.println("Wrong choice");
		}
		sc.close();
	}

}
