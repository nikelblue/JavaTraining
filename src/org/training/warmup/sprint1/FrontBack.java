/**
 * 
 */
package org.training.warmup.sprint1;

/**
 * @author jingjing
 *
 */
public class FrontBack {

	/**
	 * Given a string, return a new string where the first and last chars have been exchanged. 
	 * 
	 * 
	 * @param str
	 * @return
	 */
	
	public static String frontBack(String str) {
		
		int n = str.length();
		String frontBackStr = "";
		
		if(n>0) {
			frontBackStr = str.substring(n-1) + str.substring(1, n-1) + str.substring(0,n-(n-1));
		}
		return frontBackStr;
	}

}
