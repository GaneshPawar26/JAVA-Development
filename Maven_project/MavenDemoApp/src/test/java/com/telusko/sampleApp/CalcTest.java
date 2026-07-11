package com.telusko.sampleApp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalcTest
{
    @Test
    void testCalc()
    {
        Calc c1=new Calc();
        int ans=c1.add(7,9);
        int expectedresult=16;

        assertEquals(expectedresult,ans);
    }

}
