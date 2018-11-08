package com.netcracker.edu.backend.entity;

import javax.persistence.*;

@Entity
@Table(name = "billing-account", schema = "eduproject")
public class BillingAccount {
    private long baId;
    private long baNumber;
    private double baAccount;
    private double baMaxDebt;
    private long userId;

    @Id
    @Column(name = "ba_id", nullable = false)
    public long getBaId() {
        return baId;
    }

    public void setBaId(long baId) {
        this.baId = baId;
    }

    @Basic
    @Column(name = "ba_number", nullable = false)
    public long getBaNumber() {
        return baNumber;
    }

    public void setBaNumber(long baNumber) {
        this.baNumber = baNumber;
    }

    @Basic
    @Column(name = "ba_account", nullable = false, precision = 0)
    public double getBaAccount() {
        return baAccount;
    }

    public void setBaAccount(double baAccount) {
        this.baAccount = baAccount;
    }

    @Basic
    @Column(name = "ba_max_debt", nullable = false, precision = 0)
    public double getBaMaxDebt() {
        return baMaxDebt;
    }

    public void setBaMaxDebt(double baMaxDebt) {
        this.baMaxDebt = baMaxDebt;
    }

    @Basic
    @Column(name = "user_id", nullable = false)
    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

}
