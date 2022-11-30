package com.perscholas.polymorphism;

public class Rectangle extends Shape {

	public Rectangle() {
		
	}

	public Rectangle(String color, double area, double base, double width, double height) {
		super(color, area, base, width, height);
	}

	public Rectangle(String color) {
		super(color);
		
	}

	@Override
	public double getArea() {
		
		return width * height;
	}

	

	@Override
	public void setBase(double base) {
		super.base = base;
	}

	@Override
	public void setWidth(double width) {
		super.width = width;
	}
	
	
	public double perimeter() {
		super.area = super.width * super.height;
		return super.area;
	}
	
	@Override
	public void displayName() {
		// TODO Auto-generated method stub
		super.displayName();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Rectangle[height=" + height + ",width=" + width + "," + super.toString() + "]";

	}
	
	
	
	
		
	
	
}
