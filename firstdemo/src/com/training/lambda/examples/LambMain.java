package com.training.lambda.examples;

public class LambMain  {
public static void main(String[] args) {
	
	IShape shape1 =(x,y)-> System.out.println("square "+(x*y));
	shape1.area(10,20);
	IShape rect =(x,y)-> System.out.println("rectange"+((1/2)*x*y));
	rect.area(10,20);
	
	Icusine cusine=items -> {
	    for (String item : items) {
	        System.out.println(item);
	    } };
	    
	    String[] items=new String[] {"Indian","Italian","Japanese"};
	    
	    cusine.printCusine(items);
			
}
}
