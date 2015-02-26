package org.training.inheritance.abstractclasses.example3;

/**
 * All animals 
 * @author DanielB
 *
 */
public class Bird extends Animal {

	public Bird() {
		//calls Animal(String name)
		super("Bird");
	}

	@Override
	public String getMovingWay() {
		return "flying";
	}

}
