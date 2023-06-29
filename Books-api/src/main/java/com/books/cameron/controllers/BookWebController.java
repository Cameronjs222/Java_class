package com.books.cameron.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.books.cameron.models.Book;
import com.books.cameron.services.BookService;

@Controller
@RequestMapping("/books")
public class BookWebController {
	
	@Autowired
	BookService bookService;
	
	@RequestMapping("")
    public String findAllBooks(Model model) {
		model.addAttribute("books", bookService.getAllBooks());
		return "index.jsp";
	}
	
	@RequestMapping("/{id}")
	public String specificBookById(@PathVariable("id") Long id, Model model) {
		Book singleBook = bookService.findBook(id);
		model.addAttribute("Book", singleBook);
		System.out.print(singleBook.getTitle());
		
		return "OneBook.jsp";
		
	}
}
