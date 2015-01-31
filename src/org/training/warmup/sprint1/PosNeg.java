/**
 * 
 */
package org.training.warmup.sprint1;

/**
 * @author jingjing
 *
 */
public class PosNeg {
	
	/**
	 * Given 2 int values, return true if one is negative and one is positive. 
	 * Except if the parameter "negative" is true, then return true only if both are negative. 
	 * @param a
	 * @param b
	 * @param negative
	 * @return
	 */
	public static boolean posNeg(int a, int b, boolean negative) {
		boolean result = false;
		
		if(a < 0 && b < 0 && negative == true) {
			result = true;
		}
		else if(a < 0 && b >= 0 ) {
			result = true;
		}
		else if(a >= 0 && b < 0) {
			result = true;
		}
		
		
		return result;
	}

}
