package com.netcracker.edu.backend.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "billing-operation", schema = "eduproject")
public class BillingOperation {
    private Long operationId;
    private Date operationDate;
    private Time operationTime;
    private Double amountPayment;
    private String operationRecord;
    private BillingAccount billingAccount;

    public BillingOperation() {
    }

    public BillingOperation(Date operationDate, Time operationTime, Double amountPayment, String operationRecord, BillingAccount billingAccount) {
        this.operationDate = operationDate;
        this.operationTime = operationTime;
        this.amountPayment = amountPayment;
        this.operationRecord = operationRecord;
        this.billingAccount = billingAccount;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "operation_id", nullable = false)
    public Long getOperationId() {
        return operationId;
    }

    public void setOperationId(Long operationId) {
        this.operationId = operationId;
    }

    @Basic
    @Column(name = "operation_date", nullable = false)
    public Date getOperationDate() {
        return operationDate;
    }

    public void setOperationDate(Date operationDate) {
        this.operationDate = operationDate;
    }

    @Basic
    @Column(name = "operation_time", nullable = false)
    public Time getOperationTime() {
        return operationTime;
    }

    public void setOperationTime(Time operationTime) {
        this.operationTime = operationTime;
    }

    @Basic
    @Column(name = "amount_payment", nullable = false, precision = 0)
    public Double getAmountPayment() {
        return amountPayment;
    }

    public void setAmountPayment(Double amountPayment) {
        this.amountPayment = amountPayment;
    }

    @Basic
    @Column(name = "operation_record", nullable = false, length = 100)
    public String getOperationRecord() {
        return operationRecord;
    }

    public void setOperationRecord(String operationRecord) {
        this.operationRecord = operationRecord;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "billing_account_id", nullable = false)
    @JsonIgnore
    public BillingAccount getBillingAccount() {
        return billingAccount;
    }

    public void setBillingAccount(BillingAccount billingAccount) {
        this.billingAccount = billingAccount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BillingOperation that = (BillingOperation) o;
        return Objects.equals(operationId, that.operationId) &&
                Objects.equals(operationDate, that.operationDate) &&
                Objects.equals(operationTime, that.operationTime) &&
                Objects.equals(amountPayment, that.amountPayment) &&
                Objects.equals(operationRecord, that.operationRecord) &&
                Objects.equals(billingAccount, that.billingAccount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operationId, operationDate, operationTime, amountPayment, operationRecord, billingAccount);
    }

    @Override
    public String toString() {
        return "BillingOperation{" +
                "operationId=" + operationId +
                ", operationDate=" + operationDate +
                ", operationTime=" + operationTime +
                ", amountPayment=" + amountPayment +
                ", operationRecord='" + operationRecord + '\'' +
                ", billingAccount=" + billingAccount +
                '}';
    }
}
