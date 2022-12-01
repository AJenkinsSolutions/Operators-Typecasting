package com.perscholas.abstraction;

public abstract class Shape {
	
	protected String color; 
	protected double height;
	protected double width;
	protected double base;
	
	
	
	//Abstract method 
	//Must be overridden in subclasses
	public abstract double getArea();
	
	public void displayName() {
		System.out.println("I am shape.");
	}
	
	
	public void setColor(String color) {
		this.color = color;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public void setBase(double base) {
		this.base = base;
	}




	
	
	@Override
	public String toString() {
		return "Shape [color=" + this.color + "]";
	}
	
	
	
	
}
