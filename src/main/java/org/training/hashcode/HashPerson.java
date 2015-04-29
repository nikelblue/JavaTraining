/**
 * 
 */
package org.training.hashcode;

/**
 * @author nikelblue
 *
 */
class HashPerson extends Person {
	
	public HashPerson(String name, int age) {
		super(name, age);
	}

	@Override
	public int hashCode() {
		//The equals method checks for both name and age. Therefore,
		//to obey the Object#hashCode() contract
		//we have to compute the hash code also on both fields: name and age.
		//@see the contract here:
		//http://docs.oracle.com/javase/7/docs/api/java/lang/Object.html#hashCode%28%29
		final int prime = 31;
		int result = 1;
		result = prime * result + ((age == null) ? 0 : age.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
}
