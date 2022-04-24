package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

public class Order {
    private double value;
    private LocalDate date;
    private String username;

    public Order(String username,double value, LocalDate date) {
        this.value = value;
        this.date = date;
        this.username = username;
    }

    public double getValue() {
        return value;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Double.compare(order.value, value) == 0 && date.equals(order.date) && username.equals(order.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, date, username);
    }

    @Override
    public String toString() {
        return "Order{" +
                "value=" + value +
                ", date=" + date +
                ", username='" + username + '\'' +
                '}';
    }
}