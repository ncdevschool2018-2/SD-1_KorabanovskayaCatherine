package com.netcracker.edu.backend.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "order", schema = "eduproject")
public class Order {
    private Long orderId;
    private String orderStatus;
    private Double orderPriceInDay;
    private Date orderStartDate;
    private Date orderEndDate;

    private Long subId;
    private Long billingAccountId;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id", nullable = false)
    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
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
    @Column(name = "order_price_in_day", nullable = false)
    public Double getOrderPriceInDay() {
        return orderPriceInDay;
    }

    public void setOrderPriceInDay(Double orderPriceInDay) {
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

    @Basic
    @Column(name = "sub_id", nullable = false)
    public Long getSubId() {
        return subId;
    }

    public void setSubId(Long subId) {
        this.subId = subId;
    }

    @Basic
    @Column(name = "billing_account_id", nullable = false)
    public Long getBillingAccountId() {
        return billingAccountId;
    }

    public void setBillingAccountId(Long billingAccountId) {
        this.billingAccountId = billingAccountId;
    }
}
