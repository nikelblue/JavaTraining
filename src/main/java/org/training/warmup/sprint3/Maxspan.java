/**
 * 
 */
package org.training.warmup.sprint3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author monkey
 *
 */
public class Maxspan {
	private static Logger LOGGER = LoggerFactory.getLogger(Maxspan.class);
	
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
		
		int iterations = 0; //performance marker
		
		if(nums.length == 1) {
			span = 1;
		}else {					
		for(int i=0; i<nums.length; i++) {
			int s = nums[i];			
			
			for(int j=i+1; j<nums.length; j++) {
				iterations++; //performance marker
				
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
		LOGGER.debug("Number of iterations for maxSpan: " + iterations); //performance marker
		return span;
	}

	public static int maxSpan2(int[] nums) {
		int maxSpan = 0;
		
		int iterations = 0; //performance marker

		for (int leftIndex = 0; leftIndex < nums.length; leftIndex++) {
			int leftNum = nums[leftIndex];
			
			for (int rightIndex = nums.length - 1; rightIndex >= leftIndex ; rightIndex--) {
				iterations++; //performance marker
				
				int currentSpan = rightIndex - leftIndex + 1;
				
				//do not continue since currentSpan is decreasing
				//which means further values cannot be greater that maxSpan.
				if(currentSpan < maxSpan)
					break;

				int rightNum = nums[rightIndex];
				if(leftNum == rightNum) 
					maxSpan = currentSpan;
			}
		}
		
		LOGGER.debug("Number of iterations for maxSpan2: " + iterations); //performance marker
		return maxSpan;
	}

}
