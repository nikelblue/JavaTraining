package org.training.inheritance.abstractclasses.example3;

/**
 * Abstract class can provide partial default implementation. Even so, it cannot
 * be instantiated because some methods are not implemented.
 *  
 * @author DanielB
 *
 */
public abstract class Animal {

	/**
	 * Abstract classes can declare fields
	 */
	private final String name;

	/**
	 * We force all subclasses to specify a name at initialization.
	 * @param name
	 */
	public Animal(String name) {
		this.name = name;
	}

	abstract public String getMovingWay();

	public void move() {
		System.out.println(getName() + ": I'm " + getMovingWay() + "!!!");
	}

	/**
	 * All animals will inherit this method.
	 * @return
	 * 		This animal's name
	 */
	public String getName() {
		return name;
	}
}
