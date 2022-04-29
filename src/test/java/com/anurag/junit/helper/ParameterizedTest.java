package com.anurag.junit.helper;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParameterizedTest {
    StringHelper stringHelper = new StringHelper();

    private String input;
    private String output;

    public ParameterizedTest(String input, String output) {
        this.input = input;
        this.output = output;
    }

    @Parameters
    public static Collection<String[]> testConditions(){
        String expectedOutputs[][] = {
            {"AACD", "CD"},
            {"ACD", "CD"},
            {"CDEF", "CDEF"},
            {"CDAA", "CDAA"}
        };
        return Arrays.asList(expectedOutputs);
    }

    @Test
    public void testTurncateAInFirst2Positions(){
        assertEquals(output, stringHelper.turncateAInFirst2Positions(input));
    }
}
