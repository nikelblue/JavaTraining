/**
 * 
 */
package org.training.collections.maps.example01;

import java.util.HashMap;
import java.util.Map;

/**
 * @author nikelblue
 *
 */
public class BasicMapsOperations {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		System.out.println(map);
		map.put(Integer.valueOf(1), "String1");
		map.put(Integer.valueOf(2), "String2");
		map.put(Integer.valueOf(3), "String3");
		System.out.println(map);
		map.put(Integer.valueOf(1), "String1_again");
		System.out.println(map);
		
		System.out.println("The string for key 2 is: " + map.get(Integer.valueOf(2)));
		
		System.out.println("Key 3 exists: " + map.containsKey(Integer.valueOf(3)));
		System.out.println("Value 'String1' exists: " + map.containsValue("String1"));
		System.out.println("Value 'String1_again' exists: " + map.containsValue("String1_again"));
		
		map.remove(Integer.valueOf(1));
		System.out.println(map);
	}
}
