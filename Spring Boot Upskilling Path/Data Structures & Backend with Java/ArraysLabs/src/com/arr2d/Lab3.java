package com.arr2d;
//Java Program to demonstrate the use of 
//Two Dimensional Array

public class Lab3 {
	public static void main(String[] args) {
	     int n=2;
	     int m=2;
	     
	     int[][] arr = new int[n][m];
	     
	     int it=1;
	     // Assigning the values to array
	     for(int i=0; i<n; i++) {
	    	 for(int j=0; j<m; j++) {
	    		 arr[i][j] = it;
	    		 it++;
	    	 }
	     }
	     
	     for(int i=0; i<n; i++) {
	    	 for(int j=0; j<m; j++)
	    		 System.out.print(arr[i][j]+" ");
	    	 System.out.println();
	     }		 
	     
	}
}
