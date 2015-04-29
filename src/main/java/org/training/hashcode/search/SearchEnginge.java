package org.training.hashcode.search;

import java.util.Arrays;

public class SearchEnginge {
	private static final int NOT_FOUND = -1;
	
	public static void main(String[] args) {
		int[] unsortedArray = new int[]{4,5,2,3,8,6,1,7,0,9};
		int[] sortedArray = new int[]{0,1,2,3,4,5,6,7,8,9};
		
		simpleSearch(unsortedArray, 7);
		binarydSearch(unsortedArray, 7);
		
		System.out.println("<><><><><><><><><><>\n\n");
		
		simpleSearch(sortedArray, 7);
		binarydSearch(sortedArray, 7);
	}
	
	
	public static int simpleSearch(int[] array, int element) {
		System.out.println("SIMPLE SEARCH ALGORITHM");
		System.out.println("------------------------");
		System.out.println("Searching element " + element + " in array " + Arrays.toString(array));
		
		int counter = 0;
		int result = NOT_FOUND;
		try {
			for (int i = 0; i < array.length; i++) {
				counter++;
				if(array[i] == element) {
					result = i;
					break;
				}
			}
		} finally {
			System.out.println("Found element " + element + " at index " + result + " in " + counter + " iterations");
			System.out.println("========================");
			System.out.println();
		}
		return result;
	}
	
	/**
	 * <p>In computer science, a binary search or half-interval search algorithm 
	 * finds the position of a specified input value (the search "key") within 
	 * an array sorted by key value.[1][2] For binary search, the array should 
	 * be arranged in ascending or descending order. In each step, the algorithm 
	 * compares the search key value with the key value of the middle element of 
	 * the array. If the keys match, then a matching element has been found and 
	 * its index, or position, is returned. Otherwise, if the search key is less 
	 * than the middle element's key, then the algorithm repeats its action on 
	 * the sub-array to the left of the middle element or, if the search key is 
	 * greater, on the sub-array to the right. If the remaining array to be 
	 * searched is empty, then the key cannot be found in the array and a special 
	 * "not found" indication is returned.</p>
	 * 
	 * <p>A binary search halves the number of items to check with each iteration, 
	 * so locating an item (or determining its absence) takes logarithmic time.</p> 
	 * 
	 * <p>A binary search is a dichotomic divide and conquer search algorithm.</p>
	 * 
	 * @param array
	 * @param element
	 * @return
	 * @see {@linkplain http://en.wikipedia.org/wiki/Binary_search_algorithm}
	 */
	public static int binarydSearch(int[] array, int element) {
		System.out.println("BINARY SEARCH ALGORITHM");
		System.out.println("------------------------");
		System.out.println("Searching element " + element + " in array " + Arrays.toString(array));
		
		int counter = 0;
		int result = NOT_FOUND;
		try {
			int start = 0;
			int end = array.length - 1;
			for(;;) {
				counter++;
				int middle = (end + start) / 2;
				if(element == array[middle]){
					result = middle;
					break;
				} else if(element < array[middle]) {
					end = middle;
				} else {
					start = middle;
				}

				//If number of iterations is higher than the input array size
				//then something got wrong and we shall stop here otherwise
				//we risk to loop infinitely.
				if(counter > array.length) {
					System.out.println("Search algorithm FAILED. Is the input array sorted?");
					break;
				}
			}
		} finally {
			System.out.println("Found element " + element + " at index " + result + " in " + counter + " iterations");
			System.out.println("========================");
			System.out.println();
		}
		return result;
	}
}
