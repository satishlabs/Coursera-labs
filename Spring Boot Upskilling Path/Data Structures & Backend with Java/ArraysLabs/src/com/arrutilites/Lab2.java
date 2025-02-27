package com.arrutilites;
//Java Program to Demonstrate Arrays Class
//Via binarySearch() method

//Importing Arrays utility class
//from java.util package
import java.util.Arrays;

public class Lab2 {
	public static void main(String[] args) {
		int arr[] = {10,20,15,22,35};
		
		Arrays.sort(arr);
		
		int key = 22;
		
		 // Print the key and corresponding index
		System.out.println(key+", found at index= "+Arrays.binarySearch(arr, key));
	}
}
