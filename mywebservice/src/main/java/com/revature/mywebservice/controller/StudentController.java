package com.revature.mywebservice.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.mywebservice.entity.Student;

@RestController
public class StudentController {

	private List<Student> studentsList;

	public StudentController() {
		// TODO Auto-generated constructor stub
		List<Student> students = new ArrayList<Student>();
		students.add(new Student(100, "abc", "abc@gmail.com"));
		students.add(new Student(101, "xyz", "xyz@gmail.com"));
		students.add(new Student(102, "efg", "efg@gmail.com"));
		students.add(new Student(103, "mno", "mno@gmail.com"));
		students.add(new Student(104, "pqr", "pqr@gmail.com"));
		this.studentsList = students;
	}

	@GetMapping("/students")
	public List<Student> getStudents() {
		return this.studentsList;
	}

	@GetMapping("/students/{id}")
	public Student getStudentById(@PathVariable int id) {
		Student selectedStudent = null;
		for (Student student : studentsList) {
			if (student.getId() == id)
				selectedStudent = student;
		}
		return selectedStudent;
	}

	@PostMapping("/students")
	public int addStudent(@RequestBody Student student) {
		this.studentsList.add(student);
		return this.studentsList.size();
	}

	@PutMapping("/students/{id}")
	public int updateStudent(@PathVariable int id, @RequestBody Student updatedStudent) {
		int updateStatus = 0;
		for (Student student : studentsList) {
			if (student.getId() == id) {
				this.studentsList.remove(student);
				this.studentsList.add(updatedStudent);
				updateStatus = 1;
			}
		}
		return updateStatus;
	}

	@DeleteMapping("/students/{id}")
	public int deleteStudent(@PathVariable int id) {
		int deleteStatus = 0;
		for (Student student : studentsList) {
			if (student.getId() == id) {
				this.studentsList.remove(student);
				deleteStatus = 1;
			}
		}
		return deleteStatus;
	}

}
