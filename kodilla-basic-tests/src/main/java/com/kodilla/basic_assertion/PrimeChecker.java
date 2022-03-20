package com.kodilla.basic_assertion;

public class PrimeChecker {
    public boolean isPrime(int number) {
        if (number < 2) {
            return false;
        } else if (number == 2 | number == 3) {
            return true;
        } else if (number > 3) {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}