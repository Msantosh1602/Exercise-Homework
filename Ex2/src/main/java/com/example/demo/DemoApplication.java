package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	private EmployeeRepo employeeRepo;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception{
		employeeRepo.save(new Employee(null,"john marquee",5000,1000,500,200));
		employeeRepo.save(new Employee(null,"employee2",5000,1000,500,200));
		employeeRepo.save(new Employee(null,"employee3",5000,1000,500,200));
		employeeRepo.save(new Employee(null,"employee4",5000,1000,500,200));
		employeeRepo.save(new Employee(null,"employee5",5000,1000,500,200));
		employeeRepo.save(new Employee(null,"employee6",5000,1000,500,200));
		employeeRepo.save(new Employee(null,"employee7",5000,1000,500,200));
		employeeRepo.save(new Employee(null,"employee8",5000,1000,500,200));
		employeeRepo.save(new Employee(null,"employee9",5000,1000,500,200));
		employeeRepo.save(new Employee(null,"employee10",5000,1000,500,200));

	}
}
