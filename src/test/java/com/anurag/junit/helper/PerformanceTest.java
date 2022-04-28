package com.anurag.junit.helper;

import java.util.Arrays;

import org.junit.Test;

public class PerformanceTest {

    @Test(timeout = 10)
    public void testArraySortPerformance(){
        int []numbers = {23, 4, 87};
        
        for(int i=0; i<1000000; i++){
            numbers[0] = i;
            Arrays.sort(numbers);
        }
    }
}
