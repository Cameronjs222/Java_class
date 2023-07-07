package com.dojo.cameron.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dojo.cameron.models.Dojo;

	@Repository
	public interface DojoRepository extends CrudRepository<Dojo, Long>{
		List<Dojo> findAll();
	}