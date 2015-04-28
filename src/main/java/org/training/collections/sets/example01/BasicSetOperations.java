/**
 * 
 */
package org.training.collections.sets.example01;

import java.util.HashSet;
import java.util.Set;

/**
 * @author nikelblue
 *
 */
public class BasicSetOperations {
	public static void main(String[] args) {
		//Sets are non indexed collections:
		// - the order of elements is not preserved during set modification.
		// - no duplicate elements are allowed (very useful).
		// - iteration by index is not possible.
		// - fast searching algorithms.
		
		// Compared to arrays, sets size can be dynamically changed.
		
		//Sets initialization
		//
		//HashSet is a common implementation of Set.
		//Sets support generics
		//
		//This is an example of a set of integers:
		Set<Integer> integersSet = new HashSet<Integer>();
		//
		//This is an example of a lost of strings:
		Set<String> stringsSet = new HashSet<String>();
		
		//HashSet has a custom toString implementation. This is an advantage 
		//when compared to an array.
		//Initially both sets are empty. 
		printIntegersSet(integersSet);
		printStringsSet(stringsSet);
		
		//Let's append elements to lists:
		integersSet.add(Integer.valueOf(5)); //size is dynamically changed
		integersSet.add(Integer.valueOf(3));
		integersSet.add(Integer.valueOf(4));
		integersSet.add(Integer.valueOf(3)); //duplicates are not allowed
		System.out.println();
		//Please note that the order we added elements might not be preserved
		printIntegersSet(integersSet);
		
		stringsSet.add("Brad Pitt");
		stringsSet.add("Angelina Jolie");
		stringsSet.add("Steven Segal");
		//Please note that the order we added elements might not be preserved
		printStringsSet(stringsSet);
		
		
		//From now on let's play only with integer list. 
		
		//All operations based on index are not available!!!
		//I will keep those examples from lists commented for comparison. 
		//Try to uncomment them and you will see compile errors.
		
//		System.out.println("\nInsert element 2 into list at index 1:");
//		integersSet.add(1, Integer.valueOf(2));
//		printIntegersSet(integersSet);
		
//		System.out.println("\nRemove element from list at index 1:");
//		integersSet.remove(1);
//		printIntegersSet(integersSet);
		
		System.out.println("\nRemove first element which is equal to 3 (Integer#equals is used):");
		integersSet.remove(Integer.valueOf(3));
		printIntegersSet(integersSet);
		
		System.out.println("\nChecks if the list contains the a given element (Integer#equals is used):");
		System.out.println("Integers list contains 2: " + integersSet.contains(Integer.valueOf(2)));
		System.out.println("Integers list contains 3: " + integersSet.contains(Integer.valueOf(3)));
		
//		System.out.println("\nFind the index. If element does not exist then -1 is returned");
//		System.out.println("First index of 3 is: " + integersSet.indexOf(Integer.valueOf(3)));
//		System.out.println("First index of 6 is: " + integersSet.indexOf(Integer.valueOf(6))); //does not exist
		
//		System.out.println("\nGet element at given index");
//		System.out.println("Element at index 2 is: " + integersSet.get(2));
//		try{
//			System.out.println("Element at index 7 is: " + integersSet.get(7)); //ups
//		} catch(IndexOutOfBoundsException e) {
//			System.out.flush(); //ignore this line
//			e.printStackTrace();
//			System.err.flush(); //ignore this line
//		}
		
		System.out.println("\nRemove (clear) all elements from the list");
		integersSet.clear();
		printIntegersSet(integersSet);
		
	}

	private static void printStringsSet(Set<String> stringsSet) {
		System.out.print("Strings  set: " + stringsSet);
		System.out.print("; isEmpty: " + stringsSet.isEmpty());
		System.out.println("; size: " + stringsSet.size());
	}

	private static void printIntegersSet(Set<Integer> integersSet) {
		System.out.print("Integers set: " + integersSet);
		System.out.print("; isEmpty: " + integersSet.isEmpty()); //check if list is empty
		System.out.println("; size: " + integersSet.size()); //check the current size of the list
	}
	
	
}
