package com.basics.quest1;

public class Book {

	String  title, author, category ;
	int price;

	public Book(String title, String author, int price, String category) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
		this.category = category;
	}
	void getDetails() 
	{
		System.out.println("The title of the book is " + title);
		System.out.println("The author of the book is "+ author);
		System.out.println("The price of the book is " + price);
		System.out.println("The category of the book is " + category);
		System.out.println();
	}
	void checkBookType()
	{
		if(price>500)
		{
			System.out.println(title + " book is Premium book");
		}
		else
		{
			System.out.println(title + " book is Standard book");
		}
	}
}
