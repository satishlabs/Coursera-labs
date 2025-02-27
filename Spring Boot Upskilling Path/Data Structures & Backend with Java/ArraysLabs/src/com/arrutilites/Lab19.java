package com.arrutilites;

import java.util.Arrays;
import java.util.Comparator;

class SortByRoll1 implements Comparator<Student>{
	 // Used for sorting in ascending order of
    // roll number
	
	@Override
	public int compare(Student s1, Student s2) {
		return s1.rollNo - s2.rollNo;
	}
	
}
public class Lab19 {
	public static void main(String[] args) {
		Student[] arr = {
				new Student(111, "bbb", "Bangalore"),
				new Student(131, "aaa", "Ranchi"),
				new Student(121, "ccc", "Delhi")
		};
		System.out.println("UnSorted::");
		for(int i=0; i<arr.length; i++)
			System.out.println(arr[i]);
		
		Arrays.sort(arr, new SortByRoll1());
		System.out.println("\nSorted By RollNo::");
		for(int i=0; i<arr.length; i++)
			System.out.println(arr[i]);
	}
}
