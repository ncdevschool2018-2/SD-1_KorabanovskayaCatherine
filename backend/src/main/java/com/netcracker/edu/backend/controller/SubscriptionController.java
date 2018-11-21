package com.netcracker.edu.backend.controller;


import com.netcracker.edu.backend.entity.Subscription;
import com.netcracker.edu.backend.service.SubscriptionService;
import org.hibernate.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/subscriptions")
public class SubscriptionController {

    private SubscriptionService service;

    @Autowired
    public SubscriptionController(SubscriptionService service) {
        this.service = service;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Subscription> getSubscription(@PathVariable(name = "id") Long id) {

        Optional<Subscription> subscription = service.getSubscription(id);

        if(subscription.isPresent()) {
            return ResponseEntity.ok(subscription.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public Iterable<Subscription> getAllSubscriptions() {
        return service.getAllSubscriptions();
    }

    @RequestMapping(method = RequestMethod.POST)
    public Subscription saveSubscription(@RequestBody Subscription subscription) {
        return service.saveSubscription(subscription);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity deleteSubscription(@PathVariable(name = "id") Long id) {
        service.deleteSubscription(id);
        return ResponseEntity.noContent().build();
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public Iterable<Subscription> getUserSubscriptions(@PathVariable(name = "id") Long id) {
        return service.getUserSubscriptions(id);
    }
}
