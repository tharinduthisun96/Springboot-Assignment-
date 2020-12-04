package com.springboot.assignment.service.transformer;

import com.springboot.assignment.domain.Student;
import com.springboot.assignment.service.dto.CreateStudentRequest;
import com.springboot.assignment.service.dto.StudentResponse;
import org.springframework.beans.BeanUtils;

public class CreateStudentTransform {
    public static Student createStudentRequestToDomain(CreateStudentRequest createStudentRequest){
        Student std = new Student();
        BeanUtils.copyProperties(createStudentRequest,std);
        return std;
    }
    public static StudentResponse studentDomainToResponse(Student std){
        StudentResponse stdr = new StudentResponse();
        BeanUtils.copyProperties(std,stdr);
        return stdr;
    }
}
