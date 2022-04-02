package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {
    static FlightFinder finder;

    @BeforeAll
    public static void testSetup() {
        finder = new FlightFinder();
    }

    @Test
    public void testFindFlightsFrom() {
        List<Flight> expectedResult = new ArrayList<>();

        expectedResult.add(new Flight("LUZ", "DUB"));
        expectedResult.add(new Flight("LUZ", "TRF"));
        expectedResult.add(new Flight("LUZ", "DSA"));
        expectedResult.add(new Flight("LUZ", "LTN"));
        expectedResult.add(new Flight("LUZ", "WAW"));
        expectedResult.add(new Flight("LUZ", "GDN"));

        List<Flight> result = finder.findFlightsFrom("LUZ");
        assertEquals(expectedResult, result);
    }

    @Test
    public void testFindFlightsTo() {
        List<Flight> expectedResult = new ArrayList<>();

        expectedResult.add(new Flight("WAW", "LUZ"));
        expectedResult.add(new Flight("LTN", "LUZ"));
        expectedResult.add(new Flight("TRF", "LUZ"));

        List<Flight> result = finder.findFlightsTo("LUZ");
        assertEquals(expectedResult, result);
    }
}