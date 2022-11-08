package com.digitalbooks.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.digitalbooks.entity.Book;
import com.digitalbooks.service.IBookService;


@RestController
@RequestMapping("/api/v1/digitalbooks")
@CrossOrigin("http://localhost:4200/")
public class BookController {
	
	@Autowired
	IBookService bookService;
	
	@PostMapping("/add/book")
	Integer createBook(@RequestBody Book book) {
		Integer id = bookService.createBook(book);
		return id;
	}

	@GetMapping("/search")
	public List<Book> getBooks(@RequestParam String title,
							@RequestParam String authorName,
							@RequestParam String publisher,
							@RequestParam Integer price){
								
		return bookService.getAllBooks(title, authorName, publisher, price);
		
	}
	
	@GetMapping("/books")
	public List<Book> getAllBook(){
		return bookService.getAllBook();
	}
	
	@GetMapping("/book/{bookId}")
	public List<Book> getBook(@PathVariable("bookId") Integer bookId) {
		return this.bookService.filterByBookId(bookId);
	}
}
