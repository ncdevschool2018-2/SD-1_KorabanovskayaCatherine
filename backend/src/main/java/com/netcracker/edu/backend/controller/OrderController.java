package com.netcracker.edu.backend.controller;


import com.netcracker.edu.backend.entity.Order;
import com.netcracker.edu.backend.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("api/orders")
public class OrderController {

    private OrderService service;

    @Autowired
    public OrderController(OrderService service) {
        this.service = service;
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public Iterable<Order> getAllOrders() {
        return service.getAllOrders();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Order> getOrder(@PathVariable(name = "id") Long id) {
        Optional<Order> order = service.getOrderById(id);

        if(order.isPresent()) {
            return ResponseEntity.ok(order.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @RequestMapping(method = RequestMethod.POST)
    public Order saveOrder(Order order) {
        return service.saveOrder(order);
    }


    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity deleteOrder(@PathVariable(name = "id") Long id) {
        service.deleteOrderById(id);
        return ResponseEntity.noContent().build();
    }
}
