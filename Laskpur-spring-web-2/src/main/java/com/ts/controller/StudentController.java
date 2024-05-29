package com.ts.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ts.model.Student;

@RestController
public class StudentController {
	@GetMapping("/msg")
	 public String msg() {
		
		Student s = new Student(1, "Vinod", "Pune");
		System.out.println(s.getRollno());
		System.out.println(s.getName());
		System.out.println(s.getAddress());
		
		return "Hello" + s.getName();
	 }
}
