package com.books.cameron.controllers;

import java.util.ArrayList;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.books.cameron.models.Book;
import com.books.cameron.services.BookService;

import jakarta.servlet.http.HttpSession;
@RestController
public class BookContoller {
    private final BookService bookService;
    public BookContoller(BookService bookService){
        this.bookService = bookService;
    }
    
    @RequestMapping(value="/api/books", method=RequestMethod.POST)
    public Book newBook(
    		@RequestParam(value="title") String title, 
    		@RequestParam(value="description") String desc, 
    		@RequestParam(value="language") String lang,
    		@RequestParam(value="numberOfPages") Long numOfPages) {
    	
    	Book newBook = new Book(title, desc, lang, numOfPages);
        com.books.cameron.models.Book book = bookService.createNewBook(newBook);
        return book;
    }
    
    @RequestMapping(value="/api/books/{id}", method=RequestMethod.PATCH)
    public com.books.cameron.models.Book update(
    		@PathVariable("id") Long id, 
    		@RequestParam(value="title") String title, 
    		@RequestParam(value="description") String desc, 
    		@RequestParam(value="language") String lang,
    		@RequestParam(value="numberOfPages") Long numOfPages) {
    	com.books.cameron.models.Book book = bookService.updateBook(id, title, desc, lang, numOfPages);
    	return book;
    }
    
    @RequestMapping(value="/api/books", method=RequestMethod.GET)
    public ArrayList<Book> findAllBooks(HttpSession session) {
        ArrayList<Book> allbooks = new ArrayList<Book>();
        allbooks.addAll(bookService.getAllBooks());
        session.setAttribute("books", allbooks);
        System.out.print(session.getAttribute("books"));
        return allbooks;
    }   
    
    @RequestMapping(value="/api/books/{id}", method=RequestMethod.DELETE)
    public void destroy(@PathVariable("id") Long id) {
        bookService.deleteBook(id);
    }
    
    @RequestMapping(value="/api/books/{id}", method=RequestMethod.GET)
    public Book findOneBook(@PathVariable("id") Long id) {
    	Book singleBook = bookService.findBook(id);
		return singleBook;
    	
    }
}
