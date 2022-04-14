package com.kodilla.exception.homework;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class Warehouse {
    private Set<Order> orders = new HashSet<>();

    public void addOrder(Order order) {
        orders.add(order);
    }

    public Order getOrder(String number) throws OrderDoesNotExistException {
//        Optional<Order> order = orders
//                .stream()
//                .filter(u -> u.getNumber().equals(number))
//                .findFirst();

        return orders
                .stream()
                .filter(u -> u.getNumber().equals(number))
                .findFirst()
                .orElseThrow(OrderDoesNotExistException::new);

        //.orElseThrow(()-> new OrderDoesNotExistException());


//        if (order.isEmpty()) {
//            throw new OrderDoesNotExistException();
//        }
//        return order.get();
    }
}