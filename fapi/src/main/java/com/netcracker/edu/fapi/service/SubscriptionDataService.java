package com.netcracker.edu.fapi.service;

import com.netcracker.edu.fapi.models.SubscriptionViewModel;

import java.util.List;

public interface SubscriptionDataService {
    List<SubscriptionViewModel> getAllSubscriptions();

    SubscriptionViewModel getSubscription(Long id);

    SubscriptionViewModel saveSubscription(SubscriptionViewModel subscription);

    void deleteSubscription(Long id);
}
