package com.telusko.springwebex.service;

import com.telusko.springwebex.StudentRepo;
import com.telusko.springwebex.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepo repo;

    public void save(Student s) {
        repo.save(s);
    }

    public List<Student> getStudents() {
       return repo.findAll();
    }

}
