package com.anurag.junit.helper;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringHelperTest {
    @Test
    public void test(){
        StringHelper stringHelper = new StringHelper();

        // 1. AACD => CD 2. ACD => CD 3. CDEF => CDEF 4. CDAA => CDAA
        assertEquals("CD", stringHelper.turncateAInFirst2Positions("AACD"));
        assertEquals("CD", stringHelper.turncateAInFirst2Positions("ACD"));
        assertEquals("CDEF", stringHelper.turncateAInFirst2Positions("CDEF"));
        assertEquals("CDAA", stringHelper.turncateAInFirst2Positions("CDAA"));
    }
}
