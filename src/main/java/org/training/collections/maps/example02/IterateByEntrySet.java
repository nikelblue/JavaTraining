package org.training.collections.maps.example02;

import java.util.HashMap;
import java.util.Map;

public class IterateByEntrySet {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		
		map.put(Integer.valueOf(1), "String1");
		map.put(Integer.valueOf(2), "String2");
		map.put(Integer.valueOf(3), "String3");
		
		for(Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}
}
