package com.kodilla.collections.interfaces.homework;

public class Opel implements Car {
    private int speed;
    private final int acceleration = 13;
    private final int deceleration = 16;
    private final int maxSpeed = 190;

    public Opel() {
        this.speed = 0;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed += acceleration;

        if (speed > maxSpeed) {
            speed = maxSpeed;
        }
    }

    @Override
    public void decreaseSpeed() {
        speed -= deceleration;

        if (speed < 0) {
            speed = 0;
        }
    }
}