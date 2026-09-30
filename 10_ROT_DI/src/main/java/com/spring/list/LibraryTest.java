package com.spring.list;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryTest {

	public static void main(String[] args) {
	ApplicationContext context =  new ClassPathXmlApplicationContext("library.xml");
	Library lib = (Library) context.getBean("library");
	List<Book> books = lib.getBooks();
	for (Book book : books) {
		System.out.println(book);
	}
	
	}

}
