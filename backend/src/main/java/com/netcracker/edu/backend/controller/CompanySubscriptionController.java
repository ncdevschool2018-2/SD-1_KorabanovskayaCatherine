package com.netcracker.edu.backend.controller;


import com.netcracker.edu.backend.entity.CompanySubscription;
import com.netcracker.edu.backend.service.CompanySubscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

// почитать про Optional & ResponseEntity
// аннотации springboot
// http запросы


@RestController
@RequestMapping("/api/subscriptions")
public class CompanySubscriptionController {

    private CompanySubscriptionService companySubscriptionService;

    @Autowired
    public CompanySubscriptionController(CompanySubscriptionService companySubscriptionService) {
        this.companySubscriptionService = companySubscriptionService;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<CompanySubscription> getCompanySubscriptionById(@PathVariable(name = "id") Long id) {

        //
        Optional<CompanySubscription> companySubscription = companySubscriptionService.getCompanySubscriptionById(id);

        // isPresent() -
        if(companySubscription.isPresent()) {
            return ResponseEntity.ok(companySubscription.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public Iterable<CompanySubscription> getAllCompanySubscriptions() {
        return companySubscriptionService.getAllCompanySubscriptions();
    }

    @RequestMapping(method = RequestMethod.POST)
    public CompanySubscription saveCompanySubscription(@RequestBody CompanySubscription subscription) {
        return companySubscriptionService.saveCompanySubscription(subscription);
    }


    // ResponseEntity<CompanySubscription> ??
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity deleteCompanySubscription(@PathVariable(name = "id") Long id) {
        companySubscriptionService.deleteCompanySubscription(id);
        return ResponseEntity.noContent().build();
    }
}
