/**
 * 
 */
package org.training.warmup.sprint7;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author monkey
 *
 */
public class NumbersTest {

	@Test
	public void sumIntegersTestSuccess() {
		assertEquals("Expected sum integer is", 1, Numbers.sumIntegers("2", "-4", "3"));
		assertEquals("Expected sum integer is", 2, Numbers.sumIntegers("2"));
		assertEquals("Expected sum integer is", 0, Numbers.sumIntegers());
	}
	
	@Test(expected = NumberFormatException.class)
	public void sumIntegersTestFail1() {
		Numbers.sumIntegers("a", "-4", "3");	
	}
	
	@Test(expected = NumberFormatException.class)
	public void sumIntegersTestFail2() {
		Numbers.sumIntegers("2.3");
	}
	
	@Test(expected = NumberFormatException.class)
	public void sumIntegersTestFail3() {
		Numbers.sumIntegers("keeee");
	}

}
