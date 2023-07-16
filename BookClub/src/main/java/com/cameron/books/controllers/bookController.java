package com.cameron.books.controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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
	public String form(@ModelAttribute("userBook") Book userBook, HttpSession session) {
		if(session.getAttribute("userId")==null) {
			return "redirect:/user";
		}
		return "edit.jsp";
	}

	@PostMapping("/create/{id}")
	public String updateBook(@Valid @ModelAttribute("userBook") Book userBook, BindingResult result,
			HttpSession session) {

		if (result.hasErrors()) {
			if(session.getAttribute("userId")==null) {
				return "redirect:/user";
			}
			return "edit.jsp";
		} else {
			userBook.setUser(this.userService.getById((Long) session.getAttribute("userId")));
			System.out.print(userBook.getTitle());
			bookService.saveBook(userBook);
			return "redirect:/books/all";

		}
	}

	@PostMapping("/create/")
	public String submitBook(@Valid @ModelAttribute("userBook") Book userBook, BindingResult result,
			HttpSession session) {
		if (result.hasErrors()) {
			if (session.getAttribute("userId") == null) {
				return "redirect:/user";
			}
			return "edit.jsp";
		} else {
			userBook.setUser(this.userService.getById((Long) session.getAttribute("userId")));
			System.out.print(userBook.getTitle());
			bookService.saveBook(userBook);
			return "redirect:/books/all";

		}
	}

	@GetMapping("/all")
	public String allBooks(HttpSession session, Model model) {

		if (session.getAttribute("userId") == null) {
			return "redirect:/user";
		}

		model.addAttribute("currentUser", this.userService.getById((Long) session.getAttribute("userId")));
		List<Book> allBooks = this.bookService.findAllBooks();
		model.addAttribute("books", allBooks);
		return "index.jsp";

	}

	@GetMapping("/{bookId}")
	public String oneBook(HttpSession session, Model model, @PathVariable("bookId") Long bookId) {
		if(session.getAttribute("userId")==null) {
			return "redirect:/user";
		}
		model.addAttribute("currentUser", session.getAttribute("userId"));
		model.addAttribute("book", this.bookService.findById(bookId));
		return "view.jsp";
	}

	@GetMapping("/edit/{bookId}")
	public String editBook(@PathVariable("bookId") Long bookId, Model model, HttpSession session) {
		if(session.getAttribute("userId")==null) {
			return "redirect:/user";
		}
		Book userBook = this.bookService.findById(bookId);
		model.addAttribute("userBook", userBook);
		model.addAttribute("bookId", bookId);
		return "edit.jsp";
	}

	@GetMapping("/delete/{bookId}")
	public String deleteBook(@PathVariable("bookId") Long bookId, Model model) {
		System.out.println("test");
		this.bookService.deleteBook(bookId);
		return "redirect:/books/all";
	}
}
