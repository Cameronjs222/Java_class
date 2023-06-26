package com.Omikuji.cameron.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/Omikuji")
public class SessionController {
	
	@GetMapping("")
	public String index(HttpSession session, Model model) {
		return "index.jsp";
	}
	
	@GetMapping("/show")
	public String Omikuji(HttpSession session) {
		session.getAttribute("message");
		return "Show.jsp";
		
	}
	
	@GetMapping("/clear")
	public String clearSession(HttpSession session) {
		session.invalidate();
		return "redirect:/Omikuji";
	}
	
	@PostMapping("/form")
	public String increment(
			@RequestParam(value="number") Integer number, 
			@RequestParam(value="name") String name,
			@RequestParam(value="city") String city,
			@RequestParam(value="hobby") String hobby,
			@RequestParam(value="pet") String pet,
			@RequestParam(value="message") String message,			
			HttpSession session){
		
		session.setAttribute("message", String.format("In %d years, you will live in %s with %s as your roommante, %s for a living. The next time you see a %s, you will have good luck. Also, %s", number, city, name, hobby, pet, message));
		return "redirect:/Omikuji/show";
	}
}
