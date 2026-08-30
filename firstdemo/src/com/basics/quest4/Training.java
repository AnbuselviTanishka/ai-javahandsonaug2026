package com.basics.quest4;

public class Training {
	String[] showCourses()
	{
		String[] courses=new String[] {"Java","SpringBoot","Spring Cloud","Micorservices"};
		return courses;
	}
	void showTrainers(String... names ) 
	{
		System.out.println("Trainer Details");
		for(String name : names)
		{
			System.out.println(name);
		}
	}
}
