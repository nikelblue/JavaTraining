package org.training.warmup.sprint1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NotStringTest {

	@Test
	public void testNotString() {
		assertEquals("Expect Candy to be not Candy", "not Candy", NotString.notString("Candy"));
		assertEquals("Expect not bad to be not bad", "not bad", NotString.notString("not bad"));
	}

}
