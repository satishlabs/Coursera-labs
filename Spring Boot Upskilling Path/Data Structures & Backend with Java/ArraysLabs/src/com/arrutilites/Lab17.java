package com.arrutilites;

//Arrays.copyOf() method

import java.util.Arrays;

public class Lab17 {
	public static void main(String[] args) {
		int arr[] = {10, 20, 15, 35, 22};
		
		Arrays.sort(arr,1,3);
		
		 // To compare both arrays
        System.out.println("Integer Array: "+ Arrays.toString(arr));
    
	}
}
