package com.kodilla.collections.interfaces.homework;

public class CarRace {

    public static void main(String[] args) {
        Car[] cars = {
                new Opel(),
                new Ford(),
                new Kia()
        };

        for (Car car : cars) {
            doRace(car);
        }
    }

    private static void doRace(Car car) {
        for (int i = 0; i < 3; i++) {
            car.increaseSpeed();
        }

        for (int i = 0; i < 2; i++) {
            car.decreaseSpeed();
        }

        String className = car.getClass().toString();
        int indexLastDot = className.lastIndexOf(".");
        String brand = className.substring(indexLastDot + 1);

        System.out.println(brand + " has speed: " + car.getSpeed());
    }
}