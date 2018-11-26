package com.netcracker.edu.fapi.controller;


import com.netcracker.edu.fapi.models.SubscriptionViewModel;
import com.netcracker.edu.fapi.service.SubscriptionDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/subscriptions")
public class SubscriptionDataController {

    private SubscriptionDataService service;

    @Autowired
    public SubscriptionDataController(SubscriptionDataService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<SubscriptionViewModel>> getAllCompanySubscriptions() {
        return ResponseEntity.ok(service.getAllSubscriptions());
    }

    // TODO: server validation
    @PostMapping
    public ResponseEntity<SubscriptionViewModel> saveCompanySubscription(
            @RequestBody SubscriptionViewModel subscription) {
        if (subscription != null) {
            return ResponseEntity.ok(service.saveSubscription(subscription));
        }
        return null;
    }

    @DeleteMapping(value = "/{id}")
    public void deleteCompanySubscription(@PathVariable Long id) {
        service.deleteSubscription(id);
    }


    @GetMapping(value = "/user/{id}")
    public ResponseEntity<List<SubscriptionViewModel>> getUserSubscriptions(@PathVariable Long id) {
        return ResponseEntity.ok(service.getUserSubscriptions(id));
    }

    //TODO: make getSubscription
}
