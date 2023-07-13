package com.cameron.books.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cameron.books.models.User;
import com.cameron.books.services.UserService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
@RequestMapping("/user")
public class UserController {
	
	
	@Autowired
	UserService uService;
	
	
	@GetMapping("")
	public String loginPage(@ModelAttribute("newUser")User newUser) {
		
		return "index.jsp";
		
	}
	
	@PostMapping("/new")
	public String registration(@Valid @ModelAttribute("newUser")User newUser, BindingResult result, HttpSession session, Model model) {
		
		User newestUser = this.uService.regestration(newUser, result);
		
		if(result.hasErrors()) {
	        model.addAttribute("errors", result.getAllErrors());
	        return "index.jsp";
		}
		
		session.setAttribute("userId", newestUser.getId());
		return "redirect:/home";
		
	}
	
	@GetMapping("/home")
	public String home(Model model, HttpSession session) {
		Long currentUser = (Long) session.getAttribute("userId");
		model.addAttribute("currentUser", this.uService.getById(currentUser));
		return "home.jsp";
		
	}
}
