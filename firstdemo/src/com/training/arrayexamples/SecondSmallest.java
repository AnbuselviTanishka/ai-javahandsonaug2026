package com.training.arrayexamples;

public class SecondSmallest {

	public static void main(String[] args) {
		
		int[] nums=new int[] {5,9,7,4,12};
		for(int i=0;i<nums.length;i++)
		{
			for(int j=0;j<nums.length-i-1;j++)
			{
				if(nums[j]>nums[j+1])
				{
					int temp=nums[j];
					nums[j]=nums[j+1];
					nums[j+1]=temp;
				}
			}
		}
		System.out.println(nums[1]);
	      

	}

}
