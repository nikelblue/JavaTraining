package org.training.warmup.sprint8;

import java.util.Comparator;

public class ReverseOrderComparator implements Comparator<String> {
	public int compare(String s1, String s2) {
    	//TODO: compare two strings and specify 
    //which one is greater that the other one
   	//for descending order
		return s2.compareToIgnoreCase(s1);
		
	}
}


