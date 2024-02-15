package com.moviecatalogservice.models;

public class CatalogItem {
	
	private String name;
	private String description;
	private int rating;
	
	
	public CatalogItem(String name, String description, int id) {

		this.name = name;
		this.description = description;
		this.rating = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getId() {
		return rating;
	}
	public void setId(int id) {
		this.rating = id;
	}
	
	

}
