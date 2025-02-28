package com.maps;

import java.util.TreeMap;

public class TreeMapExample {
	public static void main(String[] args) {
		TreeMap<String, Integer> numbers = new TreeMap<String, Integer>();
		numbers.put("One", 1);
		numbers.put("Two", 2);
		numbers.put("Three", 3);
		
		System.out.println(numbers);
		
		numbers.putIfAbsent("Three", 3);
		numbers.putIfAbsent("Four", 4);
		
		System.gc();
		
		System.out.println(numbers);
		System.out.println(numbers.keySet());
		System.out.println(numbers.values());
		System.out.println(numbers.entrySet());
	}
}
