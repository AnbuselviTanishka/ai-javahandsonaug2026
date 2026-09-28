package com.bookapp.util;
import java.util.Arrays;
import java.util.List;
import com.bookapp.model.Book;
public class BookDetails {
public static List<Book> showBooks(){
	return Arrays.asList(new Book("Java Programming",1,"Balagurusamy","Techincal",600),
	new Book("OOPS with Java",2,"Thamaraiselvi","Techincal",700),
	new Book("Head First java",3,"Kathy","Techincal",920),
	new Book("conversations",4,"Joe","selfhelp",1002),
	new Book("Mind Matters",5,"Joe","selfhelp",650),
	new Book("Javascript for begineers",6,"Jacob","Technical",1100)
			
			);
}
}
