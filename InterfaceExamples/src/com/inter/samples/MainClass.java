package com.inter.samples;
import java.util.Scanner;
public class MainClass {
public static void main(String[] args) {
	String paymentType;
	System.out.println("Enter the method of payment");
	System.out.println("Enter card or UPI");
	Scanner sc=new Scanner(System.in);
	paymentType=sc.next();
	if(paymentType.equalsIgnoreCase("UPI"))
	{
		IpaymentProcessor paymentprocessor=new UpiPayment();
		paymentprocessor.checkOffers();
		paymentprocessor.payAmount(10000);
	}
	else if(paymentType.equalsIgnoreCase("card")
	
	
}
}
