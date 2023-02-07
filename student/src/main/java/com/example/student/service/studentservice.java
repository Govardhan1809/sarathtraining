package com.example.student.service;

import com.example.student.model.student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class studentservice
{
    public List<student> addData() {

        List<student> studlist = new ArrayList<>();

        studlist.add(new student("govardhan",01,12));
        studlist.add(new student("Priyanka",02,12));
        studlist.add(new student("sree",03,12));

        return studlist;
    }

}
