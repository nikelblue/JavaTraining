package org.training.warmup.sprint8;

import java.util.Comparator;

public class ReverseOrderComparator implements Comparator<String> {
	public int compare(String s1, String s2) {
    	//TODO: compare two strings and specify 
    //which one is greater that the other one
   	//for descending order
		if(s1 == s2)
			return 0; //[null, null]
		if(s2 == null)
			return 1; //we are sure here s1 is not null then [null, s1]
		if(s1 == null)
			return -1; //[null, s2]
		return s2.compareToIgnoreCase(s1);
		
	}
}


