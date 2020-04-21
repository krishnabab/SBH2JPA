package com.sbh2jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class LibService {
	
	@Autowired
	private BookRepository bookRepository;
	
	public LibService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	
	public void addBook(Book b) {
		if(bookRepository == null)
		System.out.println("b>>>"+b.getTitle());
		bookRepository.save(b);
	}
	
	public Book findBook(String isbn) {
		
		return bookRepository.findByIsbn(isbn);
		
	}
	
}
