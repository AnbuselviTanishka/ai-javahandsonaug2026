package com.bookapp.service;

import java.util.List;
import java.util.ArrayList;

import com.bookapp.model.Book;
import com.bookapp.util.BookDetails;
import com.bookapp.exception.BookNotFoundException;

public class BookServiceImpl implements IBookService {

	@Override
	public List<Book> getAll() {
		// TODO Auto-generated method stub
		List<Book> books=BookDetails.showBooks();
		return books;
	}

	@Override
	public Book getById(int bookId) {
		// TODO Auto-generated method stub
		List<Book> books=BookDetails.showBooks();
		
        for (Book book : books) {
            if(book.getBookId() == bookId) {
                return book;
            }
        }
		throw new BookNotFoundException("invalid ID");
	
	}

	@Override
	public List<Book> getByTitleContains(String title) {
		// TODO Auto-generated method stub
		
		List<Book> books=BookDetails.showBooks();
		List<Book> bookByTitle=new ArrayList();
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(title.toLowerCase())) {
            	bookByTitle.add(book);
            }
        }
        if(bookByTitle.isEmpty())
        {
        throw new BookNotFoundException("Title not found");
        }
        
        return bookByTitle;
	}

	@Override
	public List<Book> getByAuthCategory(String author, String category) {
		// TODO Auto-generated method stub
		List<Book> books=BookDetails.showBooks();
		List<Book> booksByAuthCategory=new ArrayList();
        for (Book book : books) {
           if(book.getAuthor().equals(author) && book.getCategory().equals(category)) {
        	   booksByAuthCategory.add(book);
            }
        }
        if(booksByAuthCategory.isEmpty())
        {
        throw new BookNotFoundException("Author and category not found");
        }
        
        return booksByAuthCategory;
	}

	@Override
	public List<Book> getByLesserPrice(double price) {
		// TODO Auto-generated method stub
		List<Book> books=BookDetails.showBooks();
		List<Book> bookByLesserPrice=new ArrayList();
		for (Book book : books) {
			if(book.getPrice()<price)
			{
				bookByLesserPrice.add(book);
			}
		}
			 if(bookByLesserPrice.isEmpty())
		        {
		        throw new BookNotFoundException("no books with lesser price");
		        }
		        
		        return bookByLesserPrice;
	}

}
