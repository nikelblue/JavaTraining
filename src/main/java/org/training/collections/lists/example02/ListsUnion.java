package org.training.collections.lists.example02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListsUnion {

	public static void main(String[] args) {
		//Another useful method of Arrays:
		List<String> list1 = Arrays.asList("A", "B", "C");
		List<String> list2 = Arrays.asList("B", "C", "D", "E", "F");
		List<String> union = new ArrayList<String>();
		
		System.out.println("List 1: " + list1);
		System.out.println("List 2: " + list2);
		System.out.println("Union : " + union);
		
		System.out.println("\nLets merge both lists into 'union' list");
		union.addAll(list1);
		union.addAll(list2);
		System.out.println("Union : " + union); //duplicates are allowed
	}
	

}
