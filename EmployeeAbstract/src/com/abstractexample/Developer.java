package com.abstractexample;

public class Developer extends TeamLeader{
	public Developer(String empname, String empid, String city, String projectName) {
		super(empname, empid, city, projectName);
	}
	void calcBonus(int amount)
	{
		double salary=100000;
		double bonus =salary * amount /100;
		System.out.println("The developer bonus is"+bonus);
	}
	String[] showHobbies()
	{
		String[] hobbies=new String[] {"singing","dancing","gardening","painting","Photography"};
		return hobbies;
	}

}
