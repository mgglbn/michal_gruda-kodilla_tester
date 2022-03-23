package com.kodilla.collections.interfaces.homework;

public class Ford implements Car {
    private int speed;
    private final int acceleration = 15;
    private final int deceleration = 18;
    private final int maxSpeed = 180;

    public Ford() {
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