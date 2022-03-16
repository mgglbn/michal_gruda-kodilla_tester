package com.kodilla.abstracts.homework;

public class Rectangle extends Shape {
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
        this.name = "Rectangle";
    }

    @Override
    public double getArea() {
        return a * b;
    }

    @Override
    public double getPerimeter() {
        return 2 * a + 2 * b;
    }

    @Override
    public String printDim() {
        return "a: " + a + " b: " + b;
    }
}