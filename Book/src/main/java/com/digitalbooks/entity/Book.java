package com.digitalbooks.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer bookId;
	
	private String title;
	private String category;
	private Integer price;
	private String authorName;
	private String publisher;
	private Integer publishedDate;
	private Integer chapters;
	private boolean active;
	
//	@ManyToOne
//	@JoinColumn(name = "bookId")
//	private SubscribeBooks subscribeBooks;
	
	public Book(Integer bookId, String title, String category, Integer price, String authorName,
			String publisher, Integer publishedDate, Integer chapters, boolean active) {
		super();
		this.bookId = bookId;
		
		this.title = title;
		this.category = category;
		this.price = price;
		this.authorName = authorName;
		this.publisher = publisher;
		this.publishedDate = publishedDate;
		this.chapters = chapters;
		this.active = active;
	}

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public Integer getPublishedDate() {
		return publishedDate;
	}

	public void setPublishedDate(Integer publishedDate) {
		this.publishedDate = publishedDate;
	}

	public Integer getChapters() {
		return chapters;
	}

	public void setChapters(Integer chapters) {
		this.chapters = chapters;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Book() {
		super();
	}
	
	
}
