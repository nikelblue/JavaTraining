/**
 * 
 */
package org.training.warmup.sprint1;

/**
 * @author jingjing
 *
 */
public class MissingChar {

	/**
	 * Given a non-empty string and an int n, 
	 * return a new string where the char at index n has been removed. 
	 * The value of n will be a valid index of a char in the original string 
	 * (i.e. n will be in the range 0..str.length()-1 inclusive). 
	 * 
	 * String result = s.substring(0, n) + s.substring(n+1)
	 * 
	 * @param s
	 * @param i
	 * @return
	 */
	public static String missingChar(String s, int n) {
		String result = "";
		
		if(s.length() > 1 && n>=0 && n < s.length()) {
			for (int i = 0; i < s.length(); i++) {
				if(i != n) {
					 
					result += s.charAt(i);
				}
			}
		}
		
		return result;
	}

}
