package com.perscholas.abstraction;

public class ShapeDriver {

	public static void main(String[] args) {
		Circle c = new Circle(100, 0, 0);
		System.out.println("Area of circle is " + c.getArea());
		
		System.out.println(c instanceof Shape);
		System.out.println(c instanceof Circle);
		
		
		Triangle t = new Triangle("RED");
		t.setBase(300);
		
		System.out.println("The area of Triangle is "+ t.getArea());
		System.out.println(t.toString());
		System.out.println(t instanceof Shape);
		
		System.out.println("+++++++++++++++++");
	       Shape shapeRectangleObj = new Rectangle("Red"); //UpCasting
	       shapeRectangleObj.displayName();
	       shapeRectangleObj.setHeight(2);
	       shapeRectangleObj.setWidth(4);
	       System.out.println("Area of Rectangle is " + shapeRectangleObj.getArea());
	       System.out.println(shapeRectangleObj);  // Run Rectangle's toString()
	       // Use instanceof operator for Validation
	       System.out.println(shapeRectangleObj instanceof Rectangle); // true
	       
	       System.out.println("Coordinates are " + c.getCorodinate());
	       c.moveDown();
	       c.moveLeft();
	       System.out.println("After move down and move left, corodinates are " + c.getCorodinate());
	       
	       c.moveUp();
	       System.out.println("After move Up, Coordinates are " + c.getCorodinate());

	       c.moveLeft();
	       System.out.println("After move left, Coordinates are " + c.getCorodinate());


	       System.out.println("--------Test Polymorphism-------");
	       Movable c2 = new Circle(5, 10, 200);  // upcast
	       c2.moveUp();
	       System.out.println("After move up , Coordinates are " + c2.getCorodinate());

	       c2.moveLeft();
	       System.out.println("After move Left , Coordinates are " + c2.getCorodinate());
	        }


	

}

