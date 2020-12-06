package com.springboot.assignment.controller;

import com.springboot.assignment.domain.Student;
import com.springboot.assignment.service.StudentService;
import com.springboot.assignment.service.dto.CreateStudentRequest;
import com.springboot.assignment.service.dto.StudentResponse;
import com.springboot.assignment.service.dto.UpdateStudentRequest;
import com.springboot.assignment.service.transformer.CreateStudentTransform;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/create")
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public @ResponseBody StudentResponse Create(@RequestBody CreateStudentRequest createStudentRequest){
        Student student = CreateStudentTransform.createStudentRequestToDomain(createStudentRequest);
        Student studentResponse = studentService.create(student);
        return CreateStudentTransform.studentDomainToResponse(studentResponse);

    }
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    @RequestMapping("/getAll")
    public @ResponseBody List<StudentResponse> Index(){

        List<Student> studentResponse = studentService.index();
        return CreateStudentTransform.studentDomainListToResponseList(studentResponse);

    }
    @RequestMapping("/delete/{id}")
    @DeleteMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody StudentResponse Delete(@PathVariable Integer id){
        Student studentResponse = studentService.delete(id);
        return CreateStudentTransform.studentDomainToResponse(studentResponse);

    }
    @RequestMapping("/update")
    @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public @ResponseBody StudentResponse Update(@RequestBody UpdateStudentRequest updateStudentRequest){
        Student student = CreateStudentTransform.updateStudentRequestToDomain(updateStudentRequest);
        Student studentResponse = studentService.update(student);
        return CreateStudentTransform.studentDomainToResponse(studentResponse);

    }

    @RequestMapping("/getById/{id}")
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public @ResponseBody StudentResponse getById(@PathVariable Integer id){
        Student studentResponse = studentService.findById(id);
        return CreateStudentTransform.studentDomainToResponse(studentResponse);

    }

}
