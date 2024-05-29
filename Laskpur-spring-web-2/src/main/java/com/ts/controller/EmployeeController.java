package com.ts.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ts.model.Employee;

@RestController
public class EmployeeController {
	@GetMapping("emp-msg")
	public String msg() {
		return "Hello Employee";
	}		
	
	@GetMapping("/get-emp")
	public Employee getEmployee(@RequestParam("empId")int empid) {
		Employee e1 = new Employee(1, "Vinod", "IT", 10000);
		Employee e2 = new Employee(1, "Don", "Faltu", 10000);
		Employee e3 = new Employee(1, "Anarkali", "Gov.", 10000);
		Employee e4 = new Employee(1, "Aliya", "Movie", 10000);
		Employee e5 = new Employee(1, "Shiva", "Song", 10000);
	
//		List<Employee> employees = new ArrayList<Employee>();
//		
//		employees.add(e1);
//		employees.add(e2);
//		employees.add(e3);
//		employees.add(e4);
//		employees.add(e5);
		
		List<Employee> employees = Arrays.asList(e1, e2, e3, e4, e5);
		
		Employee tempEmp = new Employee();
		for(Employee emp : employees) {
			if(emp.getId()== empid) {
				tempEmp = emp;
				break;
			}
		}
		return tempEmp;
		
		
	
	}
	
}
