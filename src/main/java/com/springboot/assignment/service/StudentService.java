package com.springboot.assignment.service;

import com.springboot.assignment.domain.Student;

import java.util.List;

public interface StudentService {
    Student create(Student s);
    Student update(Student s);
    Student delete(Integer s);
    List<Student> index();
    public Student findById(Integer s);
}
