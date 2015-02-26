package org.training.inheritance.overriding.example2;

public class Compare extends Operation {
	
	/**
	 * We override Operation#apply to compare two floats 
	 * 
	 * Method signature remains unchanged, since return type does not influence 
	 * the signature
	 * 
	 * Also, the return type is a subclass of Number which is the return type of 
	 * the method from superclass
	 * 
	 * @return
	 * 	- 0 if numbers are equal
	 *  - -1 if a < b
	 *  -  1 if a > b
	 */
	@Override
	public Integer apply(float a, float b) {
		if(a == b)
			return 0;
		if(a < b)
			return -1;
		return 1;
	}
}
