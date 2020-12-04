package com.springboot.assignment.controller;

import com.springboot.assignment.domain.Student;
import com.springboot.assignment.service.StudentService;
import com.springboot.assignment.service.dto.CreateStudentRequest;
import com.springboot.assignment.service.dto.StudentResponse;
import com.springboot.assignment.service.transformer.CreateStudentTransform;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/student")
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public @ResponseBody StudentResponse Create(@RequestBody CreateStudentRequest createStudentRequest){
        Student student = CreateStudentTransform.createStudentRequestToDomain(createStudentRequest);
        Student studentResponse = studentService.create(student);
        return CreateStudentTransform.studentDomainToResponse(studentResponse);




    }
    @RequestMapping("/index")
    public String Index(){

        return "Student";

    }
    @RequestMapping("/delete")
    public String Delete(){

        return "Student";

    }
    @RequestMapping("/update")
    public String Update(){

        return "Student";

    }

}
