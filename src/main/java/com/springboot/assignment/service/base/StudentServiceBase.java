package com.springboot.assignment.service.base;
import com.springboot.assignment.domain.Student;
import com.springboot.assignment.repository.StudentRepository;
import com.springboot.assignment.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        return null;
    }

    @Override
    public Student delete(Student s) {
        return null;
    }

    @Override
    public Student index(Student s) {
        return null;
    }
}
