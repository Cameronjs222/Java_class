package com.cameron.books.services;

import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.cameron.books.models.LoginUser;
import com.cameron.books.models.User;
import com.cameron.books.repositories.UserRepository;

import jakarta.validation.Valid;

@Service
public class UserService {
	@Autowired
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

	public User getById(Long id) {
		return this.userRepo.findById(id).orElse(null);
	}

	public User login(@Valid LoginUser loginUser, BindingResult result) {
		System.out.print(loginUser);
		Optional<User> currentUser = this.userRepo.findByEmail(loginUser.getEmail());
		System.out.print(currentUser);
		if(!currentUser.isPresent()) {
			result.rejectValue("email", "NotFound", "Account not Found");
			return null;
			}
		User returningUser = currentUser.get();
		
		if(!BCrypt.checkpw(loginUser.getPassword(), returningUser.getPassword())) {
			result.rejectValue("password", "Matches", "Invalid credentials");
		}
		
		if(result.hasErrors()) {
			return null;
		}
		return returningUser;
	}
    
    
}
