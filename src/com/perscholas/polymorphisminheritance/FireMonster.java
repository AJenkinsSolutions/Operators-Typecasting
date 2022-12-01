package com.perscholas.polymorphisminheritance;

public class FireMonster extends Monster {

	
	
	
	
	public FireMonster() {
		
	}

	public FireMonster(String name, String elementalPower) {
		super.name = name;
		super.powerElement = elementalPower;
	}
	

	@Override
	public String attack() {
		return (this.name + " Shoots fire ball");
	}
	
	

}
