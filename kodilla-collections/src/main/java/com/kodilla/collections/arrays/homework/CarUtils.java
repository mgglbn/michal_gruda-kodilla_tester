package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;

public class CarUtils {

    public static void describeCar(Car car) {
        System.out.println("-----------------------------");
        System.out.println("Car brand: " + getCarName(car));
        System.out.println("Speed: " + car.getSpeed());
    }

    private static String getCarName(Car car) {

        String className = car.getClass().toString();
        int indexLastDot = className.lastIndexOf(".");

        return className.substring(indexLastDot + 1);
    }
}