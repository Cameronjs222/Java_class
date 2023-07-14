package com.cameron.books.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cameron.books.models.LoginUser;
import com.cameron.books.models.User;
import com.cameron.books.services.UserService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
@RequestMapping("/user")
public class UserController {
	
	
	@Autowired
	UserService userService;
	
	
	@GetMapping("")
	public String loginPage(@ModelAttribute("newUser")User newUser, @ModelAttribute("loginUser")User loginUser) {
		
		return "login.jsp";
		
	}
	
	@PostMapping("/new")
	public String registration(@Valid @ModelAttribute("newUser")User newUser, BindingResult result, HttpSession session, Model model) {
		
		User newestUser = this.userService.regestration(newUser, result);
		
		if(result.hasErrors()) {
	        model.addAttribute("errors", result.getAllErrors());
	        return "login.jsp";
		}
		session.setAttribute("userId", newestUser.getId());
		return "redirect:/books";
		
	}
	
	@PostMapping("/login")
	public String home(@Valid @ModelAttribute("loginUser")LoginUser loginUser, BindingResult result, Model model, HttpSession session) {
		User user = userService.login(loginUser, result);
	    
        if(result.hasErrors()) {
            model.addAttribute("newUser", new User());
            model.addAttribute("errors", result.getAllErrors());
           System.out.print(result.getAllErrors()); 
            return "login.jsp";
        }
        else {
        	session.setAttribute("userId", user.getId());
        	return "redirect:/books";        	
        }
    
		
	}
}
