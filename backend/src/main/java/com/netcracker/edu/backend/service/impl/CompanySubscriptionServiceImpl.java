package com.netcracker.edu.backend.service.impl;

import com.netcracker.edu.backend.entity.CompanySubscription;
import com.netcracker.edu.backend.repository.CompanySubscriptionRepository;
import com.netcracker.edu.backend.service.CompanySubscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class CompanySubscriptionServiceImpl implements CompanySubscriptionService {

    private CompanySubscriptionRepository repository;

    @Autowired
    public CompanySubscriptionServiceImpl(CompanySubscriptionRepository repository) {
        this.repository = repository;
    }

    @Override
    public CompanySubscription saveCompanySubscription(CompanySubscription subscription) {
        return repository.save(subscription);
    }

    @Override
    public Optional<CompanySubscription> getCompanySubscriptionById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Iterable<CompanySubscription> getAllCompanySubscriptions() {
        return repository.findAll();
    }

    @Override
    public void deleteCompanySubscription(Long id) {
        repository.deleteById(id);
    }
}
