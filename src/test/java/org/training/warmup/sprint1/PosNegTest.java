package org.training.warmup.sprint1;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PosNegTest {

	@Test
	public void testPosNeg() {
		assertTrue("expected 1, -1, false is true", PosNeg.posNeg(1, -1, false));
		assertTrue("expected -1, 1, false is true", PosNeg.posNeg(-1, 1, false));
		assertTrue("expected -1, -1, true is true", PosNeg.posNeg(-1, -1, true));
	}
	
	@Test
	public void testNotPosNeg() {
		assertFalse("expected -1, -1, false is false", PosNeg.posNeg(-1, -1, false));
		assertFalse("expected 1, 1, true is false", PosNeg.posNeg(1, 1, true));
		assertFalse("expected 0, 0, true is false", PosNeg.posNeg(0, -0, true));
		
	}

}
