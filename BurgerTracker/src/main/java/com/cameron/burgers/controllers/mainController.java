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
@RequestMapping("/burgers")
public class mainController {
	@Autowired
	BurgerService burgerService;
	
	@GetMapping("")
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

	@RequestMapping("/edit/{id}")
	public String editBurgerById(@PathVariable("id") Long id, Model model) {
		model.addAttribute("burgerToEdit", this.burgerService.getBurgerById(id));
		return "edit.jsp";
		
	}
	
	@PostMapping(value="/update/{id}")
    public String update(@Valid @ModelAttribute("burgerToEdit") Burger burger, BindingResult result, Model model) {
        if (result.hasErrors()) {
            model.addAttribute("Burger", burger);
            return "edit.jsp";
        } else {
            this.burgerService.updateBurger(burger);
            return "redirect:/burgers";
        }
    }
	
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable("id")Long id) {
		this.burgerService.deleteBurgerById(id);
		return "redirect:/burgers";
		
	}
	
	@RequestMapping("/{id}")
	public String specificBookById(@PathVariable("id") Long id, Model model) {
		model.addAttribute("burgerToEdit", this.burgerService.getBurgerById(id));
		return "oneBurger.jsp";
		
	}

}
