/**
 * 
 */
package org.training.warmup.sprint3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author monkey
 *
 */
public class MaxspanTest {
	private static Logger LOGGER = LoggerFactory.getLogger(MaxspanTest.class);

	private final int[] array1 = {1, 2, 1, 1, 3};
	private final int[] array2 = {1, 1, 2, 1, 4, 1, 4};
	private final int[] array3 = {1};
	private final int[] array4 = {1, 4, 2, 1, 4, 1, 3, 4};
	private final int[] array5 = {1, 1, 2, 3, 4, 5, 6, 7};
	private final int[] array6 = {};


	@Test
	public void testMaxSpan() {
		LOGGER.info("Performing test for maxSpan...");
		assertEquals("The maxpan is", 4, Maxspan.maxSpan(array1) );
		assertEquals("The maxpan is", 6, Maxspan.maxSpan(array2) );
		assertEquals("The maxpan is", 1, Maxspan.maxSpan(array3) );
		assertEquals("The maxpan is", 7, Maxspan.maxSpan(array4) );
		assertEquals("The maxpan is", 2, Maxspan.maxSpan(array5) );
		assertEquals("The maxpan is", 0, Maxspan.maxSpan(array6) );
	}

	@Test
	public void testMaxSpan2() {
		LOGGER.info("Performing test for maxSpan2...");
		assertEquals("The maxpan is", 4, Maxspan.maxSpan2(array1) );
		assertEquals("The maxpan is", 6, Maxspan.maxSpan2(array2) );
		assertEquals("The maxpan is", 1, Maxspan.maxSpan2(array3) );
		assertEquals("The maxpan is", 7, Maxspan.maxSpan2(array4) );
		assertEquals("The maxpan is", 2, Maxspan.maxSpan2(array5) );
		assertEquals("The maxpan is", 0, Maxspan.maxSpan2(array6) );
	}

}
