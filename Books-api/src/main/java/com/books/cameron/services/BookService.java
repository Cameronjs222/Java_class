package com.books.cameron.services;

import java.util.List;
import java.util.Optional;



import org.springframework.stereotype.Service;

import com.books.cameron.models.Book;
import com.books.cameron.repository.BookRepository;

@Service // This means that this class is a Service and it is going to be managed by Spring Boot.
public class BookService {
    private BookRepository bookRepository;
    
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book createNewBook(Book book) {
        return bookRepository.save(book);
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }
    
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }
    
    
    public Book updateBook(Long id, String title, String desc, String lang, Long numOfPages) {
        Optional<Book> optionalBook = bookRepository.findById(id);

        if (optionalBook.isPresent()) {
            Book book = optionalBook.get();
            book.setTitle(title);
            book.setDescription(desc);
            book.setLanguage(lang);
            book.setNumberOfPages(numOfPages);

            return bookRepository.save(book);
        } else {
            throw new IllegalArgumentException("Book not found with ID: " + id);
        }
    }


	public void deleteBook(Long id) {
		bookRepository.deleteById(id);;
	}
}
