package com.training.topic;



public class Topic {

	private String id;
	private String name;
	private String description;
	
	
	//no argument constructor so that the object becomes easier to initialize
	public Topic() {
		
	}

	
	//topic model object
	//constructor has been generated
	public Topic(String id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}
	
	
	//Generated Getters and Setters for the Id, name, and description
	
	
	
	//getter for id
	public String getId() {  
		return id;
	}
	//setters for id
	public void setId(String id) {
		this.id = id;
	}
	
	//getter for name
	public String getName() {
		return name;
	}
	//setter for name 
	public void setName(String name) {
		this.name = name;
	}
	
	//getter for description
	public String getDescription() {
		return description;
	}
	//setter for description
	public void setDescription(String description) {
		this.description = description;
	}
	
}
