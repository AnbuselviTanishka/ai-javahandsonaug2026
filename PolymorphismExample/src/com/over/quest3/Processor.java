package com.over.quest3;

public class Processor {
	 void calculate(double x)
	 {
		 System.out.println("The squareroot of the number is "+Math.sqrt(x));
	 }
	 void calculate(int x, int y){
		 System.out.println("The product of x and y is "+x*y);
	 }
	 void calculate(double x, double y){
		 System.out.println("The difference is "+ (x-y));
	 } 
	 void calculate(double x,int y)
	 {
		 System.out.println("The x to the power of y is "+Math.pow(x, y));
	 }
	 void calculate(int x)
	 {
		 System.out.println("The squar of x is "+ x*x);
	 }
}
