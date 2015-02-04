/**
 * 
 */
package org.training.warmup.sprint3;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * @author monkey
 *
 */
public class Array123Test {

	@Test
	public void testArray123() {
		int[] testArray={1, 1, 2, 3, 1};		
		int[] testArray1={1, 1, 2, 1, 2, 3};
		
		assertTrue("expected array has 1,2,3", Array123.array123(testArray));
		assertTrue("expected array has 1,2,3", Array123.array123(testArray1));
		
	}
	
	@Test
	public void testNotArray123() {
		int[] testArray2={1, 1, 2, 4, 1};
		
		assertFalse("Not expected array has 1,2,3", Array123.array123(testArray2));
	}

}
