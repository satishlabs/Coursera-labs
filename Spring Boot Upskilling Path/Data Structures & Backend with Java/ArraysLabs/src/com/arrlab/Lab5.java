package com.arrlab;

//Code for showing error "ArrayIndexOutOfBoundsException"

public class Lab5 {
	public static void main(String[] args) {
		int[] arr = new int[4];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		System.out.println("Trying to access element outside the size of array");
		System.out.println(arr[5]);
	}
}
