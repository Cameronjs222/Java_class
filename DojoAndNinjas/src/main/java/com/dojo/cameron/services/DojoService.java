package com.dojo.cameron.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dojo.cameron.models.Dojo;
import com.dojo.cameron.repositories.DojoRepository;
@Service
public class DojoService {
	
	@Autowired 
	private DojoRepository dojoRepo; 
	public List<Dojo> getAllDojos() {
		return this.dojoRepo.findAll();
	}

}
