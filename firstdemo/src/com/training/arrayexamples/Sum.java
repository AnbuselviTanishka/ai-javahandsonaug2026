package com.training.arrayexamples;

public class Sum {

	public static void main(String[] args) {
		int[] arr=new int[4] ;
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		
		int total=0;
		for(int num : arr)
		{
			total+=num;
		}
		System.out.println("The sum of array is "+ total);
	    float avg=total/arr.length;
	    System.out.println(avg);
	}

}
