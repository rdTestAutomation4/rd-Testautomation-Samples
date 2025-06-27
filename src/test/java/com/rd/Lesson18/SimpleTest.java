package com.rd.Lesson18;

import org.testng.annotations.Test;

public class SimpleTest {
    private int param;

    public SimpleTest(int param) {
        this.param = param;
    }

    @Test
    public void testMethodOne() {
        System.out.println("TestMethodOne, param: "+ param);
        int opValue = param + 1;
        System.out.println("Test method one output: " + opValue);
    }

    @Test
    public void testMethodTwo() {
        System.out.println("TestMethodTwo, param: "+ param);
        int opValue = param + 2;
        System.out.println("Test method two output: " + opValue);
    }
}

