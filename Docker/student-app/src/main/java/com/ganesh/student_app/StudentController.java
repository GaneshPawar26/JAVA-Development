package com.ganesh.student_app;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {


    @GetMapping("/")
    public String hello()
    {
     return "hello student";
    }
}
