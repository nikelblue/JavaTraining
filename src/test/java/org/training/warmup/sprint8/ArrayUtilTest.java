/**
 * 
 */
package org.training.warmup.sprint8;

import static org.junit.Assert.assertArrayEquals;

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
	
	/*
	 * sortDescendingOddsFirst(null) -> do nothing
		sortDescendingOddsFirst([]) -> do nothing
		sortDescendingOddsFirst([1,2,3]) -> [3,1,2]
		sortDescendingOddsFirst([0,1,2,3,4,5,6,7,8,9]) -> [9,7,5,3,1,8,6,4,2,0]
		sortDescendingOddsFirst([-2,-1,0,1]) -> [1,-1,0,-2]
	 */

	@Test
	public void testSortDescending1() {
		String[] expectedArray = {"c", "b", "a"};
		String[] actualArray = {"a","c","b"};
		
		ArraysUtil.sortDescending(actualArray);
		assertArrayEquals("Expected array to be sorted descending:", expectedArray, actualArray);
	}
	
	@Test
	public void testsortDescendingOddsFirst1() {
		Integer[] expectedArray = {3,1,2};
		Integer[] actualArray = {1,2,3};
		
		ArraysUtil.sortDescendingOddsFirst(actualArray);
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
	public void testsortDescendingOddsFirst2() {
		Integer[] expectedArray = {9,7,5,3,1,8,6,4,2,0};
		Integer[] actualArray = {0,1,2,3,4,5,6,7,8,9};
		
		ArraysUtil.sortDescendingOddsFirst(actualArray);
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
	public void testsortDescendingOddsFirst3() {
		Integer[] expectedArray = {};
		Integer[] actualArray = {};
		
		ArraysUtil.sortDescendingOddsFirst(actualArray);
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
	public void testsortDescendingOddsFirst4() {
		Integer[] expectedArray = {1,-1,0,-2};
		Integer[] actualArray = {-2,-1,0,1};
		
		ArraysUtil.sortDescendingOddsFirst(actualArray);
		assertArrayEquals("Expected array to be sorted descending:", expectedArray, actualArray);
	}
	
	@Test
	public void testSortDescending5() {
		String[] expectedArray = {null, null};
		String[] actualArray = {null, null};
		
		ArraysUtil.sortDescending(actualArray);
		assertArrayEquals("Expected array to be sorted descending:", expectedArray, actualArray);
	}
	
	@Test
	public void testsortDescendingOddsFirst5() {
		Integer[] expectedArray = {null, null};
		Integer[] actualArray = {null, null};
		
		ArraysUtil.sortDescendingOddsFirst(actualArray);
		assertArrayEquals("Expected array to be sorted descending:", expectedArray, actualArray);
	}
	
	
	
	@Test
	public void testSortDescending6() {
		String[] expectedArray = {null, "a"};
		String[] actualArray = {null, "a"};
		
		ArraysUtil.sortDescending(actualArray);
		assertArrayEquals("Expected array to be sorted descending:", expectedArray, actualArray);
	}
	
	@Test
	public void testsortDescendingOddsFirst6() {
		Integer[] expectedArray = {null,1};
		Integer[] actualArray = {1,null};
		
		ArraysUtil.sortDescendingOddsFirst(actualArray);
		assertArrayEquals("Expected array to be sorted descending:", expectedArray, actualArray);
	}
	
	@Test
	public void testSortDescending7() {
		String[] expectedArray = {null, "a"};
		String[] actualArray = {"a", null};
		
		ArraysUtil.sortDescending(actualArray);
		assertArrayEquals("Expected array to be sorted descending:", expectedArray, actualArray);
	}
	
	@Test
	public void testSortDescending8() {
		String[] expectedArray = null;
		String[] actualArray = null;
		
		ArraysUtil.sortDescending(actualArray);
		assertArrayEquals("Expected array to be sorted descending:", expectedArray, actualArray);
	}
	
	@Test
	public void testsortDescendingOddsFirst8() {
		Integer[] expectedArray = {null};
		Integer[] actualArray = {null};
		
		ArraysUtil.sortDescendingOddsFirst(actualArray);
		assertArrayEquals("Expected array to be sorted descending:", expectedArray, actualArray);
	}
}
