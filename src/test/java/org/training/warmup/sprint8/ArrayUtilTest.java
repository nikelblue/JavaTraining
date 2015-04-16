/**
 * 
 */
package org.training.warmup.sprint8;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author monkey
 *
 */
public class ArrayUtilTest {
	/*
	sortDescending(null) -> do nothing
	sortDescending("") -> ""
	sortDescending(["a"]) -> ["a"]
	sortDescending(["a","b", "c"]) -> ["c", "b", "a"]
	sortDescending(["a","b", "b"]) -> ["b", "b", "a"]
	 */

	@Test
	public void testSortDescending1() {
		String[] expectedArray = {"c", "b", "a"};
		String[] actualArray = {"a","c","b"};
		
		ArraysUtil.sortDescending(actualArray);
		assertArrayEquals("Expected array to be sorted descending:", expectedArray, actualArray);
	}
	
	@Test
	public void testSortDescending2() {
		String[] expectedArray = {"b", "b", "a"};
		String[] actualArray = {"a","b","b"};
		
		ArraysUtil.sortDescending(actualArray);
		assertArrayEquals("Expected array to be sorted descending:", expectedArray, actualArray);
	}
	
	@Test
	public void testSortDescending3() {
		String[] expectedArray = {""};
		String[] actualArray = {""};
		
		ArraysUtil.sortDescending(actualArray);
		assertArrayEquals("Expected array to be sorted descending:", expectedArray, actualArray);
	}
	
	@Test
	public void testSortDescending4() {
		String[] expectedArray = {"a"};
		String[] actualArray = {"a"};
		
		ArraysUtil.sortDescending(actualArray);
		assertArrayEquals("Expected array to be sorted descending:", expectedArray, actualArray);
	}
	
	@Test
	public void testSortDescending5() {
		String[] expectedArray = {null};
		String[] actualArray = {null};
		
		ArraysUtil.sortDescending(actualArray);
		assertArrayEquals("Expected array to be sorted descending:", expectedArray, actualArray);
	}
}
