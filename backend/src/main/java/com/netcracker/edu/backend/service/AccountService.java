package com.netcracker.edu.backend.service;

import com.netcracker.edu.backend.entity.Account;

import java.util.Optional;

public interface AccountService {

    Iterable<Account> getAllAccounts();

    Optional<Account> getAccount(Long id);

    Account saveAccount(Account account);

    void deleteAccount(Long id);
}
