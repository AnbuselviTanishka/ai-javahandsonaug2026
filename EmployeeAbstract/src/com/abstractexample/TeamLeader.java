package com.abstractexample;

public abstract class TeamLeader extends Employee {
String projectName;

public TeamLeader(String empname, String empid, String city, String projectName) {
	super(empname, empid, city);
	this.projectName = projectName;
}
void appDetails()
{
	System.out.println("The project name is" + projectName);
}
}
