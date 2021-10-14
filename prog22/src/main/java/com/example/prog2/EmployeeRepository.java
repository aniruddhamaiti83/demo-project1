package com.example.prog2;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Integer>{
	
	//List<Employee> findEmployeeByLNameContaining(String str);

}
