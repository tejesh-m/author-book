package com.digitalbooks.service;

import java.util.List;
import java.util.Optional;

import com.digitalbooks.entity.Book;

public interface IBookService {

	Integer createBook(Book book);
	
	public List<Book> getAllBooks(String title, String authorName, String publisher, Integer price );
	
	public List<Book> getAllBook();
	
	public List<Book> filterByBookId(Integer bookId);
	
	
//	Optional<Book> getABook(Integer bookId);
	
//	Book editABook(Book book, Integer bookId);
	
//	Book editBorrowedStatus(Book book, Integer bookId);
	
}
