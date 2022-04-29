package com.anurag.junit.helper;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class StringHelperParameterizedTest {

    StringHelper stringHelper = new StringHelper();

    private String input;

    public StringHelperParameterizedTest(String input) {
        this.input = input;
    }

    @Parameters
    public static List<String> testConditions(){
        String input[] = {"ABAB", "CD"};
        return Arrays.asList(input);
    }

    @Test
    public void areFirstAndLastTwoCharactersTheSame_TrueConditions(){
        assertTrue(stringHelper.areFirstAndLastTwoCharactersTheSame(input));
    }
}
