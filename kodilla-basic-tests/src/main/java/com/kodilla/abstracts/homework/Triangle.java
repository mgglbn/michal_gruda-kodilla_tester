package com.kodilla.abstracts.homework;

public class Triangle extends Shape {
    public String getName() {
        return name;
    }

    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.name = "Triangle";
    }

    @Override
    public double getArea() {
        double s = (a + b + c) / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }

    @Override
    public String printDim() {
        return "a: " + a + " b: " + b + " c: " + c;
    }
}