package com.abstractexample;

public class Manager extends Employee {
	double salary;
	
	public Manager(String empname, String empid, String city, double salary) {
		super(empname, empid, city);
		this.salary = salary;
	}

	void calcBonus(int amount)
	{
		double bonus=salary * amount /100;
		System.out.println("The bonus of the mananger is " + bonus);
	}
	String[] trainingDetails()
	{
		String[] training=new String[] {"core java","spring","servlet","jsp","springboot","microservices","REST API"};
		return training;
		
		
	}
}
