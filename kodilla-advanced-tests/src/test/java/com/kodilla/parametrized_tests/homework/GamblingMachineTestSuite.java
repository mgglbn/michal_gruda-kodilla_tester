package com.kodilla.parametrized_tests.homework;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class GamblingMachineTestSuite {
    GamblingMachine gamblingMachine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/gamblingMachineDataThrowException.csv", numLinesToSkip = 1)
    public void shouldThrowInvalidNumberException(int howManyNums, int minNum, int maxNum) {

        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(getUserNumbers(howManyNums, minNum, maxNum)));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/gamblingMachineDataDoesNotThrowException.csv", numLinesToSkip = 1)
    public void shouldNotThrowInvalidNumberException(int howManyNums, int minNum, int maxNum) {

        assertDoesNotThrow(() -> gamblingMachine.howManyWins(getUserNumbers(howManyNums, minNum, maxNum)));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/gamblingMachineDataDoesNotThrowException.csv", numLinesToSkip = 1)
    public void howManyWinsCountBetweenOneAndSix(int howManyNums, int minNum, int maxNum) {
        try {
            int winsCount = gamblingMachine.howManyWins(getUserNumbers(howManyNums, minNum, maxNum));
            assertTrue(winsCount >= 0 && winsCount < 7);
        } catch (InvalidNumbersException e) {
            System.out.println("Wrong user numbers set");
        }
    }

    private Set<Integer> getUserNumbers(int howManyNums, int minNum, int maxNum) {
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
        return userNumbers;
    }
}