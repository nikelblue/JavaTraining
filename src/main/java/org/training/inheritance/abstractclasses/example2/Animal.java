package org.training.inheritance.abstractclasses.example2;

/**
 * Abstract class can provide partial default implementation. Even so, it cannot
 * be instantiated because some methods are not implemented.
 *  
 * @author DanielB
 *
 */
public abstract class Animal {

	/**
	 * We force each subclass to specify how it moves
	 * @param name
	 */
	abstract public String getMovingWay();

	public void move() {
		//!!! Please note: within this method we can call abstract methods
		//At this point we don't care about implementation. Subclasses will 
		//be forced anyway to implement getMovingWay() method.
		//
		//The good thing here is we can implement an abstract logic, which
		//is common to all subclasses, and we pass the responsibility of
		//implementing specific logic to subclasses. We separate common logic 
		//from specific one, in order to avoid repeating common logic on all subclasses.
		//
		//Particularly: we try to avoid repeating the code bellow on each subclasses (Bird, Fish)
		//The only thing that changes from the output message is the name.
		System.out.println("I'm " + getMovingWay() + "!!!");
	}



}
