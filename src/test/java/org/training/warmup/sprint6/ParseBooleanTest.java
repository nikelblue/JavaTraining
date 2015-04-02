package org.training.warmup.sprint6;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ParseBooleanTest {

	@Test
	public void testParseBooleanIsTrue() {		
		assertTrue("String is expected as true", ParseBoolean.parseBoolean("true") );
		assertTrue("String is expected as true", ParseBoolean.parseBoolean("tRUe") );
		assertTrue("String is expected as true", ParseBoolean.parseBoolean("  tRUe   "));
	}
	
	@Test
	public void testParseBooleanIsFalse() {		
		assertFalse("String is Not expected as true", ParseBoolean.parseBoolean(null));
		assertFalse("String is Not expected as true", ParseBoolean.parseBoolean(""));
		assertFalse("String is Not expected as true", ParseBoolean.parseBoolean("abc"));
		assertFalse("String is Not expected as true", ParseBoolean.parseBoolean("not true"));
		
	}

}
