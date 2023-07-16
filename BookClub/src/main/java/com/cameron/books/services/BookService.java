package com.cameron.books.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cameron.books.models.Book;
import com.cameron.books.repositories.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository bookRepo;

	public Book saveBook(Book newBook) {
		return this.bookRepo.save(newBook);
	}
	
	public List<Book> findAllBooks(){
		return this.bookRepo.findAll();
	}

	public Book findById(Long bookId) {
		System.out.println("I have been called and work perfectly");
		return this.bookRepo.findById(bookId).orElse(null);
	}
	
	public void deleteBook(Long bookId) {
		this.bookRepo.deleteById(bookId);;
	}
}
