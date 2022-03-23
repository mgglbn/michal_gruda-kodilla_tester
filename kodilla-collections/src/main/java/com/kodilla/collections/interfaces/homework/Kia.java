package com.kodilla.collections.interfaces.homework;

public class Kia implements Car {
    private int speed;
    private final int acceleration = 17;
    private final int deceleration = 20;
    private final int maxSpeed = 200;

    public Kia() {
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