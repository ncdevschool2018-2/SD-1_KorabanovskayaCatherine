package com.netcracker.edu.fapi.service.impl;

import com.netcracker.edu.fapi.models.SubscriptionViewModel;
import com.netcracker.edu.fapi.service.SubscriptionDataService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class SubscriptionDataServiceImpl implements SubscriptionDataService {

    @Value("${backend.server.url}")
    private String backendServerUrl;

    @Override
    public List<SubscriptionViewModel> getAllSubscriptions() {
        RestTemplate template = new RestTemplate();
        SubscriptionViewModel[] subscriptions = template.getForObject(
                backendServerUrl + "/api/subscriptions/",
                SubscriptionViewModel[].class);
        return subscriptions == null ? Collections.emptyList() : Arrays.asList(subscriptions);
    }

    @Override
    public SubscriptionViewModel getSubscription(Long id) {
        return null;
    }

    @Override
    public SubscriptionViewModel saveSubscription(SubscriptionViewModel subscription) {
        return new RestTemplate().postForEntity(
                backendServerUrl + "/api/subscriptions",
                subscription,
                SubscriptionViewModel.class).getBody();
    }

    @Override
    public void deleteSubscription(Long id) {
        RestTemplate template = new RestTemplate();
        template.delete(
                backendServerUrl + "/api/subscriptions/" + id
        );
    }
}
