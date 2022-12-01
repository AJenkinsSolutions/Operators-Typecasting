package com.perscholas.polymorphisminheritance;

public class StoneMonster extends Monster{

	
	
	
	
	
	public StoneMonster() {
		
	}

	public StoneMonster(String name, String powerElement) {
		this.name = name;
		this.powerElement = powerElement;
		
	}

	@Override
	public String attack() {
		// TODO Auto-generated method stub
		return this.name + "Shoots stone bolder";
	}

}
