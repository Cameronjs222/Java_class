package com.fruit.loop;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@SpringBootApplication
@Controller
public class FruityLoopsApplication {
     public static void main(String[] args) {
             SpringApplication.run(FruityLoopsApplication.class, args);
     }
     
     @RequestMapping("/test")
 	public String index(Model model) {
 		ArrayList<Item> fruits = new ArrayList<Item>();
        fruits.add(new Item("Kiwi", 1.5));
        fruits.add(new Item("Mango", 2.0));
        fruits.add(new Item("Goji Berries", 4.0));
        fruits.add(new Item("Guava", .75));
        fruits.add(new Item("Tangeruine", 2.0));
 		model.addAttribute("listOfFruitItems", fruits);
 		return "index.jsp";
     }
}
