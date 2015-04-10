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
		assertEquals("Unexpected sum integer :", 1, Numbers.sumIntegers("2", "-4", "3"));
		assertEquals("Unexpected sum integer :", 2, Numbers.sumIntegers("2"));
		assertEquals("Unexpected sum integer :", 0, Numbers.sumIntegers());
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
	
	
	@Test
	public void sumFloatsTestSuccess() {
		assertEquals("Unexpected sum float :", 0f, Numbers.sumFloats(),0.01);
		assertEquals("Unexpected sum float :", 2.3f, Numbers.sumFloats("2.3"),0.01);
		assertEquals("Unexpected sum float :", 13.3f, Numbers.sumFloats("2.3", "1.1e+1", "0"),0.01);
	}
	
	@Test(expected = NumberFormatException.class)
	public void sumFloatsTestFail1() {
		Numbers.sumFloats("o,2");	
	}
	
	@Test
	public void compareIntTest() {
		assertEquals("Unexpected comparison result : ", "1 is less than 2", Numbers.compareInt(1,2));
		assertEquals("Unexpected comparison result : ", "1 is equal to 1", Numbers.compareInt(1,1));
		assertEquals("Unexpected comparison result : ", "1 is greater than 0", Numbers.compareInt(1,0));
	}

}
