package com.netcracker.edu.backend.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "billing_account", schema = "eduproject")
public class BillingAccount {

    private Long baId;
    private String baNumber;
    private Double baAccount;
    private Double baMaxDebt;
    private Long accountId;

    public BillingAccount() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ba_id", nullable = false)
    public Long getBaId() {
        return baId;
    }

    public void setBaId(Long baId) {
        this.baId = baId;
    }

    @Column(name = "ba_number", nullable = false, length = 45)
    public String getBaNumber() {
        return baNumber;
    }

    public void setBaNumber(String baNumber) {
        this.baNumber = baNumber;
    }

    @Column(name = "ba_account", nullable = false, precision = 0)
    public Double getBaAccount() {
        return baAccount;
    }

    public void setBaAccount(Double baAccount) {
        this.baAccount = baAccount;
    }

    @Column(name = "ba_max_debt", nullable = false, precision = 0)
    public Double getBaMaxDebt() {
        return baMaxDebt;
    }

    public void setBaMaxDebt(Double baMaxDebt) {
        this.baMaxDebt = baMaxDebt;
    }

    @Column(name = "account_id", nullable = false)
    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long userId) {
        this.accountId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BillingAccount that = (BillingAccount) o;
        return Objects.equals(baId, that.baId) &&
                Objects.equals(baNumber, that.baNumber) &&
                Objects.equals(baAccount, that.baAccount) &&
                Objects.equals(baMaxDebt, that.baMaxDebt) &&
                Objects.equals(accountId, that.accountId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(baId, baNumber, baAccount, baMaxDebt, accountId);
    }

    @Override
    public String toString() {
        return "BillingAccount{" +
                "baId=" + baId +
                ", baNumber=" + "********" + baNumber.substring(baNumber.length() - 4) +
                ", baAccount=" + baAccount +
                ", baMaxDebt=" + baMaxDebt +
                ", userId=" + accountId +
                '}';
    }
}

