package com.sbh2jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SBH2JPAEx implements CommandLineRunner{
	
	//@Autowired
	//static BookRepository br;
	
	@Autowired
	LibService libs;
	
	public static void main(String[] args) {
		SpringApplication.run(SBH2JPAEx.class, args);
		
	}

	public void run(String... args) {
		libs.addBook(new Book("TEST BOOK 2", "01234321"));
		System.out.println("Book Name : " + libs.findBook("01234321").getTitle());
	} 
}
