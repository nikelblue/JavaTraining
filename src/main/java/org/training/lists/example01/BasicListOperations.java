/**
 * 
 */
package org.training.lists.example01;

import java.util.ArrayList;
import java.util.List;

/**
 * @author nikelblue
 *
 */
public class BasicListOperations {
	public static void main(String[] args) {
		//Lists are indexed collections:
		// - elements can be accessed by an unique index
		// - the order of elements is predictable: the iteration ordering
		//   is the order in which elements were inserted into the list.
		//
		// Duplicate elements are allowed since they can be uniquely identified 
		// by their index.
		// 
		// Compared to arrays, lists size can be dynamically changed.
		
		//Lists initialization
		//
		//ArrayList is a common implementation of List.
		//Lists support generics
		//
		//This is an example of a lost of integers:
		List<Integer> integersList = new ArrayList<Integer>();
		//
		//This is an example of a lost of strings:
		List<String> stringsList = new ArrayList<String>();
		
		//ArrayList has a custom toString implementation. This is an advantage 
		//when compared to an array.
		//Initially both lists are empty. 
		printIntegersList(integersList);
		printStringsList(stringsList);
		
		//Let's append elements to lists:
		integersList.add(Integer.valueOf(5)); //size is dynamically changed
		integersList.add(Integer.valueOf(3));
		integersList.add(Integer.valueOf(4));
		integersList.add(Integer.valueOf(3)); //duplicates are allowed
		System.out.println();
		printIntegersList(integersList);
		
		stringsList.add("Brad Pitt");
		stringsList.add("Angelina Jolie");
		stringsList.add("Steven Segal");
		printStringsList(stringsList);
		
		
		//From now on let's play only with integer list. 
		System.out.println("\nInsert element 2 into list at index 1:");
		integersList.add(1, Integer.valueOf(2));
		printIntegersList(integersList);
		
		System.out.println("\nRemove element from list at index 1:");
		integersList.remove(1);
		printIntegersList(integersList);
		
		System.out.println("\nRemove first element which is equal to 3 (Integer#equals is used):");
		integersList.remove(Integer.valueOf(3));
		printIntegersList(integersList);
		
		System.out.println("\nChecks if the list contains the a given element (Integer#equals is used):");
		System.out.println("Integers list contains 2: " + integersList.contains(Integer.valueOf(2)));
		System.out.println("Integers list contains 3: " + integersList.contains(Integer.valueOf(3)));
		
		System.out.println("\nFind the index. If element does not exist then -1 is returned");
		System.out.println("First index of 3 is: " + integersList.indexOf(Integer.valueOf(3)));
		System.out.println("First index of 6 is: " + integersList.indexOf(Integer.valueOf(6))); //does not exist
		
		System.out.println("\nGet element at given index");
		System.out.println("Element at index 2 is: " + integersList.get(2));
		try{
			System.out.println("Element at index 7 is: " + integersList.get(7)); //ups
		} catch(IndexOutOfBoundsException e) {
			System.out.flush(); //ignore this line
			e.printStackTrace();
			System.err.flush(); //ignore this line
		}
		
		System.out.println("\nRemove (clear) all elements from the list");
		integersList.clear();
		printIntegersList(integersList);
		
	}

	private static void printStringsList(List<String> stringsList) {
		System.out.print("Strings  list: " + stringsList);
		System.out.print("; isEmpty: " + stringsList.isEmpty());
		System.out.println("; size: " + stringsList.size());
	}

	private static void printIntegersList(List<Integer> integersList) {
		System.out.print("Integers list: " + integersList);
		System.out.print("; isEmpty: " + integersList.isEmpty()); //check if list is empty
		System.out.println("; size: " + integersList.size()); //check the current size of the list
	}
	
	
}
