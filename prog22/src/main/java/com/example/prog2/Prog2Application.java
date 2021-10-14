package com.example.prog2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.prog2.Employee;
import com.example.prog2.EmployeeRepository;

@SpringBootApplication
public class Prog2Application {

	public static void main(String[] args) {
		SpringApplication.run(Prog2Application.class, args);
	}
	
	
	@Autowired
	EmployeeService empservice;
	
	
	@Bean
	public CommandLineRunner run(EmployeeRepository repository) {
	    return (args) -> {
	        empservice.insertFourEmployees(repository);
	        System.out.println(repository.findAll());
	        System.out.println(empservice.findEmployeeByLNameContaining('G'));
	    };
	}


}
