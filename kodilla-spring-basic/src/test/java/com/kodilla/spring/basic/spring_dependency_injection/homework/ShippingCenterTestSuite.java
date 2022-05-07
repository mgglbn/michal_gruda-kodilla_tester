package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ShippingCenterTestSuite {

    ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
    ShippingCenter bean = context.getBean(ShippingCenter.class);

    @ParameterizedTest
    @CsvSource(value = {"0,Test", "1.5,Test", "30,Test"})
    public void deliveryShouldSuccess(double weight, String address) {
        assertEquals("Package delivered to: " + address, bean.sendPackage(address, weight));
    }

    @ParameterizedTest
    @CsvSource(value = {"30.000001,Test", "1000.0,Test"})
    public void deliveryShouldFail(double weight, String address) {
        assertEquals("Package not delivered to: " + address, bean.sendPackage(address, weight));
    }
}