package com.spring.list;

public class Book {

	private int bookID;
	private String bookName;
	
	public Book() {
		
	}
	
	public Book(int bookID, String bookName) { // Constructor Injection 	
		super();
		this.bookID = bookID;
		this.bookName = bookName;
	}

	@Override
	public String toString() {
		return "Book [bookID=" + bookID + ", bookName=" + bookName + "]";
	}
	
	
	
}
