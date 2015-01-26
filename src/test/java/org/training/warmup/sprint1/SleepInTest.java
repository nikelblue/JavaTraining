package org.training.warmup.sprint1;

import static org.junit.Assert.*;

import org.junit.Test;

public class SleepInTest {
	
	@Test
	public void testSleepIn() {
		assertTrue("expected sleep in if it is not a weekday or we are on vacation", SleepIn.sleepIn(false,false));
		assertTrue("expected sleep in if it is not a weekday or we are on vacation", SleepIn.sleepIn(false,true));
		assertTrue("expected sleep in if it is not a weekday or we are on vacation", SleepIn.sleepIn(true,true));
		
	}
	
	@Test
	public void testNotSleepIn() {
		assertFalse("expected Not sleep in if it is not a weekday or we are on vacation", SleepIn.sleepIn(true, false));
	}

}
