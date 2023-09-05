package com.example.springboot.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.model.Student;
import com.example.springboot.repositary.StudentRepositry;

@RestController
@RequestMapping("/home")
public class HomeController {
	@Autowired
	StudentRepositry repositry;
	@GetMapping
	public String sayHi() {
		return "Hello  Neha";
	}
	@GetMapping("/student")
	public List<Student> getStudents(){
		List<Student> studlist=repositry.findAll();
		return studlist;
		
	}
	@GetMapping("/student/find/{id}")
	public Student getStudentById(@PathVariable("id") int id) {
		Optional<Student> st=repositry.findById(id);
		if(st.isPresent()) {
			return st.get();
		}else {
			return null;
		}
	}
}
