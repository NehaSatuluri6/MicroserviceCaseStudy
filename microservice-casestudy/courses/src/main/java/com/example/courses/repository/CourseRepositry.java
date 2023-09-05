package com.example.courses.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.courses.model.Courses;

public interface CourseRepositry extends JpaRepository<Courses,Integer>{

}
