package com.telusko.springwebex;


import com.telusko.springwebex.model.Student;
import com.telusko.springwebex.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService service;


    @RequestMapping("getStudents")
    public List<Student> getStudents()
    {
        return service.getStudents();
    }

}
