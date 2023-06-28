package com.books.cameron.models;

import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="books")
public class Book {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	@NotEmpty
	@Size(min= 5, max = 100)
	private String title;
	@NotEmpty
	@Size(min = 5, max = 200)
	private String description;
	@NotEmpty
	@Size(min = 3, max = 20)
	private String language;
	@Min(value = 20, message = "must be at least 20 pages long")
	private Long numberOfPages;
	public Integer getId() {
		return id;
	}
    public Book() {
	}
	public Book(String title, String desc, String lang, Long numOfPages) {
        this.title = title;
        this.description = desc;
        this.language = lang;
        this.numberOfPages = numOfPages;
    }
    void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
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
	public Long getNumberOfPages() {
		return numberOfPages;
	}
	public void setNumberOfPages(Long numberOfPages) {
		this.numberOfPages = numberOfPages;
	}
	
	
	

}
