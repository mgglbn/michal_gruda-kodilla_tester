package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("1"));
        warehouse.addOrder(new Order("2"));
        warehouse.addOrder(new Order("3"));
        warehouse.addOrder(new Order("4"));
        warehouse.addOrder(new Order("5"));
        warehouse.addOrder(new Order("6"));
        warehouse.addOrder(new Order("7"));
        warehouse.addOrder(new Order("8"));
        warehouse.addOrder(new Order("9"));

        printOrder(warehouse, "10");

        System.out.println();

        printOrder(warehouse, "5");
    }

    private static void printOrder(Warehouse warehouse, String number) {
        Order order;
        try {
            order = warehouse.getOrder(number);
            System.out.println(order);
        } catch (OrderDoesNotExistException e) {
            System.out.println("Order does not exist");
        }
    }
}