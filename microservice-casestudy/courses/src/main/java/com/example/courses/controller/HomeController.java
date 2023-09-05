package com.example.courses.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.courses.model.Courses;
import com.example.courses.repository.CourseRepositry;

@RestController
@RequestMapping("/home")
public class HomeController {
	@Autowired
	CourseRepositry repositry;
	@GetMapping
	public String sayHi() {
		return "Hello  Neha";
	}
	@GetMapping("/course")
	public List<Courses> getStudents(){
		List<Courses> studlist=repositry.findAll();
		return studlist;
		
	}
	@GetMapping("/course/find/{id}")
	public Courses getStudentById(@PathVariable("id") int id) {
		Optional<Courses> st=repositry.findById(id);
		if(st.isPresent()) {
			return st.get();
		}else {
			return null;
		}
	}
}
