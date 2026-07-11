package org.ganesh.Test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class CalcTest {

    Calc c1=new Calc();

    @Test
    void test() {

        int actual=c1.mul(7,5);
        int expected=35;
        System.out.println("First junit test");
        assertEquals(expected, actual);
        assertEquals(0,c1.mul(0,8));
    }

    @Test
    void test2()
    {
        assertEquals(78.5,c1.circleArea(5),"Area doesnt matches");
    }

    @Test
    void test3()
    {
        assertFalse((5<2)?true:false); //opposite of assertTrue()
    }

    @Test
    void TestArray()
    {
        int b[]=new int[4];
        for(int i=0;i<b.length;i++)
        {
            b[i]=i*2;
        }

        assertArrayEquals(b,c1.marks());
    }


}