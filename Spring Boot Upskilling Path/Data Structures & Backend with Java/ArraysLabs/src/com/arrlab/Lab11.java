package com.arrlab;

//Java program to demonstrate
//cloning of multi-dimensional arrays

public class Lab11 {
	public static void main(String[] args) {
		int arr[][] = {{1,2,3},{4,5}};
		
		int cloneArr[][] = arr.clone();
		
		 // will print false
		System.out.println(arr == cloneArr);
		
		// will print true as shallow copy is created
        // i.e. sub-arrays are shared
		System.out.println(arr[0] == cloneArr[0]);
		System.out.println(arr[1] == cloneArr[1]);
	}
}
