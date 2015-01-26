package org.training.warmup.sprint1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Makes10Test {

	@Test
	public void testMakes10() {
		assertEquals("10 and 7 are expected make 10", true, Makes10.makes10(10, 7) );
		assertEquals("4 and 10 are expected make 10", true, Makes10.makes10(4, 10) );
		assertEquals("3 and 7 are expected make 10", true, Makes10.makes10(3,7) );
	}
	
	@Test
	public void testNotMakes10() {
		assertEquals("7 and 7 are not expected to make 10", false, Makes10.makes10(7, 7) );
	}

}
