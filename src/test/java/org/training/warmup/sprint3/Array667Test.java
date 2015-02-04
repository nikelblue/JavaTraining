package org.training.warmup.sprint3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Array667Test {

	@Test
	public void testArray667() {
		int[] array1 = {6, 6, 2};
		int[] array2 = {6, 6, 2, 6,6};
		int[] array3 = {6, 7, 2, 6,6,7};
		
		assertEquals("expected array has 6,6 or 6,7 is 1", 1, Array667.array667(array1) );
		assertEquals("expected array has 6,6 or 6,7 is 2", 2, Array667.array667(array2) );
		assertEquals("expected array has 6,6 or 6,7 is 3", 3, Array667.array667(array3) );
			
	}
	
	

}
