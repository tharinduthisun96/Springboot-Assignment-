package com.springboot.assignment.service;

import com.springboot.assignment.domain.Student;

public interface StudentService {
    Student create(Student s);
    Student update(Student s);
    Student delete(Student s);
    Student index(Student s);
}
