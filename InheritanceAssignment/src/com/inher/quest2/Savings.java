package com.inher.quest2;

public class Savings extends Account{

	public Savings(double balance) {
		super(balance);
	}

	@Override
	void withdraw(double amount) {
		// TODO Auto-generated method stub
		super.withdraw(amount);
		if(amount>balance)
		{
			System.out.println("Insufficient balance in your savings account");
		}
		else if(amount<=balance)
		{
			 balance -= amount;
	         System.out.println("Savings: Withdraw successful. Remaining balance: " + balance);
		}
	}

	@Override
	void deposit(double amount) {
		// TODO Auto-generated method stub
		super.deposit(amount);
        balance += amount + 50; 
        System.out.println("Savings: Deposit successful with bonus. New balance: " + balance);
	}
	

}
