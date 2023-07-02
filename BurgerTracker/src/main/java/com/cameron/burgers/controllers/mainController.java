package com.cameron.burgers.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.cameron.burgers.models.Burger;
import com.cameron.burgers.service.BurgerService;

public class mainController {
	@Autowired
	BurgerService burgerService;
	
	@GetMapping
	public String home(@ModelAttribute("burger") Burger burger, Model model) {
		
		List<Burger> allBurgers = burgerService.getAllBurgers();
		model.addAttribute("burgers", allBurgers);
		return "index.jsp";
		
	}
}
