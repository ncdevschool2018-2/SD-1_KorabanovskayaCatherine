package com.netcracker.edu.backend.entity;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;

@Entity
@Table(name = "billing-operation", schema = "eduproject")
public class BillingOperation {
    private long operationId;
    private long billingAccountId;
    private Date operationDate;
    private Time operationTime;
    private double amountPayment;
    private String operationRecord;

    @Id
    @Column(name = "operation_id", nullable = false)
    public long getOperationId() {
        return operationId;
    }

    public void setOperationId(long operationId) {
        this.operationId = operationId;
    }

    @Basic
    @Column(name = "billing_account_id", nullable = false)
    public long getBillingAccountId() {
        return billingAccountId;
    }

    public void setBillingAccountId(long billingAccountId) {
        this.billingAccountId = billingAccountId;
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
    public double getAmountPayment() {
        return amountPayment;
    }

    public void setAmountPayment(double amountPayment) {
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

}
