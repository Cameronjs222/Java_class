package com.cameron.packages.controllers;

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

import com.cameron.packages.models.Dojo;
import com.cameron.packages.models.Ninja;
import com.cameron.packages.services.DojoService;
import com.cameron.packages.services.NinjaService;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/ninja")
public class NinjaController {
	@Autowired NinjaService sService;
	@Autowired DojoService dService;
	
	@GetMapping("")
	public String DojoForm(@ModelAttribute("newNinja")Ninja newNinja, Model model) {
		List<Dojo> allDojos = this.dService.getAllDojos();
		model.addAttribute("dojos", allDojos);
		return "newNinja.jsp";
		
	}
	
	@PostMapping("/new")
	public String AddNewDojo(@Valid @ModelAttribute("newNinja")Ninja newNinja, BindingResult result, Model model) {
		if(result.hasErrors()) {
	        model.addAttribute("errors", result.getAllErrors());
			return "newNinja.jsp";
		}
		else {
			this.sService.createNewNinja(newNinja);
			return String.format("redirect:/ninja/%s", newNinja.getDojo().getId());
		}
	}
	
	@GetMapping("/{dojoId}")
	public String allNinjas(@PathVariable("dojoId")Long id, Model model) {
		Dojo selectedDojo = this.dService.getDojoById(id);
		model.addAttribute("dojo", selectedDojo);
		return "index.jsp";
		
	}
	

}

