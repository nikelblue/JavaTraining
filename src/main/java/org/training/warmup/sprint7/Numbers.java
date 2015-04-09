/**
 * 
 */
package org.training.warmup.sprint7;

/**
 * @author monkey
 *
 */
public class Numbers {
	
	public static int sumIntegers(String ... s) throws NumberFormatException {
		
		int sumInt = 0;

		for(int i=0; i<s.length; i++) {
			int number = Integer.valueOf(s[i]);
			sumInt += number;
		}

		return sumInt;
	}

}
