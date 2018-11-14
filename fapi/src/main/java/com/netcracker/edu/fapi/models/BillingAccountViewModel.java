package com.netcracker.edu.fapi.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BillingAccountViewModel {

    private Long baId;
    private String baNumber;
    private Double baAccount;
    private Double baMaxDebt;
    private UserViewModel user;

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

    public Double getBaAccount() {
        return baAccount;
    }

    public void setBaAccount(Double baAccount) {
        this.baAccount = baAccount;
    }

    public Double getBaMaxDebt() {
        return baMaxDebt;
    }

    public void setBaMaxDebt(Double baMaxDebt) {
        this.baMaxDebt = baMaxDebt;
    }

    public UserViewModel getUser() {
        return user;
    }

    public void setUser(UserViewModel user) {
        this.user = user;
    }
}
