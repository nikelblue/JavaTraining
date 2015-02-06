/**
 * 
 */
package org.training.warmup.sprint3;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author monkey
 *
 */
public class MaxspanTest {

	@Test
	public void test() {
		int[] array1 = {1, 2, 1, 1, 3};
		int[] array2 = {1, 1, 2, 1, 4, 1, 4};
		int[] array3 = {1};
		int[] array4 = {1, 4, 2, 1, 4, 1, 3, 4};
		
		assertEquals("The maxpan is", 4, Maxspan.maxSpan(array1) );
		assertEquals("The maxpan is", 6, Maxspan.maxSpan(array2) );
		assertEquals("The maxpan is", 1, Maxspan.maxSpan(array3) );
		assertEquals("The maxpan is", 7, Maxspan.maxSpan(array4) );
	}

}
