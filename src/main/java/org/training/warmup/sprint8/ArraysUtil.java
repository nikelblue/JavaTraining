/**
 * 
 */
package org.training.warmup.sprint8;

import java.util.Arrays;

/**
 * @author monkey
 *
 */
public class ArraysUtil {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String[] names = {"Angelina Jolie", "Leonardo DiCaprio", "Brad Pitt", "Silvester Stalone"};
		//sortNames(names);
		
		String[] letters = {"a","b", "c"};
		
		sortDescending(letters);
		
		//sortDescendingOddsFirst([0,1,2,3,4,5,6,7,8,9]) -> [9,7,5,3,1,8,6,4,2,0]
		
		Integer[] numbers = {0,1,2,3,4,5,6,7,8,9};
		
		sortDescendingOddsFirst(numbers);
		
		System.out.println("The sort descending odd first array:" + Arrays.toString(numbers));
		
	}
	
	
	public static void sortNames(String[] names) {
		
		System.out.print("Names: ");
		System.out.println(Arrays.toString(names));
		
		String[] sortedNames = Arrays.copyOf(names, names.length);
		
		System.out.print("Sorted names:");

		Arrays.sort(sortedNames);
		System.out.println(Arrays.toString(sortedNames));
		
		System.out.println("The initial names array was sorted:" + Arrays.equals(sortedNames, names));
		
		System.out.println("The new index of \"Brad Pitt\":" + Arrays.binarySearch(sortedNames, "Brad Pitt"));	

	}
	
	public static void sortDescending(String[] strings) {
		if(strings == null)
			return;
		
		/*
		 * if we compare two objects we can have three states:
			1) a < b
			2) a == b
			3) a > b
			
			compareTo method retirns an integer. The convention says that:
			1) if a < b then return a negative integer (usually -1)
			2) if a == b then return 0
			3) if a > b then return a positive integer (usually 1)
		 */
		Arrays.sort(strings, new ReverseOrderComparator());
		//System.out.println(Arrays.toString(strings));		
	}
	
	public static void sortDescendingOddsFirst(Integer[] strings) {
		if(strings == null)
			return;
		Arrays.sort(strings, new ReverseOrderOddsFirstComparator());
	}

}
