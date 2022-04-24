package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Shop {
    private Set<Order> orders = new HashSet<>();

    public void addOrder(Order order) {
        if (validateOrder(order))
            orders.add(order);
    }

    public Set<Order> getOrdersBetweenDates(LocalDate from, LocalDate to) {
        Set<Order> filteredOrders = orders.stream()
                .filter(u -> (u.getDate().isAfter(from) || u.getDate().isEqual(from)) &&
                        (u.getDate().isBefore(to) || u.getDate().isEqual(to)))
                .collect(Collectors.toSet());

        return filteredOrders ;
    }

    public Set<Order> getOrdersInRangeOfValues(double valueMin, double valueMax) {
        Set<Order> filteredOrders = orders.stream()
                .filter(u -> u.getValue()>= valueMin && u.getValue()<=valueMax)
                .collect(Collectors.toSet());

        return filteredOrders ;
    }

    public int getSize() {
        return orders.size();
    }

    public double getValueOfAll() {
        double sum = orders
                .stream()
                .mapToDouble(n -> n.getValue())
                .sum();
        return sum;
    }

    private boolean validateOrder(Order order) {
        if (order != null)
            if(order.getUsername() != null && order.getDate() != null){
                return !order.getUsername().isEmpty() &&
                        order.getValue() > 0.0 &&
                        order.getDate().isBefore(LocalDate.now());
            }
        return false;
    }
}