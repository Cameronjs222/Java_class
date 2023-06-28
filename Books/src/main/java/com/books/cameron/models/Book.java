package com.books.cameron.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="books")
public class Book {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	@NotEmpty
	@Size(min= 5, max = 100)
	private String book_title;
	@NotEmpty
	@Size(min = 5, max = 200)
	private String description;
	@NotEmpty
	@Size(min = 3, max = 20)
	private String language;
	@Min(min = 20, message = "must be at least 20 pages long")
	private Long number_of_pages;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getBook_title() {
		return book_title;
	}
	public void setBook_title(String book_title) {
		this.book_title = book_title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public Long getNumber_of_pages() {
		return number_of_pages;
	}
	public void setNumber_of_pages(Long number_of_pages) {
		this.number_of_pages = number_of_pages;
	}
	
	
	

}
