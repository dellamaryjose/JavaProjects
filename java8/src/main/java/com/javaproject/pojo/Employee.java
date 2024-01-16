package com.javaproject.pojo;

import java.util.List;

public class Employee {
	private int id;
	private String name;
	private List<Integer> phoneNumbers;
	
	
	public Employee(int id, String name, List<Integer> phoneNumbers) {
		super();
		this.id = id;
		this.name = name;
		this.phoneNumbers = phoneNumbers;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Integer> getPhoneNumbers() {
		return phoneNumbers;
	}
	public void setPhoneNumbers(List<Integer> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", phoneNumbers=" + phoneNumbers + "]";
	}
}
