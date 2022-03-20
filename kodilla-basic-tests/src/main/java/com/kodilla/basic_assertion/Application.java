package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.add(a, b);
        boolean correct = ResultChecker.assertEquals(13, sumResult);

        if (correct) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }

        int subResult = calculator.sub(a, b);
        correct = ResultChecker.assertEquals(-3, subResult);

        if (correct) {
            System.out.println("Metoda sub działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sub nie działa poprawnie dla liczb " + a + " i " + b);
        }

        int powResult = calculator.pow2(a);
        correct = ResultChecker.assertEquals(25, powResult);

        if (correct) {
            System.out.println("Metoda pow2 działa poprawnie dla liczby " + a);
        } else {
            System.out.println("Metoda pow2 nie działa poprawnie dla liczby " + a);
        }
    }
}