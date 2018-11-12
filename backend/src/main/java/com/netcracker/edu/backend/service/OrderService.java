package com.netcracker.edu.backend.service;

import com.netcracker.edu.backend.entity.Order;

import java.util.Optional;

public interface OrderService {

    Iterable<Order> getAllOrders();
    Optional<Order> getOrderById(Long id);
    Order saveOrder(Order order);
    void deleteOrderById(Long id);
}
