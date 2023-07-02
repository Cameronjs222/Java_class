package com.cameron.burgers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@SpringBootApplication
public class BurgerTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BurgerTrackerApplication.class, args);
	}
	@RequestMapping("")
	public String home() {
		return "redirect:/burgers";
	}
	

}
