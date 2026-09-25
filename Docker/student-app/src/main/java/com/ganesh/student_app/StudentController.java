package com.ganesh.student_app;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {


    List<Student> l=new ArrayList<>();


    @GetMapping("/students")
    public List<Student> hello()
    {
        Student s1=new Student("Ganesh",23,2000);
        Student s2=new Student("Sham", 24,1000);

        l.add(s1);
        l.add(s2);
        return l;
    }
}
