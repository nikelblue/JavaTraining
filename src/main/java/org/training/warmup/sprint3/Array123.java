/**
 * 
 */
package org.training.warmup.sprint3;

/**
 * @author monkey
 *
 */
public class Array123 {

	
	/**
	 * Given an array of ints, return true if .. 1, 2, 3, .. appears in the array somewhere. 
	 * 
	 * @param nums
	 * @return
	 */
	public static boolean array123(int[] nums) {
		boolean is123 = false;
		
	    for(int i=0; i < nums.length-2; i++) {
	    	if( nums[i] == 1 && nums[i+1] == 2 && nums[i+2] ==3) {
	    		is123 = true;
	    		break;
	    	} 
	    }
	    
	    return is123;
	}


}
