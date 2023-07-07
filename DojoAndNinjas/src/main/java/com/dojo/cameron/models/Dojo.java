package com.dojo.cameron.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "dojo")
public class Dojo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@NotNull
	@Size(min = 3, max = 50, message = "Dojo's name is required")
	private String dojoName;

	public Dojo(Integer id, @NotNull @Size(min = 3, max = 50, message = "Dojo's name is required") String dojoName) {
		super();
		this.id = id;
		this.dojoName = dojoName;
	}

	public Dojo() {
	}

	public String getDojoName() {
		return dojoName;
	}

	public void setDojoName(String dojoName) {
		this.dojoName = dojoName;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
