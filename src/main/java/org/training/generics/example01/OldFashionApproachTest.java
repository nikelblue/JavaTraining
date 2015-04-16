package org.training.generics.example01;

/**
 * 
 * @author nikelblue
 *
 */
public class OldFashionApproachTest {
	
	
	private static void printIntegerBox(IntegerBox integerBox) {
		System.out.println("Integer Value: " + integerBox.getValue());
	}
	
	private static void printStringBox(StringBox stringBox) {
		System.out.println("String Value : " + stringBox.getValue());
	}
	
	public static void main(String[] args) {
		//We need sometimes to box immutable objects (Numbber, Long, String)
		//into another object.
		//
		//If we want to do so, using old fashion approach, we need to create
		//a "box" class for each object type we want to box.
		//
		//For simplicity we created one "box" for Integer and another one for String
		IntegerBox integerBox = new IntegerBox(Integer.valueOf(10));
		StringBox stringBox = new StringBox("Monkey is lovely");

		printIntegerBox(integerBox);
		//printInteger(stringBox); //compile error
		printStringBox(stringBox);

		
		//Now, think about the case when we want to box more types (10, 20, 100)
		//We will have a class explosion. Each time we want to box another type, 
		//we need to create another class and another method to handle it.
		//
		//Java offers an elegant method to solve this issue. Please proceed to 
		//org.training.generics.example02.GenericClassesTest
		//to see how to do it.
	}

}
