package com.cameron.burgers.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cameron.burgers.models.Burger;
import com.cameron.burgers.repositories.burgerRepository;

@Service
public class BurgerService {
    @Autowired
    private burgerRepository burgerRepo;

    public Burger addBurger(Burger burger) {
        return burgerRepo.save(burger);
    }

    public List<Burger> getAllBurgers() {
        return burgerRepo.findAll();
    }

    public Optional<Burger> getBurgerById(Long id) {
        return burgerRepo.findById(id);
    }

    public Burger updateBurger(Long id, String burgerName, String restName, String notes, int rating) {
        Optional<Burger> optionalBurger = burgerRepo.findById(id);

        if (optionalBurger.isPresent()) {
            Burger Burger = optionalBurger.get();
            Burger.setBurgerName(burgerName);
            Burger.setRestaurantName(restName);
            Burger.setNotes(notes);
            Burger.setNotes(notes);

            return burgerRepo.save(Burger);
        } else {
            throw new IllegalArgumentException("Burger not found with ID: " + id);
        }
    }
    
    public void deleteBurgerById(Long id) {
        burgerRepo.deleteById(id);
    }

    public void deleteAllBurgers() {
        burgerRepo.deleteAll();
    }
}