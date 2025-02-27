package com.str;

public class Lab1 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello");
		sb.append(",World!");
		
		sb.insert(5, "Java");
		
		sb.delete(5, 10);
		
		System.out.println(sb);
	}
}
