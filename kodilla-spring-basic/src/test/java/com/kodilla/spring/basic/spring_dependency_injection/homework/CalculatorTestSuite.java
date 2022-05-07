package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CalculatorTestSuite {

    ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
    Calculator bean = context.getBean(Calculator.class);

    @ParameterizedTest
    @CsvSource(value = {"0,0,0", "-100,0,-100", "100,0,100", "-1000,-1000,-2000", "0.5,0.5,1.0"})
    public void testAdd(double a, double b, double expected) {
        assertEquals(expected, bean.add(a, b), 0.0000000000000001);
    }

    @ParameterizedTest
    @CsvSource(value = {"0,0,0", "-100,0,-100", "100,0,100", "-1000,-1000,0", "0.6,0.5,0.1"})
    public void testSubtract(double a, double b, double expected) {
        assertEquals(expected, bean.subtract(a, b), 0.0000000000000001);
    }

    @ParameterizedTest
    @CsvSource(value = {"0,0,0", "-100,0,0", "-3,-2,6", "-3,2,-6", "8.5,0.5,4.25"})
    public void testMultiply(double a, double b, double expected) {
        assertEquals(expected, bean.multiply(a, b), 0.0000000000000001);
    }

    @ParameterizedTest
    @CsvSource(value = {"0,1,0", "-100,1,-100", "7,2,3.5"})
    public void testDivide(double a, double b, double expected) {
        assertEquals(expected, bean.divide(a, b), 0.0000000000000001);
    }
}