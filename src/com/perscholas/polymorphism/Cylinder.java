package com.perscholas.polymorphism;

public class Cylinder extends Circle{
	private final double PI = Math.PI;

	public Cylinder(double radius, double height) {
		super(radius, height);
		// TODO Auto-generated constructor stub
	}

	public Cylinder(double radius) {
		super(radius);
		// TODO Auto-generated constructor stub
	}
	
	public double getVolume() {
		return (PI*Math.pow(super.radius, 2) * super.height);
	}
	
	public double getSurfaceArea() {
		return 2.0 * Math.PI*super.radius*super.height;
	}

	@Override
	public void displayName() {
		// TODO Auto-generated method stub
		System.out.println("Drawing a Cylinder for radius \" + super.radius");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "radius is: " + super.radius +"height is : " + super.height;

	}
	
	
	
}
