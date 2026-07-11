package com.ganesh.SpringSecurity;


import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String greet(HttpServletRequest request)
    {
        return "hellow to spring security project" + request.getSession().getId();
    }

}

