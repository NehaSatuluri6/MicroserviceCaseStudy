package com.example.springboot.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springboot.model.Student;

public interface StudentRepositry extends JpaRepository<Student,Integer> {

}
