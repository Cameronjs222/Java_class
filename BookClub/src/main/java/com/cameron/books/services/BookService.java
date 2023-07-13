package com.cameron.books.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cameron.books.models.Book;
import com.cameron.books.repositories.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository bookRepo;
	
	public Book createNewBook(Book newBook) {
		return this.bookRepo.save(newBook);
	}
}
