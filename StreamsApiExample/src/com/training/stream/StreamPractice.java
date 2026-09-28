package com.training.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.	Given a list of strings, print them in uppercase in alphabetical order.
		
		List<String> names=Arrays.asList("Tanishka","Deekshika","Sashtika","Navanidhi","Subanidhi","Anbuselvi","indhu","meenakshi");
		
		names.stream()
		.map(str->str.toUpperCase())
		.forEach(System.out::println);
	
//2.	Given a list of strings, print them in uppercase by the length of each element
	names.stream()
	.map(str->str.length())
	.forEach(System.out::println);
	
	//3.	Given a list of strings, remove null or empty strings from the list
	List<String> fruits=Arrays.asList("Mango","Apple","Pineapple","Pomegarnate",null);
	
	fruits.stream()
	.filter(str->str != null && !str.isEmpty())
	.forEach(System.out::println);
	//4.	Given a list of nums, square each number in the list
	
	List<Integer> nums=Arrays.asList(1,2,3,4,5);
	
	nums.stream()
	.map(x->x*x)
	.forEach(System.out::println);
	
	//5.	Given a list of nums, find the largest number in the list
	List<Integer> num=Arrays.asList(12,25,32,9,99);
	
	Integer maxNum=num.stream()
	.sorted(Comparator.reverseOrder())
	.findFirst()
	.orElse(null);
	System.out.println("The maximum number"+maxNum);
	
	Integer minNum = num.stream()
			.sorted()
			.findFirst()
			.orElse(null);
	
	System.out.println("The maximum number"+minNum);
	
	int[] numbers=new int[] {65,34,12,76,49,80,56};
	
	maxNum=Arrays.stream(numbers)
			.max()
			.orElse(0);
			
	
	System.out.println("The max value from the array"+maxNum);
	//7.	Given a list of nums, find the sum and average
	
	List<Integer> num1 = Arrays.asList(10, 20, 30, 40, 50);
	int sum=num1.stream()
			.mapToInt(n->n)
			.sum();
	
	double avg=num1.stream()
			.mapToInt(n->n)
			.average()
			.orElse(0.0);
	
	System.out.println("The sum of list"+sum);
	System.out.println("the average of the list"+avg);
	
	//8.	Given an array of numbers, find the the sum and average
	int[] nums2= {5,10,15,20,25};
	
	sum=Arrays.stream(nums2)
			.sum();
	
	
	System.out.println("The sum of array"+sum);
	
	avg=Arrays.stream(nums2)
			.asDoubleStream()
			.average()
			.orElse(0.0);
	
	System.out.println("The average of the array"+avg);
	
	//9.	Given a list of Strings, remove duplicates from a list
	
	List<String> places=Arrays.asList("Madurai","Bangalore","Chennai","Trichy","Tanjore","Chennai","Madurai");
	
	places.stream()
	.distinct()
	.forEach(System.out::println);
	
	//10.	Given a list of names, filter names starting with "R".
	
	List<String> flowers=Arrays.asList("Rose","Jasmine","Sunflower","Rosemary","Tia");
	
	flowers.stream()
	.filter(str->str.startsWith("R"))
	.forEach(System.out::println);
			
	//11.	Given a list of strings, print the total count of names having length >5
	
	long count=flowers.stream()
	.filter(str->str.length()>5)
	.count();
	
	System.out.println("the count of flowers whose lenght is greater than 5 is  "+count);
	
	//12.	Find the odd numbers between 10-50 and calculate sum
	
	int oddSum=IntStream.rangeClosed(10, 50)
	.filter(x->x%2!=0)
	.sum();
	
	System.out.println(oddSum);
	//13.	Convert list to set using streams
		Set<String> set=places.stream()
		.collect(Collectors.toSet());
		System.out.println(set);
		
	//14.	Given a list of strings, get the first element 
	String firstElement=	places.stream()
		.findFirst()
		.orElse(null);
	
	System.out.println(firstElement);
	
	//15.	Given a list of strings, reverse sort them.
	flowers.stream()
	.sorted(Comparator.reverseOrder())
	.forEach(System.out::println);
	

}
}