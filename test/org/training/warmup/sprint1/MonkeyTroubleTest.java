/**
 * 
 */
package org.training.warmup.sprint1;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author nikelblue
 *
 */
public class MonkeyTroubleTest {

	@Test
	public void testInTrouble() {
		Assert.assertEquals("Expected being in trouble if both monkeys smile", 
				true, MonkeyTrouble.monkeyTrouble(true, true) );
		Assert.assertEquals("Expected being in trouble if no monkey smiles", 
				true, MonkeyTrouble.monkeyTrouble(false, false) );
	}

	@Test
	public void testNotInTrouble() {
		Assert.assertEquals("Expected not being in trouble if only one monkey smiles", 
				false, MonkeyTrouble.monkeyTrouble(true, false) );
		Assert.assertEquals("Expected not being in trouble if only one monkey smiles", 
				false, MonkeyTrouble.monkeyTrouble(false, true) );
	}

}
