package org.training.inheritance.abstractclasses.example1;

/**
 * An abstract class cannot be instantiated. 
 * @author DanielB
 *
 */
public abstract class Animal {
	
	/**
	 * Instead it can define abstract methods. An abstract method does not provide 
	 * any implementation. An abstract method only defines the method's signature.
	 * Therefore it's easy to understand why we cannot create 
	 * an instance of this class: because we don't have an implementation of it.
	 * 
	 * Declaring this method abstract, we force all subclasses to implement it. This
	 * is a nice way to push our design to all subclasses. 
	 */
	abstract public void move();
	
}