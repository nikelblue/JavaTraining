package org.training.collections.maps.example02;

import java.util.HashMap;
import java.util.Map;

public class IterateByKeySet {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		
		map.put(Integer.valueOf(1), "String1");
		map.put(Integer.valueOf(2), "String2");
		map.put(Integer.valueOf(3), "String3");
		
		for(Integer key : map.keySet()) {
			//this is slower than iteration by entry set because at each iteration 
			//we attempt to find the value for the given key
			System.out.println(key + ":" + map.get(key));
		}
		
	}
}
