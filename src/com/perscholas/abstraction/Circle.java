package com.perscholas.abstraction;

public class Circle extends Shape {
	
	protected double radius; 
	
	private final double PI = Math.PI;
	
	
	// Constructors
	public Circle(double radius) {
		this.radius = radius;
	}

	public Circle(double radius, double height) {
		this.radius = radius;
		super.height = height;
	}

	
	@Override
	public double getArea() {
		
		double area = PI * Math.pow(this.radius, 2);
		return area;
	}

	@Override
	public void displayName() {
		System.out.println("Drawing a circle with a radius of " + this.radius);
	}

	@Override
	public String toString() {
		
		return "Circle [radius = " + this.radius + super.toString()+  "]";
	}
	
	

}
