package com.anurag.junit.helper;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class QuickBeforeAfterTest {

    @BeforeClass
    public static void beforeClass(){
        System.out.println("Before Class");
    }

    @Before
    public void beforeEveryTest(){
        System.out.println("Before every test");
    }

    @Test
    public void test1(){
        System.out.println("Test 1 executed!");
    }

    @Test
    public void test2(){
        System.out.println("Test 2 executed!");
    }

    @After
    public void afterEveryTest(){
        System.out.println("After every test");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("After Class!");
    }
}
