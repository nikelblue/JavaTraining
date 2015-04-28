package org.training.collections.lists.example03;

import java.util.Arrays;
import java.util.List;

public class IterationByIndex {

	public static void main(String[] args) {
		//Another way to initialize a list is to pass another list as argument to constructor.
		//All the given elements will be copied into this list.
		List<String> list = Arrays.asList("O","O","X","O","X");
		
		//iteration by index is used when we need to know the current index.
		for (int i = 0; i < list.size(); i++) {
			System.out.print("Element " + i + ": ");
			if(list.get(i).equalsIgnoreCase("X")) {
				System.out.println("checked");
			} else {
				System.out.println("unchecked");
			}
		}
	}
}
