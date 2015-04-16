package org.training.generics.example03;

import org.training.generics.example02.Box;

public class GenericMethodsTest {

	/**
	 * First we tell that our method will use the a generic type T 
	 * (private static <T>...)
	 * 
	 * Then we can make use of that generic type for declaring the arguments.
	 * (Box<T> box) 
	 * 
	 * @param box
	 */
	private static <T> void printBox(Box<T> box) {
		System.out.println("Boxed value: "  + box.getValue());
	}

	public static void main(String[] args) {
		Box<Integer> integerBox = new Box<Integer>(Integer.valueOf(10));
		Box<String> stringBox = new Box<String>("Monkey is more than most lovely");

		printBox(integerBox);
		printBox(stringBox);

	}
}
