package com.minewaku.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "catagory")
public class CatagoryEntity {
	
    @Id
	@Column(name = "catagoryId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int catagoryId;

	@Column
	private String name;
	
	@Column
	private boolean active = true;
	
	@OneToMany(mappedBy = "catagory")
	private List<BookEntity> books = new ArrayList<>();
	
	
	public int getCatagoryId() {
		return catagoryId;
	}

	public void setCatagoryId(int catagoryId) {
		this.catagoryId = catagoryId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public List<BookEntity> getBooks() {
		return books;
	}

	public void setBooks(List<BookEntity> books) {
		this.books = books;
	}

}
