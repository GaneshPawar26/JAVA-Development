package com.ganesh.demoSpringBootApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dev {

    @Autowired
    Laptop lap;

    public void build()
    {
        System.out.println("Developer build");
        lap.compile();
    }
}
