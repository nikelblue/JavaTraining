package org.training.lists.example03;

import java.util.Arrays;
import java.util.List;

public class IterationUsingForEach {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("H","e","l","l","o"," ","M","o","n","k","e","y");
		
		//The most elegant way to iterate over an array if no additional
		//operation is required (identify index, remove)
		for (String element : list) {
			System.out.print(element);
		}
	}
}
