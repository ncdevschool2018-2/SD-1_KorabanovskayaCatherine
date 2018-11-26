package com.netcracker.edu.fapi.controller;

import com.netcracker.edu.fapi.models.AccountViewModel;
import com.netcracker.edu.fapi.service.AccountDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/accounts")
public class AccountController {

    private AccountDataService accountDataService;

    @Autowired
    public AccountController(AccountDataService accountDataService) {
        this.accountDataService = accountDataService;
    }

    @GetMapping
    public ResponseEntity<List<AccountViewModel>> getAllAccounts() {
        return ResponseEntity.ok(accountDataService.getAllAccounts());
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<AccountViewModel> getAccount(@PathVariable(name = "id") Long id) {
        AccountViewModel account = accountDataService.getAccount(id);
        if (account != null) {
            return ResponseEntity.ok(account);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<AccountViewModel> saveAccount(@RequestBody AccountViewModel account) {
        return ResponseEntity.ok(accountDataService.saveAccount(account));
    }

    @DeleteMapping(value = "/{id}")
    public void deleteAccount(@PathVariable(name = "id") Long id) {
        accountDataService.deleteAccount(id);
    }
}
