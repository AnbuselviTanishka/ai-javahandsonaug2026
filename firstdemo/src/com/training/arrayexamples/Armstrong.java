package com.training.arrayexamples;

public class Armstrong {

	public static void main(String[] args) {
		int num = 5478 ;
		int len = String.valueOf(num).length();
		int input=num;
		int rem=0;
		double sum=0.0d;
		int i=0;
		while(i<len)
		{
			rem=num%10;
			sum=sum+Math.pow(rem,len);
			num=num/10;
			i++;
		}
		int result=(int)sum;
		System.out.println(result);
		
		if(result == input)
		{
			System.out.println("the number is amstrong number");
		}
		else
		{
			System.out.println("the number is not an amstrong number");
		}

				

	}

}
