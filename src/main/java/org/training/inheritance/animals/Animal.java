/**
 * 
 */
package org.training.inheritance.animals;

/**
 * @author monkey
 *
 */
public class Animal {
	

	public String getName() {
		return "Animal";
	}

	public void eat() {
		System.out.println(getName() + ": eating...");
	}
	
	public void move() {
		System.out.println(getName() + ": moving...");
	}
	
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.eat();
		animal.move();
	}
}

