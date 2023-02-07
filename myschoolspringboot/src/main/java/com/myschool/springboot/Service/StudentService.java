package com.myschool.springboot.Service;

import com.myschool.springboot.StudentRepository.StudentRepository;
import com.myschool.springboot.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    private StudentRepository repo;
    public String addStudent(Student student) {
        repo.save(student);
        return "student added";
    }

    public List<Student> getAllstudent() {
        return repo.findAll();
    }

    public <student> Student updateStudent(Student student) {
        Student student1 = new Student();
        Optional<Student> updateStudent = repo.findById(student.getRollnumber());
        if (updateStudent.isPresent()) {
            student1.setRollnumber(updateStudent.get().getRollnumber());
            student1.setName(updateStudent.get().getName());
            student1.setTotalmarks(updateStudent.get().getTotalmarks());
            student1.setEmail(updateStudent.get().getEmail());
            student1.setRoles(updateStudent.get().getRoles());
        } else {
            return new Student();

        }
        return repo.save(student);
    }


    public String deleteStudent(Integer student) {
        repo.deleteById(student);
        return "student deleted";
    }
}
