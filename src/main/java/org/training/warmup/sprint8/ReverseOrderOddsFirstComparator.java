/**
 * 
 */
package org.training.warmup.sprint8;

import java.util.Comparator;

/**
 * @author monkey
 *
 */
public class ReverseOrderOddsFirstComparator implements Comparator<Integer> {
	
    public int compare(Integer n1, Integer n2) {
        //TODO: compare two Integers and specify
        //which one is greater that the other one
        //for descending order. 

        //Hint: Odd number is always greater than even one
        //see Integer#intValue() to extract primitive int 
        //from Integer
    	if( n2==n1 ) //if both null or both same isntance
    	    return 0;
    	if(n2 == null)
			return 1; //for sure n1 not null
		if(n1 == null)
			return -1;  //for sure n2 not null
    	
		//for sure n1 and n2 not null
    	int num1 = n1.intValue();
    	int num2 = n2.intValue();
    	
    	
    	boolean isN1Odd = isOdd(num1); //optimization: call isOdd as less as possible
		boolean isN2Odd = isOdd(num2);
		//if both numbers are of same category
		if( (isN1Odd && isN2Odd) || (!isN1Odd && !isN2Odd)) 
    		return num2 - num1;
		
		//for sure they are different categories
    	return isN2Odd ? 1 : -1; 
    	
    }

   private boolean isOdd(int n) {
         return (n & 1) != 0;
   }
   
   public static void main(String[] args) {
	   ReverseOrderOddsFirstComparator c = new ReverseOrderOddsFirstComparator();
	   c.compare(Integer.valueOf(3), Integer.valueOf(5));
   }
}