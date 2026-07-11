package com.ganesh.securityDemo;


import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/hello")
    public String hellogreet()
    {
        return "Hello";
    }


    @GetMapping("/user")
    @PreAuthorize("hasRole('USER')")
    public String userEndpoint()
    {
        return "hello user";
    }

    @GetMapping("/admin")
    @PreAuthorize("hasRole('ADMIN')")
    public String adminEndpoint()
    {
        return "hello ADMIN sir";
    }



}
