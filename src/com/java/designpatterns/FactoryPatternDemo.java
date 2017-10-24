package com.java.designpatterns;

public class FactoryPatternDemo {

	 public static void main(String[] args) {
	      ShapeFactory shapeFactory = new ShapeFactory();

	      //get an object of Rectangle and call its draw method.
	      Shape shape1 = shapeFactory.getShape("RECTANGLE");

	      //call draw method of Rectangle
	      shape1.draw();

	      //get an object of Square and call its draw method.
	      Shape shape2 = shapeFactory.getShape("SQUARE");

	      //call draw method of square
	      shape2.draw();
	      
	      Shape shape3 = shapeFactory.getShape("SQUARE");
	      
	      //call draw method 
	      shape3.draw();
	   }

}
