/**
 * 
 */
package org.training.generics.example02;

/**
 * @author nikelblue
 *
 */
public class GenericClassesTest {

	private static void printIntegerBox(Box<Integer> integerBox) {
		System.out.println("Integer Value: " + integerBox.getValue());
	}
	
	private static void printStringBox(Box<String> stringBox) {
		System.out.println("String Value: " + stringBox.getValue());
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Let's analyze a bit the class Box. Read it's code and documentation)
		//
		//Ok... Now since the generic class has been declared, let's see how do we use it.
		//
		//We want to box an Integer? just specify that the generic type is an Integer:
		Box<Integer> integerBox = new Box<Integer>(Integer.valueOf(10));
		
		//We want to box a String? just specify that the generic type is a String:
		Box<String> stringBox = new Box<String>("Monkey is the most lovely");
		
		printIntegerBox(integerBox);
		//printInteger(stringBox); //compile error
		printStringBox(stringBox);
		
		//Cool stuff. Instead of declaring a huge number of classes, we declare 
		//one only. And we can use it to box any kind of object. Very elegant.
		//
		//But Java help doesn't end here. Let's have a look at those two methods:
		//printInteger(Box<integer>)
		//printString(Box<String>)
		//
		//We still need to define a print method for each type we want to box.
		//Our initial issue seems to be only half fixed.
		//
		//We can notice that their definition is almost identical. 
		//They both accepts as argument Box object. I wonder if it possible to
		//declare one single method for all types we want box. 
		//
		//Please proceed to:
		//org.training.generics.example03.GenericMethodsTest
		
	}

}
