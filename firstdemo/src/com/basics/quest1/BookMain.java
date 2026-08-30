package com.basics.quest1;

public class BookMain {

	public static void main(String[] args) {
		Book b1=new Book("Java Programming","Balagurusamy",350,"Academic");
		Book b2=new Book("Atomic habits","James Clear",799,"psychology");
		
		b1.getDetails();
		b2.getDetails();
		
		b1.checkBookType();
		b2.checkBookType();
		
	}

}
