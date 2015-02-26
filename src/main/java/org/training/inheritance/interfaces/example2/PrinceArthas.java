package org.training.inheritance.interfaces.example2;

/**
 * This class has to implement all the methods from all interfaces it implements, on all levels.
 * @author nikelblue
 *
 */
public class PrinceArthas implements Paladin {

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
		System.out.println(getName() + ": Fighting with sword");

	}

}
