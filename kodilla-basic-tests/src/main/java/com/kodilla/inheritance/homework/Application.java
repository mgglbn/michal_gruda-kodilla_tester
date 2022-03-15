package com.kodilla.inheritance.homework;

public class Application {
    public static void main(String[] args) {
        AlphaSystem alphaSystem = new AlphaSystem(2021);
        BetaSystem betaSystem = new BetaSystem(2020);

        alphaSystem.turnOn();
        alphaSystem.turnOff();

        betaSystem.turnOn();
        betaSystem.turnOff();
    }
}