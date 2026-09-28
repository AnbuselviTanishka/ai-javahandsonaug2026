package com.over.quest1;

import java.util.Scanner;

public class OverloadMain {
	
	public static void main(String ar[])
	{
	Scanner scanner=new Scanner(System.in);
	Employee[] emp=new Employee[5];
	String name="";
	String designation="";
	for(int i=0;i<5;i++)
	{
		 System.out.println("\nEmployee #" + (i + 1));
         System.out.print("Enter Name: ");
          name = scanner.nextLine();
         
         System.out.print("Enter Designation (Programmer, Manager, Director): ");
          designation = scanner.nextLine();

         // Create object and add to the array
         emp[i] = new Employee(name, designation);
	}
	for(Employee e : emp)
	{
		if(e.designation.equals("Programmer"))
		{
			e.calcBonus(100);
		}
		else if(e.designation.equals("Manager"))
		{
			e.calcBonus(100,"gift");
		}
		else if(e.designation.equals("Director")) {
			e.calcBonus(10, "gift", 10);
		}
	}
}
	
			
}
