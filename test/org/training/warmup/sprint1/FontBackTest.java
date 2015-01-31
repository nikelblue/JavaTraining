package org.training.warmup.sprint1;

import static org.junit.Assert.*;

import org.junit.Test;

public class FontBackTest {

	@Test
	public void testFrontBack() {
		assertEquals("Unexpected frontback of cupcake is eupcakec", "eupcakc", FrontBack.frontBack("cupcake") );
		assertEquals("Unexpected frontback of '' is ''", "", FrontBack.frontBack("") );
	}

}
