package com.netcracker.edu.backend.controller;

import com.netcracker.edu.backend.entity.Account;
import com.netcracker.edu.backend.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("api/accounts")
public class AccountController {

    private AccountService service;

    @Autowired
    public AccountController(AccountService service) {
        this.service = service;
    }

    @GetMapping
    public Iterable<Account> getAllAccount() {
        return service.getAllAccounts();
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Account> getAccount(@PathVariable(name = "id") Long id) {
        Optional<Account> account = service.getAccount(id);

        if(account.isPresent()) {
            return ResponseEntity.ok(account.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public Account saveAccount(@RequestBody Account account) {
        return service.saveAccount(account);
    }

    @DeleteMapping(name = "/{id}")
    public ResponseEntity deleteAccount(@PathVariable(name = "id") Long id) {
        service.deleteAccount(id);
        return ResponseEntity.noContent().build();
    }
}
