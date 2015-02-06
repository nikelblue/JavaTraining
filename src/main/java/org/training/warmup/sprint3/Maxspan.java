/**
 * 
 */
package org.training.warmup.sprint3;

/**
 * @author monkey
 *
 */
public class Maxspan {

	
	/**
	 * Consider the leftmost and righmost appearances of some value in an array. 
	 * We'll say that the "span" is the number of elements between the two inclusive. 
	 * A single value has a span of 1. Returns the largest span found in the given array. (Efficiency is not a priority.) 

	 * 
	 * @param nums
	 * @return
	 */
	public static int maxSpan(int[] nums) {
		int span = 0;
		int number = 0;
		int index = 0;
		
		if(nums.length == 1) {
			span = 1;
		}else {					
		for(int i=0; i<nums.length; i++) {
			int s = nums[i];			
			
			for(int j=i+1; j<nums.length; j++) {
				int l = nums[j];			
				
				if(l==s) {
					index = j + 1;
				}				
			}
			
			number = index - i;
			
			if(number > span) {
			    span = number;
			}
		  }
		}
		
		return span;
	}


}
