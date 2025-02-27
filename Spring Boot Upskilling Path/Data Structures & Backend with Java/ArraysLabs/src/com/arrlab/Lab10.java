package com.arrlab;

//Java Program to Multidimensional Array
//cloning of one-dimensional arrays

public class Lab10 {
	public static void main(String[] args) {
		int arr[] = {1, 2, 3};
		int cloneArr[] = arr.clone();
		
		 // will print false as shallow copy is created
		System.out.println(arr == cloneArr);
		
		for(int i =0; i< cloneArr.length; i++) {
			System.out.print(cloneArr[i]+" ");
		}
	}


	
}
