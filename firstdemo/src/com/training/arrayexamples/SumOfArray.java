package com.training.arrayexamples;

public class SumOfArray {

	public static void main(String[] args) {
		
		int[] arr=new int[4] ;
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		int sum=0;
		for(int i=0; i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("The sum of array is "+ sum);
		
		int total=0;
		for(int num : arr)
		{
			total+=num;
		}
		System.out.println("The sum of array is "+ total);
        String[] names=new String[] {"Anbu","Selvi","Tanishka"};
        for (String name : names)
        {
        	System.out.println(name.toUpperCase());
        }

	}

}
