package com.netcracker.edu.backend.service;

import com.netcracker.edu.backend.entity.CompanySubscription;

import java.util.Optional;

public interface CompanySubscriptionService {

    CompanySubscription saveCompanySubscription(CompanySubscription subscription);
    Optional<CompanySubscription> getCompanySubscriptionById(Long id);
    Iterable<CompanySubscription> getAllCompanySubscriptions();
    void deleteCompanySubscription(Long id);

}
