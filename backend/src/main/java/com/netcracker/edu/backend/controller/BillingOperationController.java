package com.netcracker.edu.backend.controller;

import com.netcracker.edu.backend.entity.BillingOperation;
import com.netcracker.edu.backend.service.BillingOperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("api/billing-operations")
public class BillingOperationController {

    private BillingOperationService service;

    @Autowired
    public BillingOperationController(BillingOperationService service) {
        this.service = service;
    }


    @RequestMapping(value = "", method = RequestMethod.GET)
    public Iterable<BillingOperation> getAllBillingOperations() {
        return service.getAllBillingOperations();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<BillingOperation> getBillingOperation(@PathVariable(name = "id") Long id) {
        Optional<BillingOperation> billingOperation = service.getBillingOperation(id);

        if(billingOperation.isPresent()) {
            return ResponseEntity.ok(billingOperation.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @RequestMapping(method = RequestMethod.POST)
    public BillingOperation saveBillingOperation(@RequestBody BillingOperation operation) {
        return service.saveBillingOperation(operation);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity deleteBillingOperation(@PathVariable(name = "id") Long id) {
        service.deleteBillingOperation(id);
        return ResponseEntity.noContent().build();
    }
}
