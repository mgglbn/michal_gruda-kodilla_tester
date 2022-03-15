package com.kodilla.inheritance.homework;

public class AlphaSystem extends OperatingSystem {
    public AlphaSystem(int releaseYear) {
        super(releaseYear);
    }

    @Override
    public void turnOn() {
        System.out.println("Turning on Alpha OS...");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off Alpha OS...");
    }
}