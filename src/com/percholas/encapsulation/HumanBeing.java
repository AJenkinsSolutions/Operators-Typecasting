package com.percholas.encapsulation;


public class HumanBeing {
	
	private double height;
	private double weight;
	private double bmi;
	
	

	
	public HumanBeing(double height, double weight, double bmi) {
		this.height = height;
		this.weight = weight;
		this.bmi = bmi;
	}

	

	public HumanBeing() {
		
	}



	public double getHeight() {
		return height;
	}



	public void setHeight(double height) {
		this.height = height;
	}



	public double getWeight() {
		return weight;
	}



	public void setWeight(double weight) {
		this.weight = weight;
	}



	public double getBmi() {
		return bmi;
	}



	public void setBmi(double bmi) {
		this.bmi = bmi;
	}



	@Override
	public String toString() {
		return "HumanBeing [height=" + height + ", weight=" + weight + ", bmi=" + bmi + "]";
	}


	

	
	
	
}
