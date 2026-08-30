package com.training.oopsexamples;

public class Product {

public String[] showProducts()
{
	String[] productName=new String[] {"Laptop","Mobile","Desktop"};
	return productName;
}
void printCategories(String[] categories)
{
 for (String cat : categories) {
	 System.out.println(cat);
	
}
}
void offerDetails()
{
	System.out.println("Onam offer");
}
public static void main(String a[])
{
	Product p1=new Product();
	String[] name=p1.showProducts();

	p1.offerDetails();
	
	for(String prod : name)
	{
		System.out.println(prod);
	} 
	String[] cat= new String[]{"Electronics","Books","Bags"};
	p1.printCategories(cat);
	}

}
