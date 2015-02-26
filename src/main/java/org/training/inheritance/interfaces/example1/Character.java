package org.training.inheritance.interfaces.example1;

/**
 * An interface doesn't provide any implementation. It is a particular case of 
 * abstract classes where all defined methods are abstract.
 * 
 * @author nikelblue
 *
 */
public interface Character {
	
	/**
	 * All methods in an interface are by default public and abstract.
	 * Therefore, the method bellow is a shorthand for:
	 *  
	 * abstract public int getName();
	 * 
	 * Same as for abstract classes, all implementors of this interface
	 * are forced to implement all the methods defined by it.
	 */
	String getName();
}
