package com.kodilla.exception.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseTestSuite {
    @Test
    public void testGetOrderWithException() {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("1"));
        warehouse.addOrder(new Order("2"));

        assertThrows(OrderDoesNotExistException.class, () -> warehouse.getOrder("3"));
    }
}