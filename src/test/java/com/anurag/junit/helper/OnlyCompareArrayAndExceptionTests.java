package com.anurag.junit.helper;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ CompareArraysTest.class, ExceptionTest.class })
public class OnlyCompareArrayAndExceptionTests {
    
}
