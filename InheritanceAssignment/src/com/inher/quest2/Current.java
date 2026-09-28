package com.inher.quest2;

public class Current extends Account{

	public Current(double balance) {
		super(balance);
	}

	@Override
	void withdraw(double amount) {
		// TODO Auto-generated method stub
		super.withdraw(amount);
		if(amount<=balance+1000)
		{
			balance -= amount;
            System.out.println("Current: Withdraw successful (Overdraft allowed). Remaining balance: " + balance);
		}
		else
		{
			balance += amount; 
	        System.out.println("Current: Deposit successful. New balance: " + balance);
		}
	}

	@Override
	void deposit(double amount) {
		// TODO Auto-generated method stub
		super.deposit(amount);
	}

}
