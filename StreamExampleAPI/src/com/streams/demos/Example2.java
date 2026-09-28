package com.streams.demos;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Example2 {
	public static void main(String ar[])
	{
List<String> courses= Arrays.asList("Java","CSS","HTML","Angular","spring","Microservices");

Optional<String> opt = courses.stream()
.sorted()
.findFirst();

String course =opt.get();
System.out.println(course);

opt =courses.stream()
.filter(str->str.startsWith("p"))
.findFirst();

if(opt.isPresent())
{
	String course1 =opt.get();
	System.out.println(course1);
}
else
{
	System.out.println("The course is not available");
}
List<Integer> nums=Arrays.asList(11,15,91,63,85);


String ncourse=courses.stream()
.filter(str->str.startsWith("J"))
.findFirst()
.orElse("No course available");
System.out.println(ncourse);



	}
}
