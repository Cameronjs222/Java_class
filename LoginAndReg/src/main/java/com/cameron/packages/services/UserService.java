package com.cameron.packages.services;

import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.cameron.packages.models.User;
import com.cameron.packages.repositories.UserRepository;

@Service
public class UserService {
	private UserRepository userRepo;
	
    public void save(User user) {
        userRepo.save(user);
    }
    
    public User regestration(User newUser, BindingResult result) {
		Optional<User> potentialUser = userRepo.findByEmail(newUser.getEmail());
    	if (potentialUser.isPresent()) {
    		result.rejectValue("Email", "Matches", "Email is all ready registered");
    	}
    	
    	if (!newUser.getPassword().equals(newUser.getConfirm())) {
    		result.rejectValue("Confirm", "Matches", "Passwords do not match.");
    	}
		if(result.hasErrors()) {
			return null;
			
		}
		
		String hashed = BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt());
		newUser.setPassword(hashed);
		
    	return this.userRepo.save(newUser);
    	 	
    }

	public Object getById(Long id) {
		this.userRepo.findById(id).orElse(null);
		// TODO Auto-generated method stub
		return null;
	}
    
    
}
