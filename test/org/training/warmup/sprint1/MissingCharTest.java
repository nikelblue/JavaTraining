package org.training.warmup.sprint1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MissingCharTest {

	@Test
	public void testMissingChar() {
		assertEquals("Expected missing 1 of kitten is ktten","ktten", MissingChar.missingChar("kitten", 1) );
		assertEquals("Expected missing 0 of kitten is ktten","itten", MissingChar.missingChar("kitten", 0) );
		assertEquals("Expected missing 4 of kitten is kittn","kittn", MissingChar.missingChar("kitten", 4) );
		assertEquals("Expected missing 4 of '' is ''","", MissingChar.missingChar("", 4) );
		assertEquals("Expected missing 6 of kitten is ''","", MissingChar.missingChar("kitten", 6) );
	}
	
}
