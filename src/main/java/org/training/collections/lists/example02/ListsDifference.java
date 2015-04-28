package org.training.collections.lists.example02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListsDifference {
	public static void main(String[] args) {

		//Another useful method of Arrays:
		List<String> list1 = Arrays.asList("A", "B", "C");
		List<String> list2 = Arrays.asList("B", "C", "D", "E", "F");
		List<String> difference = new ArrayList<String>();

		System.out.println("List 1      : " + list1);
		System.out.println("List 2      : " + list2);
		System.out.println("Difference: " + difference);

		System.out.println("Lets keep only elements that exist only on list2 and don't exist in list1");
		difference.addAll(list2);
		difference.removeAll(list1);
		System.out.println("\nDifference: " + difference); 
	}
}
