package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.add(a, b);
        assertEquals(13, sumResult);
    }

    @Test
    public void testSub() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int subResult = calculator.sub(a, b);
        assertEquals(-3, subResult);
    }

    @Test
    public void testPow2_lessThan0() {
        Calculator calculator = new Calculator();
        int a = -5;
        int pow2Result = calculator.pow2(a);
        assertEquals(25, pow2Result);
    }

    @Test
    public void testPow2_equals0() {
        Calculator calculator = new Calculator();
        int a = 0;
        int pow2Result = calculator.pow2(a);
        assertEquals(0, pow2Result);
    }

    @Test
    public void testPow2_moreThan0() {
        Calculator calculator = new Calculator();
        int a = 5;
        int pow2Result = calculator.pow2(a);
        assertEquals(25, pow2Result);
    }
}