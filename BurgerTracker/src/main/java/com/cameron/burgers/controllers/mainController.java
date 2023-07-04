package com.cameron.burgers.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cameron.burgers.models.Burger;
import com.cameron.burgers.service.BurgerService;

import jakarta.validation.Valid;

@Controller
public class mainController {
	@Autowired
	BurgerService burgerService;
	
	@GetMapping("/burgers")
	public String home(@ModelAttribute("burger") Burger burger, Model model) {
		List<Burger> allBurgers = burgerService.getAllBurgers();
		model.addAttribute("burgers", allBurgers);
		return "index.jsp";
		
	}
	
	@PostMapping("/add")
	public String addBurger(@Valid @ModelAttribute("burger") Burger burger, BindingResult result, Model model) {
	    if (result.hasErrors()) {
			List<Burger> allBurgers = burgerService.getAllBurgers();
			model.addAttribute("burgers", allBurgers);
	        model.addAttribute("errors", result.getAllErrors());
	        return "index.jsp";
	    } else {
	        burgerService.addBurger(burger);
	        return "redirect:/";
	    }
	}

	@RequestMapping("/burgers/{id}")
	public String specificBookById(@PathVariable("id") Long id, Model model) {
		Optional<Burger> singleBurger = burgerService.getBurgerById(id);
		model.addAttribute("Burger", singleBurger);
		
		return "OneBurger.jsp";
		
	}
}
