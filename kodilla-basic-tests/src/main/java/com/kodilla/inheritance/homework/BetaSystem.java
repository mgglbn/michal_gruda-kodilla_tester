package com.kodilla.inheritance.homework;

public class BetaSystem extends OperatingSystem {
    public BetaSystem(int releaseYear) {
        super(releaseYear);
    }

    @Override
    public void turnOn() {
        System.out.println("Turning on Beta OS...");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off Beta OS...");
    }
}