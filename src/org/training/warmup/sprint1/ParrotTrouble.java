/**
 * 
 */
package org.training.warmup.sprint1;

/**
 * @author VictoriaJol
 *
 */

public class ParrotTrouble {

	/**
	 * We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23. 
	 * We are in trouble if the parrot is talking and the hour is before 7 or after 20. 
	 * Return true if we are in trouble.
	 * 
	 * @param talking <code>true</code> if parrot is talking.
	 * @param hour <code>0..23</code> current hour time.
	 * @return
	 * 		Return true if we are in trouble.
	 */

	public static boolean parrotTrouble(boolean talking, int hour) {
		
		return  talking && (hour < 7 || hour > 20);
	}
	
      
}
