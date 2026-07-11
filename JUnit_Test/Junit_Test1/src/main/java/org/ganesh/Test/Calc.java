package org.ganesh.Test;

public class Calc
{

    public int mul(int n1,int n2)
    {
        return n1*n2;
    }

    public double circleArea(int r)
    {
        return 3.14*r*r;
    }

    public int[] marks()
    {
        int a[]=new int[4];
        for(int i=0;i<a.length;i++)
        {
            a[i]=i*2;
        }
        return a;

    }



}
