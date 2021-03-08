package com.demo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BasicCalculatorServiceTest {

    BasicCalculatorService service = null;

    @Before
    public void beforeTest() {
        service = new BasicCalculatorService();
        System.out.println("Before Test!");
    }

    @After
    public void afterTest() {
        service = null;
        System.out.println("After Test Case!");
    }

    @Test
    public void testSum1() {
        assertEquals(20, service.doSum(10, 10));
    }

    @Test
    public void testSum2() {
        assertEquals(15, service.doSum(10, 5));
    }

    @Test
    public void testDiff1() {
        assertEquals(5, service.doDiff(10, 5));
    }

    @Test
    public void testDiff2() {
        assertEquals(-5, service.doDiff(10, 15));
    }

    @Test
    public void testMultiply1()
    {
        assertEquals(10, service.multiply(2, 5));
    }

    @Test
    public void testMultiply2()
    {
        assertEquals(15, service.multiply(3, 5));
    }

    @Test
    public void testDivide1()
    {
        assertEquals(2, service.divide(10, 5));
    }

    @Test
    public void testDivide2()
    {
        assertEquals(3, service.divide(15, 5));
    }
}
