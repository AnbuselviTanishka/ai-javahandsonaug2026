package com.streams.demos;

import java.util.Arrays;
import java.util.List;

public class Example3 {
public static void main(String arg[])
{
	List<Integer> nums=List.of(20,54,33,91,11);
	
	//get the even numbers from the list
	
	nums.stream()
	.filter(n->n%2==0)
	.forEach(n->System.out.println(n));
	
	//get thje first odd number from the list
	int oddNum = nums.stream()
	.filter(n-> n%2 !=0)
	.findFirst()
	.orElse(1);
	System.out.println(oddNum);

nums.stream()
.map(n->n*2)
.forEach(n->System.out.println(n));

System.out.println(" get each number multiplied by 2 and print the result in ascending order");
nums.stream()
.map(n->n*2)
.sorted()
.forEach(n->System.out.println(n));

System.out.println(" get each number multiplied by 2 and sort them and print the first 3 results");
nums.stream()
.map(n->n*2)
.sorted()
.limit(3)
.forEach(n->System.out.println(n));
// get the even numbers from the list
// get the first odd numbers from the list
// get each number multiplied by 2 and print the result
// get each number multiplied by 2 and print the result in ascending order
// get each number multiplied by 2 and sort them and print the first 3 results
}
}
