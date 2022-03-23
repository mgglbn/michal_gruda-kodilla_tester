package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Kia;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.Random;

public class CarsApplication {

    public static void main(String[] args) {
        Random random = new Random();
        Car[] cars = new Car[random.nextInt(15) + 1];

        for (int i = 0; i < cars.length; i++) {
            cars[i] = drawCar();
        }

        for (Car car : cars) {
            CarUtils.describeCar(car);
        }
    }

    public static Car drawCar() {
        Random random = new Random();
        int drawnCar = random.nextInt(3);
        int accelerationTime = random.nextInt(10) + 1;

        Car car = switch (drawnCar) {
            case 0 -> new Kia();
            case 1 -> new Ford();
            case 2 -> new Opel();
            default -> null;
        };

        for (int i = 0; i < accelerationTime; i++)
            car.increaseSpeed();

        return car;
    }
}