package com.kodilla.abstracts.homework;

public abstract class Shape {
    String name;

    public String getName() {
        return name;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public abstract String printDim();
}