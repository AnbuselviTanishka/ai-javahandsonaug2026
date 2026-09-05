package com.abstractexample;

public abstract class Employee {
static final String CompanyName="TCS";

String empname,empid,city;

public Employee(String empname, String empid, String city) {
	super();
	this.empname = empname;
	this.empid = empid;
	this.city = city;
}
void printDetails()
{
	System.out.println("The employeename "+ empname);
	System.out.println("The employee id is " + empid);
	System.out.println("The city is "+ city);
}
abstract void calcBonus(int amount);
static void projectDetails()
{
	System.out.println("Java application development");
}
final void salaryProcess()
{
	System.out.println("The salary is being processed");
}
}
