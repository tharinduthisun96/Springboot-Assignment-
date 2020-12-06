package com.springboot.assignment.service.base;
import com.springboot.assignment.domain.Student;
import com.springboot.assignment.repository.StudentRepository;
import com.springboot.assignment.service.StudentService;
import com.sun.xml.bind.v2.model.core.ID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Id;
import java.util.List;

@Service
public class StudentServiceBase implements StudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student create(Student s) {
        return studentRepository.save(s);
    }

    @Override
    public Student update(Student s) {
        Student student = studentRepository.findById(s.getId());
        student.setFirstName(s.getFirstName());
        student.setLastName(s.getLastName());
        student.setClassName(s.getClassName());
        student.setYearOfBirth(s.getYearOfBirth());

        return studentRepository.save(s);
    }

    @Override
    public Student delete(Integer s) {
        Student student = studentRepository.findById(s);
        studentRepository.delete(student);
        return student;
    }

    @Override
    public List<Student> index() {
        return studentRepository.findAll();
    }

    public Student findById(Integer s) {
        return studentRepository.findById(s);
    }
}
