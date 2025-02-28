package com.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Lab1 {
	public static void main(String[] args) {
		HashSet<String> s1 = new HashSet<String>();
		s1.add(null);
		s1.add("");
		System.out.println(s1);
		LinkedHashSet<String> s2 = new LinkedHashSet<String>();
		s2.add(null);
		System.out.println(s2);
		TreeSet<String> s3 = new TreeSet<String>();
		s3.add(null);
		System.out.println(s3);
	}
}
