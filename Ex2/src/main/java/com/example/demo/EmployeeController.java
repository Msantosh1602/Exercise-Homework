package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/employee/net-salary")
    public String getNetSalary(@RequestParam String name){
        Double netSalary = employeeService.computeNetSalary(name);
        return "Net Salary of "+name+" is: "+netSalary;
    }
}
