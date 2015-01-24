/**
 * 
 */
package org.training.warmup.sprint1;

/**
 * @author VictoriaJol
 *
 */
public class SleepIn {

	
	/**
	 * The parameter weekday is true if it is a weekday, and the paramter vacation is true
	 * if we are on vacation. We sleep in if it is not a weekday or we are on vacation.
	 * Return true if we sleep in.
	 * 
	 * @param weekday
	 * @param vacation
	 * @return
	 *       Return true if we sleep in
	 */
	public static boolean sleepIn(boolean weekday, boolean vacation){
		return !weekday || vacation;
	}

}
