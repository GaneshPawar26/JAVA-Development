package com.ganesh.SpringBootMavenApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Hello Ganesh! My Spring Boot application is working.";
    }
}