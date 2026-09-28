package com.inher.quest2;
import java.util.Scanner;
public class VirtualATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
Account account = null;

System.out.println("Welcome to Virtual ATM");
System.out.println("Choose Account Type: 1. Savings  2. Current");
int choice = sc.nextInt();

if (choice == 1) {
    account = new Savings(5000); // Initial balance
} else if (choice == 2) {
    account = new Current(5000);
} else {
    System.out.println("Invalid choice. Exiting...");
    return;
}

while (true) {
    System.out.println("\nATM Menu:");
    System.out.println("1. Deposit");
    System.out.println("2. Withdraw");
    System.out.println("3. Check Balance");
    System.out.println("4. Exit");
    System.out.print("Enter your choice: ");
    int option = sc.nextInt();

    switch (option) {
        case 1:
            System.out.print("Enter deposit amount: ");
            double depAmt = sc.nextDouble();
            account.deposit(depAmt);
            break;
        case 2:
            System.out.print("Enter withdraw amount: ");
            double wdAmt = sc.nextDouble();
            account.withdraw(wdAmt);
            break;
        case 3:
            System.out.println("Current Balance: " + account.getBalance());
            break;
        case 4:
            System.out.println("Thank you for using Virtual ATM!");
            sc.close();
            return;
        default:
            System.out.println("Invalid option. Try again.");
    }
}
}
	}

