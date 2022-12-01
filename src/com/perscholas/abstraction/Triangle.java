package com.perscholas.abstraction;

public class Triangle extends Shape {

	public Triangle() {
		
	}
	
	public Triangle(String color) {
		super.color = color;
		
	}
	
	
	
	
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 0.5*super.base;
	}
	
	
	@Override
	   public void displayName() {
	       System.out.println("I am a TriAngle"  );
	   }
	   /** Returns a self-descriptive string */
	   @Override
	   public String toString() {
	       return "Triangle[base=" + super.base + ",height=" + super.height + "," + super.toString() + "]";
	   }


}
