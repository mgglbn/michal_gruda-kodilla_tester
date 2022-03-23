package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Kia;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        cars.add(new Kia());
        cars.add(new Ford());
        cars.add(new Opel());

        for (Car car : cars) {
            CarUtils.describeCar(car);
        }

        cars.remove(cars.size() - 1);
        cars.remove(new Ford());

        System.out.println();
        System.out.println("List size: " + cars.size());
        System.out.println();

        for (Car car : cars) {
            CarUtils.describeCar(car);
        }
    }
}