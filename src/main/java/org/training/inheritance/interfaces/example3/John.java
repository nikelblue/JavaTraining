package org.training.inheritance.interfaces.example3;


public class John implements Paladin {


	/**
	 * Implements the method defined in Character interface.
	 * TODO: try to comment this method entirely. What do you notice?
	 */
	public String getName() {
		return "John";
	}

	public void fightWithSword() {
		System.out.println(getName() + ": Fighting with sword!");
	}

}
