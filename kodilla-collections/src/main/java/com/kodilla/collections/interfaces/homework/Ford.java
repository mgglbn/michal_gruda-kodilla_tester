package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ford ford = (Ford) o;
        return speed == ford.speed && acceleration == ford.acceleration && deceleration == ford.deceleration && maxSpeed == ford.maxSpeed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed, acceleration, deceleration, maxSpeed);
    }
}