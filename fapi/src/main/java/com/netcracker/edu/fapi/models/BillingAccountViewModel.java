package com.netcracker.edu.fapi.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.HashSet;
import java.util.Set;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BillingAccountViewModel {

    private Long baId;
    private String baNumber;
    private Long accountId;
    private Set<OrderViewModel> orders = new HashSet<>(0);

    public BillingAccountViewModel() {
    }

    public Long getBaId() {
        return baId;
    }

    public void setBaId(Long baId) {
        this.baId = baId;
    }

    public String getBaNumber() {
        return baNumber;
    }

    public void setBaNumber(String baNumber) {
        this.baNumber = baNumber;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public Set<OrderViewModel> getOrders() {
        return orders;
    }

    public void setOrders(Set<OrderViewModel> orders) {
        this.orders = orders;
    }
}
