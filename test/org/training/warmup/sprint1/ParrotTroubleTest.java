package org.training.warmup.sprint1;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ParrotTroubleTest {

	@Test
	public void testParrotTrouble() {
		assertTrue("Expected being in trouble", ParrotTrouble.parrotTrouble(true, 6));
		assertTrue("Expected being in trouble", ParrotTrouble.parrotTrouble(true, 21));
	}
	
	@Test
	public void testParrotNotTrouble(){
		assertFalse("Expected Not being in trouble", ParrotTrouble.parrotTrouble(true, 7));
		assertFalse("Expected Not being in trouble", ParrotTrouble.parrotTrouble(true, 20));
		assertFalse("Expected Not being in trouble", ParrotTrouble.parrotTrouble(false, 9));
	}

}
