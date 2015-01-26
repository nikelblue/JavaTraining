package org.training.warmup.sprint1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NearHundredTest {

	@Test
	public void testNearHundred() {
		assertEquals("90 is expected near 100 ", true, NearHundred.nearHundred(90) );
		assertEquals("109 is expected near 100 ", true, NearHundred.nearHundred(109) );
		assertEquals("199 is expected near 200", true, NearHundred.nearHundred(199) );
		assertEquals("209 is expected near 200", true, NearHundred.nearHundred(209) );
	}
	
	@Test
	public void testNotNearHundred() {
		assertEquals("111 is not expected near 100 ", false, NearHundred.nearHundred(111) );
		assertEquals("89 is not expected near 100 ", false, NearHundred.nearHundred(89) );
		assertEquals("211 is not expected near 200", false, NearHundred.nearHundred(211) );
		assertEquals("189 is not expected near 200", false, NearHundred.nearHundred(189) );
	}

}
