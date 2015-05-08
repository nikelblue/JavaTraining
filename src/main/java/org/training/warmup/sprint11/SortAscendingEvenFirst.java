package org.training.warmup.sprint11;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class SortAscendingEvenFirst implements Comparator<Integer>{

	public static void main(String[] args) {
		Set<Integer> sortedNumber = new TreeSet<Integer>(new SortAscendingEvenFirst ());
		
		sortedNumber.add(Integer.valueOf(1));
		sortedNumber.add(Integer.valueOf(2));
		sortedNumber.add(Integer.valueOf(3));
		sortedNumber.add(Integer.valueOf(4));
		sortedNumber.add(Integer.valueOf(5));
		sortedNumber.add(Integer.valueOf(6));
		sortedNumber.add(Integer.valueOf(7));
		sortedNumber.add(Integer.valueOf(8));
		
		System.out.println(sortedNumber);

	}

	public int compare(Integer n1, Integer n2) {
        
    	if( n2==n1 ) //if both null or both same istance
    	    return 0;
    	if(n2 == null)
			return 1; //for sure n1 not null
		if(n1 == null)
			return -1;  //for sure n2 not null
    	
		//for sure n1 and n2 not null
    	int num1 = n1.intValue();
    	int num2 = n2.intValue();
    	
    	
    	boolean isN1Even = isEven(num1); //optimization: call isEven as less as possible
		boolean isN2Even = isEven(num2);
		//if both numbers are of same category
		if( (isN1Even && isN2Even) || (!isN1Even && !isN2Even)) 
    		return num1 - num2;
		
		//for sure they are different categories
    	return isN2Even ? 1 : -1; 
	}
	
	  private boolean isEven(int n) {
	         return n%2 == 0;
	   }

}
