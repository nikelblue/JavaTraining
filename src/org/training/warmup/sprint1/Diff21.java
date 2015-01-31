/**
 * 
 */
package org.training.warmup.sprint1;
import static java.lang.Math.*;

/**
 * @author VictoriaJol
 *
 */
public class Diff21 {

	/**
	 * Given an int n, return the absolute difference between n and 21,
	 * except return double the absolute difference if n is over 21.
	 * 
	 * @param n
	 * @return
	 *       return the absolute difference between n and 21
	 *       return double the absolute difference if n is over 21
	 */
	public static int diff21(int n) {
		int dif = Math.abs(n-21);

		if(n > 21) {
			dif *= 2;
		}
		
			return dif;
		
	}


}
