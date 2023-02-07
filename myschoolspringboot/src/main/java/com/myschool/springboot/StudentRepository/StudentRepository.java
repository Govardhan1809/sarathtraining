package com.myschool.springboot.StudentRepository;

import com.myschool.springboot.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;


@NoRepositoryBean
public interface StudentRepository extends JpaRepository<Student,Integer> {
}
