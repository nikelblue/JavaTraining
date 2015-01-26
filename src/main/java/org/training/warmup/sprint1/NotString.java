/**
 * 
 */
package org.training.warmup.sprint1;

/**
 * @author jingjing
 *
 */
public class NotString {

	
	/**
	 * Given a string, return a new string where "not " has been added to the front. 
	 * However, if the string already begins with "not", 
	 * return the string unchanged. Note: use .equals() to compare 2 strings.
	 * 
	 * @param str
	 * @return
	 */
	
	public static String notString(String str) {
		String result;
		if (str.startsWith("not")) {
			result = str;
		}
		else {
			result = "not " + str;
		}
		
		return result;
	}

}
