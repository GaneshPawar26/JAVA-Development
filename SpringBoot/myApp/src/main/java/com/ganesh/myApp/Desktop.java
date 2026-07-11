package com.ganesh.myApp;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer{

    public void compile()
    {
        System.out.println("We are compiling the project from the desktop");
    }
}

