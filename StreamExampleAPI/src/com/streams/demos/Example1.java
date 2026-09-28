package com.streams.demos;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.Arrays;

public class Example1 {
public static void main(String[] args) {
	List<String> names=Arrays.asList("Tanishka","Deekshika","Sashtika","Navanidhi","Subanidhi","Anbuselvi","indhu","meenakshi");
	/*Predicate<String> pred = name->{
		if(names.contains("a"))
		return true;
		return false;
	};*/
List<String> newNames=names.stream()
.filter(str->str.startsWith("S"))
.collect(Collectors.toList());
System.out.println(newNames);

//Get the first five name  from the given list sort it and print directly
names.stream()
.limit(5)
.sorted()
.forEach(str->System.out.println(str));

//
names.stream()
.sorted()
.skip(5)
.forEach(str->System.out.println(str));

System.out.println();
names.stream()
.map(str->str.toUpperCase())
.forEach(str->System.out.println(str));

//input string -->output is lenght of each string

names.stream()
.map(str->str.length())
.forEach(str->System.out.println(str));
//convert list to stream and filter the names having 0 and sort them
names.stream()
.filter(str->str.contains("a"))
.sorted()
.forEach(str->System.out.println(str));

}
}
