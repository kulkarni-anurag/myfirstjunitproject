package com.anurag.junit.helper;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;

import org.junit.Test;

public class CompareArraysTest {

    @Test
    public void testArraySort_RandomArray(){
        int []numbers = {10, 5, 8, 2};
        int []expected = {2, 5, 8, 10};

        Arrays.sort(numbers);

        assertArrayEquals(expected, numbers);
    }
}
