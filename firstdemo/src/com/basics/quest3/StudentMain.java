package com.basics.quest3;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		String department;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Firt Student name");
		name=sc.nextLine();
		
		System.out.println("Enter the First Student department");
		department=sc.nextLine();
		
    Student s1=new Student(name,department);
    System.out.println("Enter number of subjects ");
    int n=sc.nextInt();
    int[] marks1= new int[n];
    int j=1;
    for(int i=0;i<n;i++)
    {
    	
    	System.out.println("Enter the marks of subject "+ j +" is ");
    	marks1[i]=sc.nextInt();
    	j++;
    }
     s1.printDetails();
     s1.getGrades(marks1);
	
     //System.out.println();
     
     System.out.println("Enter the Second Student name");
		String name2=sc.next();
		
		System.out.println("Enter the Second Student department");
		String department2=sc.next();
		
 Student s2=new Student(name2,department2);
 System.out.println("Enter number of subjects ");
 int n1=sc.nextInt();
 int[] marks2= new int[n1];
 int k=1;
 for(int i=0;i<n1;i++)
 {
 	
 	System.out.println("Enter the marks of subject "+ k +" is ");
 	marks2[i]=sc.nextInt();
 	k++;
 }
  s2.printDetails();
  s2.getGrades(marks2);
  sc.close();
	}

}
