package com.arrutilites;

//Arrays.copyOf() method

import java.util.Arrays;

public class Lab12 {
	public static void main(String[] args) {
		int arr[] = {10, 20, 15, 22, 35};
		
		int key = 22;
		
		Arrays.fill(arr, key);
		
		System.out.println("Integer Array on filling: "+Arrays.toString(arr));
	}
}
