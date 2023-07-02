package com.cameron.burgers.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table
public class Burger {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@NotNull
	@Size(min = 1, message = "Your must enter a name for your burger")
	@Size(max = 20, message = "please keep the name of your burger to under 20 characters")
	private String burgerName;
	@NotNull
	@Size(min = 1, message = "you must enter a restaurant name")
	@Size(max = 50, message = "please keep the resturant name to under 50 character")
	private String restaurantName;
	@NotNull
	@Min(value = 1, message = "Rating must be at least 1")
	@Max(value = 5, message = "Rating cannot exceed 5")
	private int rating;
	@NotNull
	@Size(min = 1, message = "Notes must note be blank")
	@Size(max = 255, message = "Please keep you notes under 255 characters")
	private String notes;

	public Burger(Long id, String burgerName, String restaurantName, int rating, String notes) {
		super();
		this.id = id;
		this.burgerName = burgerName;
		this.restaurantName = restaurantName;
		this.rating = rating;
		this.notes = notes;
	}

	public Burger() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBurgerName() {
		return burgerName;
	}

	public void setBurgerName(String burgerName) {
		this.burgerName = burgerName;
	}

	public String getRestaurantName() {
		return restaurantName;
	}

	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

}
