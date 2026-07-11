package com.ganesh.myApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dev {

    @Autowired          //three types of autowiring-> construtor(no need to write Autowired),setter and field

    private Computer comp;

    public void build()
    {
        comp.compile();
        System.out.println("We are building a project");
    }

}
