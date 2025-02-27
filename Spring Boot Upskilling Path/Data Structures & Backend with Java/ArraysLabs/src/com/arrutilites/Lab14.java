package com.arrutilites;

//Arrays.copyOf() method

import java.util.Arrays;

public class Lab14 {
	public static void main(String[] args) {
		int arr[] = {10, 20, 15, 22, 35};
		
		int arr1[] = {10, 15, 22};
		
		 // To compare both arrays
        System.out.println("The element mismatched at index: "+ Arrays.mismatch(arr, arr1));
    
	}
}
