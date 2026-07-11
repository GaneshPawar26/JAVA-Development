package org.ganesh;

public class Dev {

    Computer comp;
    public Dev()
    {
        System.out.println("Dev Constructor");
    }

    public Computer getComp() {
        return comp;
    }

    public void setComp(Computer comp) {
        this.comp = comp;
    }

    public void build()
    {
        System.out.println("We are building a project");
        comp.compile();

    }

}
