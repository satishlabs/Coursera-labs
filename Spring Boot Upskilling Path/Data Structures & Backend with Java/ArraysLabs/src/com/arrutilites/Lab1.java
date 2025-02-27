package com.arrutilites;
//Java Program to Demonstrate Arrays Class
//Via asList() method

//Importing Arrays utility class
//from java.util package
import java.util.Arrays;

public class Lab1 {
	public static void main(String[] args) {
		// Get the Array
		int arr[] = {10,20,15,22,35};
		
        // To convert the elements as List
		System.out.println("Integer array as List: "+Arrays.asList(arr));
	}
}
