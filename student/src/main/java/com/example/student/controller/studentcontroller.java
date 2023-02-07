package com.example.student.controller;

import com.example.student.model.student;
import com.example.student.service.studentservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/student")
public class studentcontroller {

        @Autowired
         studentservice service;

        List<student> studlist = null;
        public List<student> addData(){
        return service.addData();
    }

        @GetMapping("/all")
        public List<student> getallstudentdetails(){
        List<student> Studentlist = addData();
        return Studentlist;
    }

        @GetMapping("/student/{rollnumber}")
        public List<student> getallstudent(@PathVariable("rollnumber") int rollnumber){
        List<student> Studentlist = addData();
        return Studentlist.stream().filter(p->p.getRollnumber()==rollnumber).collect(Collectors.toList());

    }
}
