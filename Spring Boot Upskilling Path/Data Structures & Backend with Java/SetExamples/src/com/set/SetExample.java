package com.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		set.add(100);
		set.add(200);
		set.add(300);
		set.add(400);
		set.add(500);
		
		System.out.println(set);
		
		Iterator<Integer> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
