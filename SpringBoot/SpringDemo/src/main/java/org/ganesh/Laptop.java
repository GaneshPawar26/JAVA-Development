package org.ganesh;

public class Laptop implements Computer {

    public Laptop()
    {
        System.out.println("laptop constructor");
    }

    @Override
    public void compile()
    {
        System.out.println("Compiling through laptop ");
    }
}
