package org.training.lists.example03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterationUsingIterator {

	public static void main(String[] args) {
		//Another way to initialize a list is to pass another list as argument to constructor.
		//All the given elements will be copied into this list.
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(0, 1, 2, 3, 4, 5 ,6));
		System.out.println("Initial list: " + list);
		
		//This is an old fashion iteration. Still useful when we need to check 
		//on the fly the current element status and remove if necessary 
		//
		//Let's remove all odd numbers from the given array
		for (Iterator<Integer> iterator = list.iterator(); iterator.hasNext();) {
			Integer n = iterator.next();
			if(isOdd(n)) {
				iterator.remove();
				System.out.println("Removed odd number: " + n);
			}
			
			//This operation is not allowed !!! Only remove via iterator.
			//If you remove an element directly then the iterator becomes invalid 
			//and next time you try to access it, will result in: 
			//ConcurrentModificationException. Uncomment and test
			//list.remove(2); 
		}
		
		System.out.println("\nEven numbers list: " + list);
		
	}
	
	private static boolean isOdd(Integer n) {
		return (n.intValue() & 1) == 1;
	}

}
