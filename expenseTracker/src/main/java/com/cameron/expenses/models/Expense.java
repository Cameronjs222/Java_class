package com.cameron.expenses.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table
public class Expense {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@NotNull
	@Size(min = 1, message = "Your must enter a name for your expense")
	@Size(max = 20, message = "please keep the name of your expense to under 20 characters")
	private String expenseName;
	@NotNull
	@Size(min = 1, message = "you must enter a vendor name")
	@Size(max = 50, message = "please keep the resturant name to under 50 character")
	private String vendorName;
	@NotNull
	@DecimalMin(value = "1.0", inclusive = true, message = "Amount must be at least 1")
	@DecimalMax(value = "999.0", inclusive = true, message = "Amount cannot exceed 999")
	private double amount;
	@NotNull
	@Size(min = 1, message = "Description must note be blank")
	@Size(max = 255, message = "Please keep you description under 255 characters")
	private String description;

	public Expense(Long id, String expenseName, String vendorName, int amount, String description) {
		super();
		this.id = id;
		this.expenseName = expenseName;
		this.vendorName = vendorName;
		this.amount = amount;
		this.description = description;
	}

	public Expense() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getExpenseName() {
		return expenseName;
	}

	public void setExpenseName(String expenseName) {
		this.expenseName = expenseName;
	}

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
