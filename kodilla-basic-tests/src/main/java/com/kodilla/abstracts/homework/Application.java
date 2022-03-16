package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {
        Shape shapes[] = {
                new Circle(5.0),
                new Triangle(3, 4, 5),
                new Rectangle(5, 10)};

        for (Shape shape : shapes) {
            System.out.println(shape.getName() + " with dimensions " + shape.printDim() +
                    " has area " + shape.getArea() + " and perimeter " + shape.getPerimeter());
        }
        ////////// Person testing ////////////////////////////////////////
        System.out.println();

        Person persons[] = {
                new Person("Adam", 80, new Singer()),
                new Person("John", 40, new Driver()),
                new Person("Karina", 20, new Teacher())};

        for (Person person : persons) {
            person.printResponsibilities();
        }
    }
}