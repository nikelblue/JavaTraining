package org.training.lists.example02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListsIntersection {
	public static void main(String[] args) {
		//Another useful method of Arrays:
		List<String> list1 = Arrays.asList("A", "B", "C");
		List<String> list2 = Arrays.asList("B", "C", "D", "E", "F");
		List<String> intersection = new ArrayList<String>();
		
		System.out.println("List 1      : " + list1);
		System.out.println("List 2      : " + list2);
		System.out.println("Intersection: " + intersection);
		
		System.out.println("\nLets keep only the elements that exist on both lists:");
		intersection.addAll(list1);
		intersection.retainAll(list2);
		System.out.println("Intersection: " + intersection); 
	}
}
