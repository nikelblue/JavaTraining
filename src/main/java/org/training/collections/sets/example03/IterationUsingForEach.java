package org.training.collections.sets.example03;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IterationUsingForEach {

	public static void main(String[] args) {
		//Another way to initialize a set is to pass another collection as argument to constructor.
		//All the given elements will be copied into this set (duplicates are removed)
		Set<String> set = new HashSet<String>(Arrays.asList("H","e","l","l","o"," ","M","o","n","k","e","y"));
		
		//The most elegant way to iterate over a set if no additional
		//operation is required (remove).
		//
		//Please note that there are no duplicates anymore and iteration order 
		//is not preserved.
		for (String element : set) {
			System.out.print(element);
		}
	}
}
