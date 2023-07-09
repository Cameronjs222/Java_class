package com.cameron.packages.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cameron.packages.models.Ninja;
import com.cameron.packages.repositories.NinjaRepository;

@Service
public class NinjaService {
	@Autowired
    private NinjaRepository ninjaRepo;

    public void createNewNinja(Ninja ninja) {
    	ninjaRepo.save(ninja);
    }

    public List<Ninja> getAllNinjas() {
        return ninjaRepo.findAll();
    }
}
