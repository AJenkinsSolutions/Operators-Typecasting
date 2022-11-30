package com.perscholas.polymorphism;

public class Circle extends Shape {

	protected double radius;
	private final double PI = Math.PI;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public Circle(double radius, double height) {
		this.radius = radius;
		super.height = height;
	}
	public double getArea() {
		
		super.area = PI * Math.pow(this.radius, 2);
		
		return super.area; 
	}

	@Override
	public void displayName() {
		// TODO Auto-generated method stub
		System.out.println("Drawing a Circle of radius" + this.radius);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Circle [ radius = " +  radius + super.toString() + "]";
	}
	
	
}
