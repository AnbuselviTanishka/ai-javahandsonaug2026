package com.inher.quest1;
class Project{ 
	void doTask(){
		System.out.println("doing some project");} 
	}
	
	class TeamOne extends Project{ 
	 // override doTask - "Project implemented using Java" 
	 // create own method as  void 
	@Override
	void doTask() {
		// TODO Auto-generated method stub
		//super.doTask();
		System.out.println("Project implemented using Java");
	}
	void softwaresUsed(String...tools){ 
		// Iterate through the tools and print it(eclipse. Jenkins, maven) 
		System.out.println("The tools used for this project");
		for(String tool : tools)
		{
			System.out.println(tool);
		}
		}
	}  
	class TeamTwo extends Project { 
	// override doTask - "Project implemented using Python" 
		
	 // create ownmethod as   
		
	String[] getTechStack(){ //return an array having 
	// {“Java”,”Spring,”Angular”} } 
		String[] tech=new String[] {"Java","Spring","Angular" };
		return tech;
	}

	@Override
	void doTask() {
		// TODO Auto-generated method stub
		System.out.println("Project implemented using Python");
	} 
	}
public class CompanyMain {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TeamOne one=new TeamOne();
		one.doTask();
		one.softwaresUsed("Eclipse","Oracle","Jenkins");
		
		
		TeamTwo two=new TeamTwo();
		two.doTask();
		String[] tech=two.getTechStack();
		for(String techs : tech)
		{
			System.out.println(techs);
		}

	}

}
