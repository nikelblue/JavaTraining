package org.training.inheritance.overriding.example1;

public class Triangle extends Shape {
	
	//This methos has the same signature with Shape#draw.
	//Signature is deterined based on method name and it's arguments type.
	//Defining this method here means that 
	//we want to use our own implementation, different from that from superclass. 
	//It means we OVERRIDE draw() method.
	//Please note the annotation!
	@Override
	public void draw() {
		System.out.println("Drawing a triangle");
	};
}
