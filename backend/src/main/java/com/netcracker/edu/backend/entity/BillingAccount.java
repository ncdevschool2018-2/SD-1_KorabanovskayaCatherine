package com.netcracker.edu.backend.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "billing-account", schema = "eduproject")
public class BillingAccount {
    private Long baId;
    private Long baNumber;
    private Double baAccount;
    private Double baMaxDebt;
//    private User user;
    private Long userId;

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

    @Basic
    @Column(name = "ba_number", nullable = false)
    public Long getBaNumber() {
        return baNumber;
    }

    public void setBaNumber(Long baNumber) {
        this.baNumber = baNumber;
    }

    @Basic
    @Column(name = "ba_account", nullable = false, precision = 0)
    public Double getBaAccount() {
        return baAccount;
    }

    public void setBaAccount(Double baAccount) {
        this.baAccount = baAccount;
    }

    @Basic
    @Column(name = "ba_max_debt", nullable = false, precision = 0)
    public Double getBaMaxDebt() {
        return baMaxDebt;
    }

    public void setBaMaxDebt(Double baMaxDebt) {
        this.baMaxDebt = baMaxDebt;
    }

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "user_id", nullable = false)
//    @JsonIgnore
//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }


    @Basic
    @Column(name = "user_id", nullable = false)
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BillingAccount that = (BillingAccount) o;
        return Objects.equals(baId, that.baId) &&
                Objects.equals(baNumber, that.baNumber) &&
                Objects.equals(baAccount, that.baAccount) &&
                Objects.equals(baMaxDebt, that.baMaxDebt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(baId, baNumber, baAccount, baMaxDebt);
    }
}
    //TODO: toString() показывающий неполный номер
