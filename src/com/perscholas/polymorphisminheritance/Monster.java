package com.perscholas.polymorphisminheritance;

public abstract class Monster {
	
	String name;
	String powerElement;
	
	
	//abstract method 
	public abstract String attack();
	
	
	//concrete method 
	public void showPowers() {
		System.out.println(this.name + " shows off " + powerElement + " elements");
		
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
}
