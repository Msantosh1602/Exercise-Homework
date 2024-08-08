package com.tcs.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/studentList")
	public List<Students> getStudents() {
		return studentService.getStudents();		
	}

}
