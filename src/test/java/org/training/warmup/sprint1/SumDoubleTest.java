package org.training.warmup.sprint1;

import static org.junit.Assert.*;

import org.junit.Test;

public class SumDoubleTest {

	@Test
	public void testSum() {
		assertEquals("Unexpected sum of 1 and 2", 3, SumDouble.sumDouble(1, 2) );
	}

	@Test
	public void testDoubleSum() {
		assertEquals("Unexpected sum of 1 and 1", 4, SumDouble.sumDouble(1, 1) );
	}

}
