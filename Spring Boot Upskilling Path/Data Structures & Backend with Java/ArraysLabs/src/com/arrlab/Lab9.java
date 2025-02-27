package com.arrlab;

//Java Program to Multidimensional Array

public class Lab9 {
	public static void main(String[] args) {
		int arr[] = m1();
		
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i]+ " ");
	}

	private static int[] m1() {
		// returning  array
		return new int[] {1,2,3};
	}
	

	
}
