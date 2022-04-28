package com.anurag.junit.helper;

import java.util.Arrays;

import org.junit.Test;

public class ExceptionTest {
    @Test(expected = NullPointerException.class)
    public void testArraySort_RandomArray(){
        int []numbers = null;
        
        Arrays.sort(numbers);
    }
}
