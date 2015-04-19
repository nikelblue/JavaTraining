package org.training.lists.example02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListsSymetricDifference {
	public static void main(String[] args) {

		//Another useful method of Arrays:
		List<String> list1 = Arrays.asList("A", "B", "C");
		List<String> list2 = Arrays.asList("B", "C", "D", "E", "F");
		List<String> symDifference = new ArrayList<String>();

		System.out.println("List 1      : " + list1);
		System.out.println("List 2      : " + list2);
		System.out.println("Symetric difference: " + symDifference);

		System.out.println("Lets keep only elements that exist only on list1 or only on list2");
		List<String> intersection = new ArrayList<String>();
		//union
		symDifference.addAll(list1);
		symDifference.addAll(list2);
		
		//intersection
		intersection.addAll(list1);
		intersection.retainAll(list2);
		
		//difference
		symDifference.removeAll(intersection);
		
		System.out.println("\nSymetric difference: " + symDifference); 
	}
}
