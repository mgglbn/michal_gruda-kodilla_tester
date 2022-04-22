package com.kodilla.parametrized_tests.homework;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class GamblingMachineTestSuite {
    GamblingMachine gamblingMachine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/gamblingMachineData.csv", numLinesToSkip = 1)
    public void shouldThrowInvalidNumberException(int howManyNums, int minNum, int maxNum) {

        Set<Integer> userNumbers = new HashSet<>();
        if (howManyNums > 0) {
            userNumbers.add(minNum);
            if (howManyNums > 1) {
                userNumbers.add(maxNum);
                int numberToAddToSet = minNum + 1;
                while (userNumbers.size() < howManyNums && numberToAddToSet < maxNum) {
                    userNumbers.add(numberToAddToSet);
                    numberToAddToSet += 1;
                }
            }
        }
        System.out.println(userNumbers);

        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(userNumbers));
    }
}