package com.netcracker.edu.fapi.controller;


import com.netcracker.edu.fapi.models.CompanySubscriptionViewModel;
import com.netcracker.edu.fapi.service.CompanySubscriptionsDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sub")
public class CompanySubscriptionDataController {

    @Autowired
    private CompanySubscriptionsDataService service;

    @RequestMapping
    public ResponseEntity<List<CompanySubscriptionViewModel>> getAllCompanySubscriptions() {
        return ResponseEntity.ok(service.getAllCompanySubscriptions());
    }

    // TODO: server validation
    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<CompanySubscriptionViewModel> saveCompanySubscription(
            @RequestBody CompanySubscriptionViewModel subscription) {
        if (subscription != null) {
            return ResponseEntity.ok(service.saveCompanySubscription(subscription));
        }
        return null;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteCompanySubscription(@PathVariable String id) {
        service.deleteCompanySubscription(Long.valueOf(id));
    }


    //TODO: make getCompanySubscriptionById
}
