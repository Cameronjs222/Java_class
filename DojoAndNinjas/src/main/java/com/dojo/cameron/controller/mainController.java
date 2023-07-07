package com.dojo.cameron.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dojo.cameron.models.Dojo;
import com.dojo.cameron.services.DojoService;

@Controller
@RequestMapping("/dojos")
public class mainController {
	@Autowired
	private DojoService dojoService;
	
	@GetMapping("")
	public String home(@ModelAttribute("newDojo")Dojo newDojo, Model model) { 
		List<Dojo> allDojos = dojoService.getAllDojos();
		model.addAttribute("newDojo", new Dojo());
		model.addAttribute("dojos", allDojos);
		return "newDojo.jsp";
		
	}
	
	@PostMapping("/add")
	public String addDojosAndNinjas(@ModelAttribute("dojo") Dojo dojo, @RequestParam("dojoName")String dojoName) {
		
		
		return "redirect:/newNinja.jsp";
}

}
