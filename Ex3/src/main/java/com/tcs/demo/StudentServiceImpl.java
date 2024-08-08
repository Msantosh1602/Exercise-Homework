package com.tcs.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

	@Override
	 public List<Students> getStudents() {
		List<Students> student = new ArrayList<>();
		student.add(new Students("Santosh Maddula", "Nageswara Rao", "16-02-1997",'M'));
		student.add(new Students("Chaitanya Athava", "Ramana Murthy Athava", "29-06-1997", 'M'));
		student.add(new Students("Meena Sarvani Kotamarthy","Hanumanlu Kotamarthy", "07-10-1996", 'F'));
		student.add(new Students("Sravani Morthala", "Seetha Reddy Morthala", "16-07-2000", 'F'));
		student.add(new Students("Pavan Myla", "Venkata Rao Myla", "12-06-1999", 'M'));
		
		return student;
	}

}
