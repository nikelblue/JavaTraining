package org.training.inheritance.overriding.example1;

public class SahpeTest {
	public static void main(String[] args) {
		Shape shape = new Shape();
		Triangle triangle = new Triangle();
		
		shape.draw(); //draws a shape
		triangle.draw(); //draws a triangle
	}
}
