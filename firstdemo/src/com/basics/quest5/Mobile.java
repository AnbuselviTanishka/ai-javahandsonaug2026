package com.basics.quest5;

public class Mobile {
String model,brand,color  ;

public Mobile(String model, String brand, String color) {
	super();
	this.model = model;
	this.brand = brand;
	this.color = color;
}

void getDetails() 
{
	System.out.println("The mobile model is "+model);
	System.out.println("The mobile brand is "+brand);
	System.out.println("The mobile color is "+color);
}
}
