package com.perscholas.abstraction;

public class Rectangle extends Shape {
	
	
	public Rectangle(String color) {
		super.color = color;
	}

	
	
	
	public Rectangle(String color, double height, double width) {
		super.color = color; 
		super.height = height;
		super.width = width;
		
	}

	


	@Override
	public void displayName() {
		// TODO Auto-generated method stub
		System.out.println("I am a Rectangle");
	}




	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Rectangle[height=" + height + ",width=" + width + "," + super.toString() + "]";
	}




	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return super.width *  super.height;

	}

}
