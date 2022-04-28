package com.anurag.junit.helper;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringHelperTest {

    StringHelper stringHelper = new StringHelper();

    @Test
    public void testTurncateAInFirst2Positions_AInFirst2Positions(){
        // 1. AACD => CD
        assertEquals("CD", stringHelper.turncateAInFirst2Positions("AACD"));
    }

    @Test
    public void testTurncateAInFirst2Positions_AInFirstPosition(){
        // 2. ACD => CD
        assertEquals("CD", stringHelper.turncateAInFirst2Positions("ACD"));
    }

    @Test
    public void testTurncateAInFirst2Positions_NoAInTheString(){
        // 3. CDEF => CDEF
        assertEquals("CDEF", stringHelper.turncateAInFirst2Positions("CDEF"));
    }

    @Test
    public void testTurncateAInFirst2Positions_AInLast2Positions(){
        // 4. CDAA => CDAA
        assertEquals("CDAA", stringHelper.turncateAInFirst2Positions("CDAA"));
    }
}
