package com.bookapp.service;
import java.util.List;
import com.bookapp.model.Book;
public interface IBookService {

	List<Book> getAll();
	Book getById(int bookId);
	List<Book> getByTitleContains(String title);
	List<Book> getByAuthCategory(String author,String category);
	List<Book> getByLesserPrice(double price);
}
