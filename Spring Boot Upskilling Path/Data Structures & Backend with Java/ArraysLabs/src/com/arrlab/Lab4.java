package com.arrlab;
//Java program to illustrate creating
//an array of objects

class Student1{
	public String name;
	
	public Student1(String name) {
		super();
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}
	
}
public class Lab4 {
	public static void main(String[] args) {
		// declares an Array and initializing the
        // elements of the array
		 Student1[] myStudents = new Student1[] {
				 new Student1("Satish"),
				 new Student1("Test1"),
				 new Student1("Test2"),
				 new Student1("Test3"),
				 new Student1("Test4")
		 };
		 
		 // accessing the elements of the specified array
		 for(Student1 st: myStudents) {
			 System.out.println(st);
		 }
	}
}
