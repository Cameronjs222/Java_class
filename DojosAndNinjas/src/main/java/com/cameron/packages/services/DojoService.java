package com.cameron.packages.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cameron.packages.models.Dojo;
import com.cameron.packages.repositories.DojoRepository;

@Service
public class DojoService {
	@Autowired // This means to get the bean called userRepository which is auto-generated by Spring, we will use it to handle the data.
    private DojoRepository dojoRepo;

    public void createNewDojo(Dojo dojo) {
        dojoRepo.save(dojo);
    }

    public List<Dojo> getAllDojos() {
        return dojoRepo.findAll();
    }

	public Dojo getDojoById(Long id) {
		Optional<Dojo> result = dojoRepo.findById(id);
        if(result.isPresent()) {
            return result.get();
        } else {
            return null;
        }
		
		// TODO Auto-generated method stub
		
	}
}