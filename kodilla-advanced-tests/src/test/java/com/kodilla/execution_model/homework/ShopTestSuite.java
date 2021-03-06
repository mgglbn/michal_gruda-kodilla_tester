package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ShopTestSuite {
    Shop shop = new Shop();
    Order[] orders = new Order[]{
            new Order("A", 10, LocalDate.now().minusDays(5)),
            new Order("B", 20, LocalDate.now().minusDays(3)),
            new Order("C", 30, LocalDate.now().minusDays(15)),
            new Order("A", 40, LocalDate.now().minusDays(54)),
            new Order("B", 50, LocalDate.now().minusDays(12)),
            new Order("C", 60, LocalDate.now().minusDays(5))
    };

    @BeforeEach
    public void initializeShop() {
        for (Order order : orders) {
            shop.addOrder(order);
        }
    }

    @Test
    public void shouldAddOrdersToShop() {
        assertEquals(6, shop.getSize());
    }

    @Test
    public void shouldGetOrdersBetweenDates() {
        int numOfOrders = shop.getOrdersBetweenDates(LocalDate.now().minusDays(11), LocalDate.now().minusDays(4)).size();
        assertEquals(2, numOfOrders);
    }

    @Test
    public void shouldGetEmptyOrdersBetweenDates() {
        int numOfOrders = shop.getOrdersBetweenDates(LocalDate.of(2022, 3, 3), LocalDate.of(2022, 3, 6)).size();
        assertEquals(0, numOfOrders);
    }

    @Test
    public void shouldGetEmptyOrdersBetweenWrongDates() {
        int numOfOrders = shop.getOrdersBetweenDates(LocalDate.of(2022, 4, 6), LocalDate.of(2022, 4, 3)).size();
        assertEquals(0, numOfOrders);
    }

    @Test
    public void shouldGetOrdersInRangeOfValues() {
        int numOfOrders = shop.getOrdersInRangeOfValues(20, 50).size();
        assertEquals(4, numOfOrders);
    }

    @Test
    public void shouldGetEmptyOrdersInRangeOfValues() {
        int numOfOrders = shop.getOrdersInRangeOfValues(100, 200).size();
        assertEquals(0, numOfOrders);
    }

    @Test
    public void shouldGetEmptyOrdersInRangeWrongOfValues() {
        int numOfOrders = shop.getOrdersInRangeOfValues(100, 0).size();
        assertEquals(0, numOfOrders);
    }

    @Test
    public void shouldGetSumOfAllOrdersValues() {
        assertEquals(210.0, shop.getValueOfAll(), 0.001);
    }

    @Test
    public void shouldGetSumOfAllOrdersValuesWithEmptyShop() {
        Shop shop = new Shop();
        assertEquals(0, shop.getValueOfAll(), 0.001);
    }
}