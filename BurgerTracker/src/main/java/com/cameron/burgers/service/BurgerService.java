package com.cameron.burgers.service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cameron.burgers.models.Burger;
import com.cameron.burgers.repositories.burgerRepository;

import jakarta.validation.Valid;

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

    public Burger getBurgerById(Long id) {
    	return burgerRepo.findById(id).orElse(null);
    }

    public Burger updateBurger(Burger burger) {
        return burgerRepo.save(burger);
    }

    
    public void deleteBurgerById(Long id) {
        burgerRepo.deleteById(id);
    }

    public void deleteAllBurgers() {
        burgerRepo.deleteAll();
    }
}