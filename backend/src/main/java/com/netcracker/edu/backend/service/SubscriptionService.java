package com.netcracker.edu.backend.service;

import com.netcracker.edu.backend.entity.Subscription;

import java.util.Optional;

public interface SubscriptionService {

    Iterable<Subscription> getAllSubscriptions();
    Optional<Subscription> getSubscription(Long id);
    Subscription saveSubscription(Subscription subscription);
    void deleteSubscription(Long id);

}
