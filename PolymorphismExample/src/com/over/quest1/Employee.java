package com.over.quest1;

public class Employee {
String name,designation;

public Employee(String name, String designation) {
	super();
	this.name = name;
	this.designation = designation;
}
void calcBonus(double basicAllowance){
System.out.println("Programmer Method with single parameter");
}
void calcBonus(double basicAllowance, String gift){
	System.out.println("Manager Method with two parameters");
}
void calcBonus(double basicAllowance, String gift , double houseAllowance){
	System.out.println("Director Method with three parameters"); 
}
}
