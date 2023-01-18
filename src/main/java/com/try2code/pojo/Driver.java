package com.try2code.pojo;

public class Driver {
	
	private int id ;
	private String firstName ; 
	private String LastName  ;
	public Driver() {
		super();
	}
	public Driver(int id, String firstName, String lastName, boolean active) {
		super();
		this.id = id;
		this.firstName = firstName;
		LastName = lastName;
		this.active = active;
	}
	private boolean active ;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	
	
	

}
