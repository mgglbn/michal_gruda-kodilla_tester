package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Kia kia = (Kia) o;
        return speed == kia.speed && acceleration == kia.acceleration && deceleration == kia.deceleration && maxSpeed == kia.maxSpeed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed, acceleration, deceleration, maxSpeed);
    }
}