/**
 * 
 */
package org.training.warmup.sprint6;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author monkey
 *
 */
public class IsHTMLTest {

	@Test
	public void testIsHTMLTrue() {
		assertTrue("String is expected to contain HTML tags", IsHTML.isHTML("<html></html>") );
		assertTrue("String is expected to contain HTML tags", IsHTML.isHTML("<html><head></head><body></body></html>") );
		assertTrue("String is expected to contain HTML tags", IsHTML.isHTML("    <html></html>") );
	}
	
	@Test
	public void testIsHTMLFalse() {		
		assertFalse("String is Not expected to contain HTML tags", IsHTML.isHTML(null));
		assertFalse("String is Not expected to contain HTML tags", IsHTML.isHTML("html"));
		assertFalse("String is Not expected to contain HTML tags", IsHTML.isHTML("<html><html>"));
		
	}

}
