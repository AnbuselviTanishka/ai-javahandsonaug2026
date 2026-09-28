package com.over.quest4;

public class GreeterMain {

	public static void main(String[] args) {
		Greeter g1=new Greeter();
		Greeter g2=new Greeter("Anbuselvi");
		
		g2.greetUser("hello");
		//g2.greetUser(("hi","hello");
		g2.greetUser("Hey","oi","yay");
		
		g1.sayHello("Anbu");
		g1.sayHello("Selvi","Tanishka");
		g1.sayHello("indhu","anbuselvi","deeshika");
		
				

	}

}
