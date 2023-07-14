package com.cameron.books.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cameron.books.models.Book;
import com.cameron.books.services.BookService;
import com.cameron.books.services.UserService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
@Controller
@RequestMapping("/books")
public class bookController {
	
	@Autowired 
	private UserService userService;
	@Autowired
	private BookService bookService;
	
	@GetMapping("")
	public String form(@ModelAttribute("newBook")Book newBook) {
		return "edit.jsp";
	}
	
	@PostMapping("/create")
	public String submitBook(@Valid @ModelAttribute("newBook")Book newBook, BindingResult result, HttpSession session) {
		
		if(result.hasErrors()) {
			return "edit.jsp";
		}
		else {
			newBook.setUser(this.userService.getById((Long) session.getAttribute("userId")));
			System.out.print(newBook.getTitle());
			bookService.createNewBook(newBook);
			return "redirect:/index.jsp";
			
		}
		
		
		
		
		
	}
}
