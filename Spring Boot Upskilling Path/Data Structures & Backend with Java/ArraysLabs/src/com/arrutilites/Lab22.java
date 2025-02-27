package com.arrutilites;

//Arrays.copyOf() method

import java.util.Arrays;

public class Lab22 {
	public static void main(String[] args) {
		int arr[] = {10, 20, 15, 22, 35};
		
		Arrays.sort(arr);
		
		 // To compare both arrays
        System.out.println("Integer Array: "+ Arrays.stream(arr));
    
	}
}
