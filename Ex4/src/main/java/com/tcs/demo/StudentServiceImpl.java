package com.tcs.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepo studentRepo;
	@Override
	 public List<Students> getStudents() {
		return studentRepo.findAll();
	}

}
