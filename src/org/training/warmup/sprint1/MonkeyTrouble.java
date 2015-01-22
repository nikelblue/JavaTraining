/**
 * 
 */
package org.training.warmup.sprint1;

/**
 * @author VictoriaJol
 *
 */
public class MonkeyTrouble {

	/**
	 * We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling. 
	 * We are in trouble if they are both smiling or if neither of them is smiling.
	 *  
	 * @param aSmile <code>true</code> if first monkey smiles.
	 * @param bSmile <code>true</code> if second monkey smiles.
	 * @return
	 * 		Return true if we are in trouble.
	 */
	public static boolean monkeyTrouble(boolean aSmile, boolean bSmile)
	{
		return !(aSmile^bSmile);
	}
}
