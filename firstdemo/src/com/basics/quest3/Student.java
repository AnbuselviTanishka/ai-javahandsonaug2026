package com.basics.quest3;

public class Student {

	String name;
	String department;
	
		
	public Student(String name, String department) {
		super();
		this.name = name;
		this.department = department;
	}
	void printDetails()
	{
		System.out.println("The Student name is "+name);
		System.out.println("The Student department is "+department);
	}
	 String getGrades(int[] marks ) 
	 {
		int sum=0;
		for(int mark : marks)
		{
			sum=sum+mark;
		}
		double avg=(double)sum/marks.length;
		String grade="";
	    if(avg >=90 && avg<=100)
	    {
	    	grade="A";
	    }
	    else if(avg >=80 && avg<90)
	    {
	    	grade="B";
	    }
	    else if(avg >=70 && avg<80)
	    {
	    	grade="C";
	    }
	    else if(avg >=60 && avg<70)
	    {
	    	grade="D";
	    }
	    else if(avg >=50 && avg<60)
	    {
	    	grade="E";
	    }
	    else
	    {
	    	grade="Fail";
	    }
	    System.out.println("The Student total mark is "+sum);
	    System.out.println("The Student average mark is "+avg);
	    System.out.println("The Student grade is "+grade);
	 return grade;
	 }
}
