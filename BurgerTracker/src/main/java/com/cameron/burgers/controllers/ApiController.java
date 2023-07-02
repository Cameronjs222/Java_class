package com.cameron.burgers.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.cameron.burgers.models.Burger;
import com.cameron.burgers.service.BurgerService;

@RestController
@RequestMapping(path="/api/burger")
public class ApiController {
    @Autowired
    private BurgerService burgerService;

    @PostMapping(path="/add")
    public Burger addNewBurger(@RequestParam String burgerName, @RequestParam String restName, @RequestParam String notes, @RequestParam int rating) {
        Burger newBurger = new Burger();
        newBurger.setBurgerName(burgerName);
        newBurger.setRestaurantName(restName);
        newBurger.setRating(rating);
        newBurger.setNotes(notes);
        Burger burger = burgerService.addBurger(newBurger);
        return burger;
    }

    @GetMapping(path="/all")
    public List<Burger> getAllBurgers() {
        List<Burger> allBurgers = burgerService.getAllBurgers();
        return allBurgers;
    }

    @GetMapping(path="/one/{id}")
    public Optional<Burger> getBurgerById(@PathVariable("id") Long burgerId) {
        Optional<Burger> specificBurger = burgerService.getBurgerById(burgerId);
        return specificBurger;
    }

    @PutMapping(path="/update/{id}")
    public Burger updateBurger(@PathVariable("id") Long burgerId, @RequestParam String burgerName, @RequestParam String restName, @RequestParam String notes, @RequestParam int rating) {
        Optional<Burger> optionalBurger = burgerService.getBurgerById(burgerId);
        if (optionalBurger.isPresent()) {
            Burger existingBurger = optionalBurger.get();
            existingBurger.setBurgerName(burgerName);
            existingBurger.setRestaurantName(restName);
            existingBurger.setRating(rating);
            existingBurger.setNotes(notes);
            Burger updatedBurger = burgerService.addBurger(existingBurger);
            return updatedBurger;
        } else {
            throw new IllegalArgumentException("Burger not found with ID: " + burgerId);
        }
    }

    @DeleteMapping(path="/delete/{id}")
    public void deleteSpecificBurger(@PathVariable("id") Long burgerId) {
        burgerService.deleteBurgerById(burgerId);
    }

    @DeleteMapping(path="/delete/all")
    public void deleteAllBurgers() {
        burgerService.deleteAllBurgers();
    }
}