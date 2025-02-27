package com.arrlab;
//Java program to illustrate creating
//an array of objects

class Student{
	public int rollNo;
	public String name;
	
	public Student(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}
	
	
}
public class Lab3 {
	public static void main(String[] args) {
		 // declares an Array of Student
		Student[] arr;
		
		 // allocating memory for 5 objects of type Student.
		arr = new Student[5];
		
		   // initialize the elements of the array
		arr[0] = new Student(1, "Satish");
		arr[1] = new Student(2, "Test1");
		arr[2] = new Student(3, "Test2");
		arr[3] = new Student(4, "Test3");
		arr[4] = new Student(5, "Test4");
		
	    // accessing the elements of the specified array
		for(int i=0; i<arr.length; i++) {
			System.out.println("Element at "+i+ " : { "
						+arr[i].rollNo+" "
						+arr[i].name+" } "
					);
		}
		
	}
}
