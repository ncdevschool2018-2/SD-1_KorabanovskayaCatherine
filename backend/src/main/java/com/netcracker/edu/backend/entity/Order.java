package com.netcracker.edu.backend.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class Order {
    private long orderId;
    private long billingAccountId;
    private long subId;
    private String orderStatus;
    private double orderPriceInDay;
    private Date orderStartDate;
    private Date orderEndDate;

    @Id
    @Column(name = "order_id", nullable = false)
    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
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
    @Column(name = "sub_id", nullable = false)
    public long getSubId() {
        return subId;
    }

    public void setSubId(long subId) {
        this.subId = subId;
    }

    @Basic
    @Column(name = "order_status", nullable = false, length = 45)
    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    @Basic
    @Column(name = "order_price_in_day", nullable = false, precision = 0)
    public double getOrderPriceInDay() {
        return orderPriceInDay;
    }

    public void setOrderPriceInDay(double orderPriceInDay) {
        this.orderPriceInDay = orderPriceInDay;
    }

    @Basic
    @Column(name = "order_start_date", nullable = false)
    public Date getOrderStartDate() {
        return orderStartDate;
    }

    public void setOrderStartDate(Date orderStartDate) {
        this.orderStartDate = orderStartDate;
    }

    @Basic
    @Column(name = "order_end_date", nullable = false)
    public Date getOrderEndDate() {
        return orderEndDate;
    }

    public void setOrderEndDate(Date orderEndDate) {
        this.orderEndDate = orderEndDate;
    }

}
