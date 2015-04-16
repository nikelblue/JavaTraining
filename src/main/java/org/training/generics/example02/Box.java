/**
 * 
 */
package org.training.generics.example02;

/**
 * Java lets us define a generic class that can actually box anything. As
 * developers we focus on the common operation we have to do with the boxed value
 * and we don't care about it's type. 
 * 
 * We tell to Box class that it will box any object of the generic type T 
 * (can be named A, B, Monkey, or whatever; we chosen T which stands for 'Type').
 * From now on, instead of using the real type on fields and methods declarations,
 * we use the generic type we just invented: T. 
 * 
 * 
 * @author nikelblue
 *
 */
public class Box<T> {
	//A field of generc type T
	private T value;
	
	/**
	 * Here we force the constructor to accept object only of the declared 
	 * generic type. Anything else will result in compile error.
	 * 
	 * @param value
	 */
	public Box(T value) {
		this.value = value;
	}

	/**
	 * 
	 * @return
	 * 		The boxed object of the declared generic type. 
	 * 		The caller will know for sure it will get exactly this type.
	 */
	public T getValue() {
		return value;
	}
}
