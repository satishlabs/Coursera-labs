package com.arrutilites;

//Arrays.copyOf() method

import java.util.Arrays;

public class Lab6 {
	public static void main(String[] args) {
		int arr[] = {10, 20, 15, 22, 35};
		
		System.out.println("Integer Array: "+ Arrays.toString(arr));
		
		System.out.println("\n New Arrays by copyOf:\n");
		
		System.out.println("Integer Array: "+Arrays.toString(Arrays.copyOf(arr, 10)));
	}
}
