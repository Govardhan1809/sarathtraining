package com.myschool.springboot.controller;


import com.myschool.springboot.Service.StudentService;
import com.myschool.springboot.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
     private StudentService service;


    @PostMapping("/addstudent")
    public String addStudent(@RequestBody Student student)
    {
        return service.addStudent(student);
    }
    @GetMapping("/getstudent")
    public List<Student> getAllStudent()
    {return service.getAllstudent();}

    @PutMapping("/updatestudent")
    public Student updateStudent(@RequestBody Student student){
        return service.updateStudent(student);
    }
    @DeleteMapping("/deletestudent" )
    public String deleteStudent(@RequestBody Integer student)
    {
        return service.deleteStudent(student);
    }







}
