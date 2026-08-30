package com.training.oopsexamples;

public class Student {
	String studentName;
	int studentId;
	public Student(String studentName, int studentId) {
		super();
		this.studentName = studentName;
		this.studentId = studentId;
	}
	
	void printDetails() {
		System.out.println("Name "+studentName);
		System.out.println("Id "+studentId);
		
	}

}
