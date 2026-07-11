package com.ganesh.myApp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Laptop implements Computer{

    public void compile()
    {
        System.out.println("Yeah we are compiling the project currently through the laptop");
    }

}
