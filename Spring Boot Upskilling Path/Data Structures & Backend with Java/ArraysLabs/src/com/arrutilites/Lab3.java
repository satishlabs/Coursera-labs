package com.arrutilites;

import java.util.Arrays;

//Arrays.binarySearch() method
public class Lab3 {
	public static void main(String[] args) {
		int arr[] = {10, 20, 15, 22, 35};
		
		Arrays.sort(arr);
		
		int key = 22;
		
		System.out.println(key+", found at index = "+Arrays.binarySearch(arr, 1, 3, key));
	}
}
