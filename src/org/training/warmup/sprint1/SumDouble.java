/**
 * 
 */
package org.training.warmup.sprint1;

/**
 * @author VictoriaJol
 *
 */
//TODO: class name should start with big letter (i.e. SumDouble)
public class SumDouble {

	
	/**
	 * Given two int values, return their sum.
	 * Unless the two values are the same, then return double their sum.
	 * 
	 * @param a
	 * @param b
	 * @return
	 *        sum of a and b
	 *        
	 */
	public static int sumDouble(int a, int b){
		int sum = a + b;
		
		if (a == b){
			sum *= 2;
		}
		
		return sum;
	}

}
