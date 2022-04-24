package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PersonSources {
    public static Stream<Arguments> providePersonForTestingBMI() {
        return Stream.of(
                Arguments.of(new Person(1.85, 51), "Very severely underweight"),
                Arguments.of(new Person(1.85, 54), "Severely underweight"),
                Arguments.of(new Person(1.85, 63), "Underweight"),
                Arguments.of(new Person(1.85, 85), "Normal (healthy weight)"),
                Arguments.of(new Person(1.85, 102), "Overweight"),
                Arguments.of(new Person(1.85, 119), "Obese Class I (Moderately obese)"),
                Arguments.of(new Person(1.85, 136), "Obese Class II (Severely obese)"),
                Arguments.of(new Person(1.85, 153), "Obese Class III (Very severely obese)"),
                Arguments.of(new Person(1.85, 171), "Obese Class IV (Morbidly Obese)"),
                Arguments.of(new Person(1.85, 205), "Obese Class V (Super Obese)"),
                Arguments.of(new Person(1.85, 206), "Obese Class VI (Hyper Obese)")
        );
    }
}