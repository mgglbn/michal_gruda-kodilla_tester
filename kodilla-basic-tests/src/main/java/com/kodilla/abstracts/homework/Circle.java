package com.kodilla.abstracts.homework;

public class Circle extends Shape {
    private double r;

    public Circle(double r) {
        this.r = r;
        this.name = "Circle";
    }

    @Override
    public double getArea() {
        return Math.PI * r * r;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * r;
    }

    @Override
    public String printDim() {
        return "r: " + r;
    }
}