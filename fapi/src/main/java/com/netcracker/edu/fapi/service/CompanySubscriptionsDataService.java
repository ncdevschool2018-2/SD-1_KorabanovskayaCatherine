package com.netcracker.edu.fapi.service;

import com.netcracker.edu.fapi.models.CompanySubscriptionViewModel;

import java.util.List;

public interface CompanySubscriptionsDataService {
    List<CompanySubscriptionViewModel> getAllCompanySubscriptions();
    CompanySubscriptionViewModel getCompanySubscriptionById(Long id);
    CompanySubscriptionViewModel saveCompanySubscription(CompanySubscriptionViewModel subscription);
    void deleteCompanySubscription(Long id);
}
