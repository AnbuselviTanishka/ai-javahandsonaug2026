package com.inter.samples;

public interface IpaymentProcessor {
String message="Payment Gateway App";

void payAmount(double amount);
static void printReceipt(double amount)
{
	System.out.println("Receipt for amount paid"+amount);
	
}
default void checkOffers()
{
	System.out.println("offers on dining and movies");
}

}
