package com.books.cameron.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.books.cameron.models.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long>{
    // this method retrieves all the books from the database
    List<Book> findAll();
    // this method finds books with descriptions containing the search string
    List<Book> findByDescriptionContaining(String title);
    // this method counts how many titles contain a certain string
    Long countByTitleContaining(String title);
    // this method deletes a book that starts with a specific title
    Long deleteByTitleStartingWith(String title);
    
    
}
