package com.netcracker.edu.backend.service;

import com.netcracker.edu.backend.entity.BillingAccount;

import java.util.Optional;

public interface BillingAccountService {

    Iterable<BillingAccount> getAllBillingAccounts();
    Optional<BillingAccount> getBillingAccountById(Long id);
    BillingAccount saveBillingAccount(BillingAccount account);
    void deleteBillingAccountById(Long id);
}
