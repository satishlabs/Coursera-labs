package com.satishlabs.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.satishlabs.beans.Student;

@RestController
public class StudentController {

	public static List<Student> students = new ArrayList<Student>();

	public StudentController() {
		students.add(new Student("King", "Kochhar"));
		students.add(new Student("Satish", "Prasad"));
		students.add(new Student("Sarah", "Bowling"));
		students.add(new Student("John", "Samith"));
		students.add(new Student("Kumar", "Kundan"));
	}
	
	//http://localhost:8090/students
	@GetMapping("/students")
	public List<Student> getStudents() {
		return students;
	}

	//http://localhost:8090/student/Satish/Prasad
	@GetMapping("/student/{firstName}/{lastName}")
	public Student getStudentPathVariable(@PathVariable("firstName") String firstName,
			@PathVariable("lastName") String lastName) {
		return new Student(firstName, lastName);
	}
	
	//http://localhost:8090/student/query?firstName=Satish&lastName=Prasad
	@GetMapping("student/query")
	public Student studentQueryParam(@RequestParam(name = "firstName") String firstName,
			@RequestParam(name = "lastName") String lastName) {
		return new Student(firstName, lastName);
	}
	
	//http://localhost:8090/student
	@PostMapping("/student")
	public void addStudent(@RequestBody Student student) {
		students.add(student);
	}
	
	//http://localhost:8090/student/Satish
	@PutMapping("/student/{firstName}")
	public void updateStudent(@PathVariable("firstName") String firstName, Student student) {
		for(Student stud : students) {
			if(stud.equals(firstName)) {
				stud.setFirstName(student.getFirstName());
				stud.setLastName(student.getLastName());
			}
		}
	}
	
	//http://localhost:8090/student/Satish
	@DeleteMapping("/student/{firstName}")
	public void deleteStudent(@PathVariable("firstName") String firstName) {
		for(Student stud: students) {
			if(stud.getFirstName().equals(firstName)) {
				students.remove(stud);
			}
		}
	}

}
