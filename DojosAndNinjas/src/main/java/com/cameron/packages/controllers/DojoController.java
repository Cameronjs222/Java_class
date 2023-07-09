/**
 * 
 */
package com.cameron.packages.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cameron.packages.models.Dojo;
import com.cameron.packages.services.DojoService;

import jakarta.validation.Valid;

/**
 * @author camer
 *
 */
@Controller
@RequestMapping("/dojo")
public class DojoController {
	@Autowired DojoService dService;
	
	@GetMapping("")
	public String DojoForm(@ModelAttribute("newDojo")Dojo newDojo, Model model) {
		return "newDojo.jsp";
		
	}
	
	@PostMapping("/new")
	public String AddNewDojo(@Valid @ModelAttribute("newDojo")Dojo newDojo, BindingResult result, Model model) {
		if(result.hasErrors()) {
	        model.addAttribute("errors", result.getAllErrors());
			return "newDojo.jsp";
		}
		else {
			dService.createNewDojo(newDojo);
			return "redirect:/ninja";
		}
	}
	

}
