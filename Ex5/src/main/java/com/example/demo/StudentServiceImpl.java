package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class StudentServiceImpl implements StudentService{
    private List<Student> students;
    public StudentServiceImpl(){
        students = new ArrayList<>();
        students.add(new Student("Santosh", 27, "Civil Engineering"));
        students.add(new Student("Jahnavi", 26, "MBBS"));
        students.add(new Student("Divya", 28, "Charted Accountant"));
    }

    @Override
    public Student getStudentByName(String name){
        for(Student student:students){
            if (student.getName().equalsIgnoreCase(name)){
                return student;
            }
        }
        return null;
    }
}
