package org.training.inheritance.overriding.example2;

public class Sum extends Operation {
	
	/**
	 * We override Operation#apply to return the sum of the input number 
	 * 
	 * Method signature remains unchanged, since return type does not influence 
	 * the signature
	 * 
	 * Also, the return type is a subclass of Number which is the return type of 
	 * the method from superclass
	 */
	@Override
	public Float apply(float a, float b) {
		return a + b;
	}
}
