package com.netcracker.edu.fapi.service.impl;

import com.netcracker.edu.fapi.models.CompanySubscriptionViewModel;
import com.netcracker.edu.fapi.service.CompanySubscriptionsDataService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class CompanySubscriptionDataServiceImpl implements CompanySubscriptionsDataService {

    @Value("${backend.server.url}")
    private String backendServerUrl;

    @Override
    public List<CompanySubscriptionViewModel> getAllCompanySubscriptions() {
        RestTemplate restTemplate = new RestTemplate();
        CompanySubscriptionViewModel[] subscriptions = restTemplate.getForObject(
                backendServerUrl + "/api/subscriptions/",
                CompanySubscriptionViewModel[].class);
        return subscriptions == null ? Collections.emptyList() : Arrays.asList(subscriptions);
    }

    @Override
    public CompanySubscriptionViewModel getCompanySubscriptionById(Long id) {
        return null;
    }

    @Override
    public CompanySubscriptionViewModel saveCompanySubscription(CompanySubscriptionViewModel subscription) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForEntity(
                backendServerUrl + "/api/subscriptions",
                subscription,
                CompanySubscriptionViewModel.class).getBody();
    }

    @Override
    public void deleteCompanySubscription(Long id) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.delete(
                backendServerUrl + "/api/subscriptions/" + id
        );
    }
}
