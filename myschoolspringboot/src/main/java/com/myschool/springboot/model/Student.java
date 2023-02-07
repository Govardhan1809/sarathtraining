package com.myschool.springboot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Student {

    @Id
    private int rollnumber;
    private String name;
    private double totalmarks;

    private String email;
    private String roles;


}
