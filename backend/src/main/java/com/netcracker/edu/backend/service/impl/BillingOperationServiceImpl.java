package com.netcracker.edu.backend.service.impl;

import com.netcracker.edu.backend.entity.BillingOperation;
import com.netcracker.edu.backend.repository.BillingOperationRepository;
import com.netcracker.edu.backend.service.BillingOperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class BillingOperationServiceImpl implements BillingOperationService {

    private BillingOperationRepository repository;

    @Autowired
    public BillingOperationServiceImpl(BillingOperationRepository repository) {
        this.repository = repository;
    }

    @Override
    public Iterable<BillingOperation> getAllBillingOperations() {
        return repository.findAll();
    }

    @Override
    public Optional<BillingOperation> getBillingOperation(Long id) {
        return repository.findById(id);
    }

    @Override
    public BillingOperation saveBillingOperation(BillingOperation operation) {
        return repository.save(operation);
    }

    @Override
    public void deleteBillingOperation(Long id) {
        repository.deleteById(id);
    }
}
