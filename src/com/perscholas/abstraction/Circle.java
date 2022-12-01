package com.perscholas.abstraction;

public class Circle extends Shape implements Movable {
	
	protected double radius; 
	
	private final double PI = Math.PI;
	
	private int x, y;
	
	
	
	public Circle(double radius, int x, int y) {
		super();
		this.radius = radius;
		this.x = x;
		this.y = y;
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


	@Override
	public void moveUp() {
		// TODO Auto-generated method stub
		y++;
		
	}


	@Override
	public void moveDown() {
		// TODO Auto-generated method stub
		y--;
	}


	@Override
	public void moveLeft() {
		// TODO Auto-generated method stub
		x--;
	}


	@Override
	public void moveRight() {
		// TODO Auto-generated method stub
		x++;
	}


	@Override
	public String getCorodinate() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
