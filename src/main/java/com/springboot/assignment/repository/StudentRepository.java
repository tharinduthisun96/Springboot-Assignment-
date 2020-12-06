package com.springboot.assignment.repository;

import com.springboot.assignment.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;

@Repository
public interface StudentRepository extends JpaRepository<Student, String> {
    Student deleteById(Integer s);
    Student findById(Integer s);
}
