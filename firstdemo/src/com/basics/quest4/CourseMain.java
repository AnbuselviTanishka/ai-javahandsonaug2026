package com.basics.quest4;
import java.util.Scanner;
public class CourseMain {
public static void main(String[] args) {
	Training cm=new Training();
	String[] courses=cm.showCourses();
	for(String course : courses)
	{
		System.out.println(course);
		}
	 Scanner sc = new Scanner(System.in);
     Training training = new Training();

     
     System.out.println("Enter number of trainers:");
     int n = sc.nextInt();
     sc.nextLine(); 
     String[] trainers = new String[n];

     for (int i = 0; i < n; i++) {
         System.out.println("Enter trainer name " + (i + 1) + ":");
         trainers[i] = sc.nextLine();
     }

     // Call showTrainers method
    training.showTrainers(trainers);
}
}
