package com.fastndsteady.studentmanagementbackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fastndsteady.studentmanagementbackend.entity.Student;
import com.fastndsteady.studentmanagementbackend.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService studentService;

	@GetMapping("/students")
	public List<Student> getStudents() {
		return studentService.getStudents();
	}

}
