package com.perscholas.polymorphism;

public class Triangle extends Shape{

	public Triangle() {
		
	}

	public Triangle(String color, double area, double base, double width, double height) {
		super(color, area, base, width, height);
		// TODO Auto-generated constructor stub
	}

	public Triangle(String color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 0.5 * base * height;
	}

	@Override
	public void setBase(double base) {
		// TODO Auto-generated method stub
		super.base = base;
	}

	@Override
	public void setWidth(double width) {
		// TODO Auto-generated method stub
		super.width = width;
	}

	@Override
	public void displayName() {
		// TODO Auto-generated method stub
		System.out.println("I am a Triangle");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Triangle[base=" + base + ",height=" + height + "," + super.toString() + "]";
	   }

	}
	
	
	
	
	
	

		

