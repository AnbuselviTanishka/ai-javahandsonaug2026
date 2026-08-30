package com.training.arrayexamples;

public class Reverse {

	public static void main(String[] args) {
		int num = 5478 ;
		int len = String.valueOf(num).length();
		
		int rem=0;
		
		int i=0;
		while(i<len)
		{
			rem=num%10;
			System.out.print(rem);
			num=num/10;
			i++;
		}
    
	}

}
