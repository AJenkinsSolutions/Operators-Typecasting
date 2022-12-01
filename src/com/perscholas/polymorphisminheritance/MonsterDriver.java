package com.perscholas.polymorphisminheritance;

public class MonsterDriver {

	public static void main(String[] args) {
		
		FireMonster fireMonster = new FireMonster("Fire monster", "Fire");
		WaterMonster waterMonster = new WaterMonster("Water monster", "Water");
		StoneMonster stoneMonster = new StoneMonster("Stone Monster", "Stone");
		
		
		System.out.println(fireMonster.attack());
		System.out.println(waterMonster.attack());
		System.out.println(stoneMonster.attack());
		
		fireMonster.showPowers();
		waterMonster.showPowers();
		stoneMonster.showPowers();
		
	}
	
	
	
	

}
