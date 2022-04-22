package com.kodilla.parametrized_tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class StringManipulatorTestSuite {
    private StringManipulator stringManipulator = new StringManipulator();

    @ParameterizedTest
    @CsvSource(value = {"test,tset", "OtHEr,rehto", "EVent,tneve", "null,llun", "A,a"})
    public void shouldReverseStringWithLowerCase(String input, String expected) {
        assertEquals(expected,stringManipulator.reverseWithLowerCase(input));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/stringWithLowerCase.csv", numLinesToSkip = 1)
    public void shouldReverseStringWithLowerCase2(String input, String expected) {
        assertEquals(expected, stringManipulator.reverseWithLowerCase(input));
    }



    @ParameterizedTest
    @CsvSource(value = {"test,4", " OtHEr ,5", "E V e n t,5", "null ,4", "A,1"})
    public void shouldCalculateStringLengthWithoutSpaces(String input, int expected) {
        assertEquals(expected,stringManipulator.getStringLengthWithoutSpaces(input));
    }

    @ParameterizedTest
    @MethodSource(value="provideStringsForTestingLength")
    public void shouldCalculateStringLengthWithoutSpaces2(String input, int expected) {
        assertEquals(expected,stringManipulator.getStringLengthWithoutSpaces(input));
    }

    @ParameterizedTest
    @MethodSource(value="com.kodilla.parametrized_tests.StringSources#provideStringsForTestingLength")
    public void shouldCalculateStringLengthWithoutSpaces3(String input, int expected) {
        assertEquals(expected,stringManipulator.getStringLengthWithoutSpaces(input));
    }

    @ParameterizedTest
    @CsvSource(value = {"te,st:1", "..OtHEr :0", "E,V,e,n.t:3", "null :0", "A:0"}, delimiter = ':')
    public void shouldCountNumberOfCommas(String input, int expected) {
        assertEquals(expected, stringManipulator.countNumberOfCommas(input));
    }


    private static Stream<Arguments> provideStringsForTestingLength(){
        return Stream.of(
                Arguments.of("test",4),
                Arguments.of("OtHEr ", 5),
                Arguments.of("E V e n t", 5),
                Arguments.of("null ", 4),
                Arguments.of("A", 1)
        );
    }
}