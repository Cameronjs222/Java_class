package com.cameron.burgers.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cameron.burgers.models.Burger;

@Repository
public interface burgerRepository extends CrudRepository<Burger, Long>{
    List<Burger> findAll();
}
