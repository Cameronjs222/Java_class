package com.cameron.books.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cameron.books.models.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{
    // this method retrieves all the books from the database
    List<User> findAll();
    
    Optional<User> findByEmail(String email);
}
