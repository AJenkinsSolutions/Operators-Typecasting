package com.perscholas.polymorphisminheritance;

public class WaterMonster extends Monster{

	
	
	
	
	

	public WaterMonster(String name, String powerElement) {
		this.name = name;
		this.powerElement = powerElement;
	}

	@Override
	public String attack() {
		
		return (this.name + " Shoots water ball");
	}

}
