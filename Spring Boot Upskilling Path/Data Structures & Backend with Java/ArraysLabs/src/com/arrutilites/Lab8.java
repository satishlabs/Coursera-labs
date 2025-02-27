package com.arrutilites;

//Arrays.copyOf() method

import java.util.Arrays;

public class Lab8 {
	public static void main(String[] args) {
		int arr[] = {10, 20, 15, 22, 35};
		
		System.out.println("Integer Array: "+ Arrays.toString(arr));
		
		System.out.println("\n New Arrays by copyOfRange:\n");
		
		System.out.println("Integer Array: "+Arrays.toString(Arrays.copyOfRange(arr, 1, 3)));
	}
}
