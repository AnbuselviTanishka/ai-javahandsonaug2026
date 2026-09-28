package com.over.quest3;

public class ProcessMain {
public static void main(String[] args) {
	Processor proc=new Processor();
	proc.calculate(125.0d);
	proc.calculate(10.0d,5.0d);
	proc.calculate(10.0d,2);
	proc.calculate(5);
}
}
