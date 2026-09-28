package com.bookapp.main;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

import com.bookapp.service.IBookService;
import com.bookapp.service.BookServiceImpl;
import com.bookapp.model.Book;
public class SortedClient {
public static void main(String[] args) {
	IBookService bookService = new BookServiceImpl();
	System.out.println("Get all books");
	List<Book> books =  bookService.getAll();
	Collections.sort(books);
	for (Book book :books) {
		System.out.println(book);
	}
	System.out.println();
	System.out.println("Get Book By Id");
	try {
		System.out.println(bookService.getById(7));
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
	System.out.println();
	System.out.println("Get Books By Auth and category");
	try {
		List<Book> booksByAuth =  bookService.getByAuthCategory("Joe","selfhelp");
		Collections.sort(booksByAuth);
		for (Book book : booksByAuth) {
			System.out.println(book);
		}
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
	System.out.println();
	System.out.println("Get Books By Title containing");
	try {
		List<Book> booksByTitle =  bookService.getByTitleContains("Java");
		Collections.sort(booksByTitle);
		for (Book book : booksByTitle) {
			System.out.println(book);
		}
	} catch (Exception e) {
}
}
}
