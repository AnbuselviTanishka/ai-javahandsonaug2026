package com.abstractexample;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp=new Manager("Tanishka","M001","Bangalore",200000);
		emp.printDetails();
		Employee.projectDetails();
		emp.salaryProcess();
		emp.calcBonus(10);
		Manager mgr=(Manager)emp;
		String[] training=mgr.trainingDetails();
		System.out.println("The training details are");
		for(String train :training)
		{
			System.out.println(train);
		}
	
		TeamLeader tl=new Developer("Anbuselvi","T001","Chennai","IBS");
		Developer d=(Developer)tl;
		d.printDetails();
		d.appDetails(); 
		
		Developer d1=new Developer("Indhu","D001","Chennai","IBS");
		d1.printDetails();
		System.out.println(Employee.CompanyName);
		d1.calcBonus(5);
		String[] hobbies=d1.showHobbies();
		System.out.println("The developers hobbies are");
		for(String hob :hobbies)
		{
			System.out.println(hob);
		}
		
		

	}

}
