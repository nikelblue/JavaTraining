/**
 * 
 */
package org.training.inheritance.animals;

/**
 * @author monkey
 *
 */
public class Mammal extends Animal {

	public String getName() {
		return "Mammal";
	}
	
	public static void main(String[] args) {
		Mammal mammal = new Mammal();
		mammal.move();
	}

}
