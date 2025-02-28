package com.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
	public static void main(String[] args) {
		HashSet<Integer> numbers = new HashSet<Integer>();
		numbers.add(100);
		numbers.add(200);
		numbers.add(300);
		numbers.add(400);
		numbers.add(500);
		
		System.out.println(numbers);
		
		Iterator<Integer> iterator = numbers.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println(numbers.remove(300));
		System.out.println(numbers.removeAll(numbers));
		
		HashSet<Integer> set1 = new HashSet<Integer>();
		set1.add(100);
		set1.add(200);
		set1.add(300);
		set1.add(400);
		
		HashSet<Integer> set2 = new HashSet<Integer>();
		set2.add(500);
		set2.add(600);
		set2.add(700);
		set2.add(800);

		/*
		 * set1.addAll(set2); System.out.println(set1); System.out.println(set2);
		 * 
		 * set1.retainAll(set2); System.out.println(set1);
		 */
		
		set1.removeAll(set2);
		System.out.println(set2);
	}
}
