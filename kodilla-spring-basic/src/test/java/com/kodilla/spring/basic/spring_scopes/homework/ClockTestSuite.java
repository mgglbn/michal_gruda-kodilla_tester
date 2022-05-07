package com.kodilla.spring.basic.spring_scopes.homework;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ClockTestSuite {

    @Test
    public void shouldHaveDifferentTimes() {
        Clock[] clocks = {new Clock(), new Clock(), new Clock()};
        assertNotEquals(clocks[0], clocks[1]);
        assertNotEquals(clocks[1], clocks[2]);
        assertNotEquals(clocks[0], clocks[2]);
    }
}