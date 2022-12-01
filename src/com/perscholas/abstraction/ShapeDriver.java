package com.perscholas.abstraction;

public class ShapeDriver {

	public static void main(String[] args) {
		Circle c = new Circle(100);
		System.out.println("Area of circle is " + c.getArea());
		
		System.out.println(c instanceof Shape);
		System.out.println(c instanceof Circle);
		
		
		Triangle t = new Triangle("RED");
		t.setBase(300);
		
		System.out.println("The area of Triangle is "+ t.getArea());
		System.out.println(t.toString());
		System.out.println(t instanceof Shape);
	}

}
