package com.example.prog2;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository repository;
	
	void insertFourEmployees(EmployeeRepository repository) {
	    repository.save(new Employee("Dalia", "Abo Sheasha"));
	    repository.save(new Employee("Trisha", "Gee"));
	    repository.save(new Employee("Helen", "Scott"));
	    repository.save(new Employee("Mala", "Gupta"));
	}
	
	List<Employee> findEmployeeByLNameContaining(char c)
	{
		List<Employee> emplist = new ArrayList<Employee>();
		List<Employee> emplistspace = new ArrayList<Employee>();
		
		emplist = (List<Employee>) repository.findAll();
		String lastname;
		
		for(Employee e: emplist)
		{
			lastname = e.getLname();
			for(int i=0; i<e.getLname().length(); i++)
			{
				if(lastname.charAt(i) == c)
				{
					emplistspace.add(e);
				}
					
			}
		}
		
		return emplistspace;
	}

}
