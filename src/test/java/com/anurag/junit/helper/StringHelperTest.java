package com.anurag.junit.helper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

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

    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_BasicFalseScenario(){
        // 1. ABCD => false
        assertFalse(stringHelper.areFirstAndLastTwoCharactersTheSame("ABCD"));
    }

    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_BasicTrueScenario(){
        // 2. ABAB => true
        assertTrue(stringHelper.areFirstAndLastTwoCharactersTheSame("ABAB"));
    }

    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_Only1CharacterFalse(){
        // 3. A => false
        assertFalse(stringHelper.areFirstAndLastTwoCharactersTheSame("A"));
    }

    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_Only2CharactersTrue(){
        // 4. AB => true
        assertTrue(stringHelper.areFirstAndLastTwoCharactersTheSame("AB"));
    }
}
