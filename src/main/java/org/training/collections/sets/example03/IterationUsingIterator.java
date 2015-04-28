package org.training.collections.sets.example03;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IterationUsingIterator {

	public static void main(String[] args) {
		//Another way to initialize a set is to pass another collection as argument to constructor.
		//All the given elements will be copied into this set (duplicates are removed)
		Set<Integer> set = new HashSet<Integer>(Arrays.asList(6, 0, 2, 2, 3, 4, 3, 5 ,1));

		//Please note that there are no duplicates anymore and iteration order 
		//is not preserved.
		System.out.println("Initial set: " + set);

		//This is an old fashion iteration. Still useful when we need to check 
		//on the fly the current element status and remove if necessary 
		//
		//Let's remove all odd numbers from the given set
		for (Iterator<Integer> iterator = set.iterator(); iterator.hasNext();) {
			Integer n = iterator.next();
			if(isOdd(n)) {
				iterator.remove();
				System.out.println("Removed odd number: " + n);
			}
			
			//This operation is not allowed !!! Only remove via iterator.
			//If you remove an element directly then the iterator becomes invalid 
			//and next time you try to access it, will result in: 
			//ConcurrentModificationException. Uncomment and test
			//set.remove(2); 
		}
		
		System.out.println("\nEven numbers list: " + set);
		
	}
	
	private static boolean isOdd(Integer n) {
		return (n.intValue() & 1) == 1;
	}

}
