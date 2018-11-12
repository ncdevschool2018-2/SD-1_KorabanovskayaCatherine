package com.netcracker.edu.backend.service;

import com.netcracker.edu.backend.entity.BillingOperation;

import java.util.Optional;

public interface BillingOperationService {

    Iterable<BillingOperation> getAllBillingOperations();
    Optional<BillingOperation> getBillingOperation(Long id);
    BillingOperation saveBillingOperation(BillingOperation operation);
    void deleteBillingOperation(Long id);
}
