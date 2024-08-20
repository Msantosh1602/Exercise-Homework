package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/{name}")
    public String getStudentDetails(@PathVariable String name){
        Student student = studentService.getStudentByName(name);
        if (student != null){
            return "Name: " + student.getName() + " Age: " + student.getAge() + " Course: " + student.getCourse();
        }else{
            return "Student details not found.";
        }
    }
}
