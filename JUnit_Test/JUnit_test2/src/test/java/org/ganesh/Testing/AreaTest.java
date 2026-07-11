package org.ganesh.Testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AreaTest {

    Area a1 = new Area();

    @org.junit.jupiter.api.Test
    void sqrArea() {
        int actual = a1.sqrArea(10);
        int expected = 100;

        assertEquals(expected, actual);
    }

    @Test
    public void nameTest() {
        char c[] = new char[4];
        c[0] = 'a';
        c[1] = 'b';
        char n[] = a1.names(c);

        assertArrayEquals(n, c);

    }

    @Test
    void sortedArrayTest()
    {
        int k[]={8,3,0,2,6,4,7};
        a1.sortedArray(k);

        int a[]=null;
        try
        {
            a1.sortedArray(k);

        }
        catch(Exception e)
        {
            System.out.println("error is ->"+e);
        }
        assertThrows(NullPointerException.class,()->a1.sortedArray(a));

    }



}