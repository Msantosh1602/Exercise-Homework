package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepo empRepo;
    public Double computeNetSalary(String employeeName){
        Employee employee = empRepo.findByName(employeeName);
        if(employee==null){
            throw new RuntimeException("Employee not found");
        }
        double grossSalary = employee.getBasic() + employee.getHra() + employee.getDa();
        double tax = 0.15 * grossSalary;
        double netSalary = grossSalary - (tax + employee.getDeductions());

        return netSalary;
    }
}
