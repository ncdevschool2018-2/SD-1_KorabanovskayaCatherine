package com.netcracker.edu.fapi.controller;

import com.netcracker.edu.fapi.models.OrderViewModel;
import com.netcracker.edu.fapi.service.OrderDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/orders")
public class OrderDataController {

    private OrderDataService orderDataService;

    @Autowired
    public OrderDataController(OrderDataService orderDataService) {
        this.orderDataService = orderDataService;
    }

    @GetMapping
    public ResponseEntity<List<OrderViewModel>> getAllOrders() {
        return ResponseEntity.ok(orderDataService.getAllOrders());
    }

    @PostMapping
    public ResponseEntity<OrderViewModel> saveOrder(@RequestBody OrderViewModel order) {
        if (order != null) {
            return ResponseEntity.ok(orderDataService.saveOrder(order));
        }
        return null;
    }

    @DeleteMapping(value = "/{id}")
    public void deleteOrder(@PathVariable Long id) {
        orderDataService.deleteOrder(id);
    }
}
