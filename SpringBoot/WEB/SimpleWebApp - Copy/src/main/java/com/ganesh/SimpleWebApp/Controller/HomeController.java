package com.ganesh.SimpleWebApp.Controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping("/")
    public String greet()
    {
        return "WELCOME TO HOME PAGE";
    }

    @RequestMapping("/about")
    public String about()
    {
        return "This is about section of our website";
    }

}
