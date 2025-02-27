package com.arrutilites;

import java.util.Arrays;

public class Lab5 {
	public static void main(String[] args) {
		int arr[] = {10, 20, 15, 22, 35};
		
		int arr1[] = {10, 15, 22};
		
		// To compare both arrays
		System.out.println("Integer Arrays on comparison: "+Arrays.compareUnsigned(arr, arr1));
	}
}
