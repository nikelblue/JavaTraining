/**
 * 
 */
package org.training.warmup.sprint6;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author monkey
 *
 */
public class ComputeInitialsTest {

	@Test
	public void test() {
		assertEquals("Unexpected initials.", "GCS", ComputeInitials.computeInitials("George C. Scott") );
		assertEquals("Unexpected initials.", "DDL", ComputeInitials.computeInitials("Daniel Day-Lewis") );
		assertEquals("Unexpected initials.", null, ComputeInitials.computeInitials(null) );
		assertEquals("Unexpected initials.", "", ComputeInitials.computeInitials("") );
		assertEquals("Unexpected initials.", "JN", ComputeInitials.computeInitials("Jack nicholson") );
		assertEquals("Unexpected initials.", "AH", ComputeInitials.computeInitials(" Anthony Hopkins ") );
	}

}
