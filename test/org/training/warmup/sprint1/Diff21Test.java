package org.training.warmup.sprint1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Diff21Test {

	@Test
	public void testAbsoluteDifference() {
		assertEquals("Expected absolute difference between 20 and 21: 1", 1, Diff21.diff21(20) );
		assertEquals("Expected absolute difference between 21 and 21: 0", 0, Diff21.diff21(21) );
		assertEquals("Expected absolute difference between 0 and 21: 21", 21, Diff21.diff21(0) );
	}

	@Test
	public void testDoubleAbsoluteDifference() {
		assertEquals("Expected double absolute difference between 22 and 21: 2", 2, Diff21.diff21(22) );
	}
}
