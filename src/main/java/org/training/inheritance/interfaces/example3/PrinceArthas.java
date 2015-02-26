package org.training.inheritance.interfaces.example3;

/**
 * !!!Please note that a class can implement as many interfaces we like. 
 * THIS IS THE MAIN BENEFIT OF USING INTERFACES INSTEAD OF ABSTRACT CLASSES,
 * since a class can extend exactly one superclass. 
 * 
 * This class has to implement all the methods from all interfaces it implements, on all levels.
 * @author nikelblue
 *
 */
public class PrinceArthas implements Paladin, Wizard {
	
	/**
	 * Implements the method defined in Character interface.
	 * TODO: try to comment this method entirely. What do you notice?
	 */
	public String getName() {
		return "Prince Arthas";
	}
	
	/**
	 * !!!! Implements the method defined in Paladin interface.
	 * TODO: try to comment this method entirely. What do you notice?
	 */
	public void fightWithSword() {
		System.out.println(getName() + ": Fighting with sword!");
	}

	/**
	 * !!!! Implements the method defined in Wizard interface.
	 * TODO: try to comment this method entirely. What do you notice?
	 */
	public void castSpell() {
		System.out.println(getName() + ": Cast spell");
	}
}
