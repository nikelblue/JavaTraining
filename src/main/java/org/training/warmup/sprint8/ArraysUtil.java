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
		Arrays.sort(strings, new ReverseOrderComparator());
		System.out.println(Arrays.toString(strings));
		
	}

}
