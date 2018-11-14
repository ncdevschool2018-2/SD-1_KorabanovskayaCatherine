package com.netcracker.edu.backend.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "sub_order", schema = "eduproject")
public class Order {

    private Long orderId;
    private String orderStatus;
    private Double orderPriceInDay;
    private Date orderStartDate;
    private Integer amountDays;
    private Subscription subscription;
    private BillingAccount billingAccount;

    public Order() {
    }

    public Order(String orderStatus, Double orderPriceInDay, Date orderStartDate, Integer amountDays, Subscription subscription, BillingAccount billingAccount) {
        this.orderStatus = orderStatus;
        this.orderPriceInDay = orderPriceInDay;
        this.orderStartDate = orderStartDate;
        this.amountDays = amountDays;
        this.subscription = subscription;
        this.billingAccount = billingAccount;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id", nullable = false)
    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    @Column(name = "order_status", nullable = false, length = 45)
    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    @Column(name = "order_price_in_day", nullable = false)
    public Double getOrderPriceInDay() {
        return orderPriceInDay;
    }

    public void setOrderPriceInDay(Double orderPriceInDay) {
        this.orderPriceInDay = orderPriceInDay;
    }

    @Column(name = "order_start_date", nullable = false)
    public Date getOrderStartDate() {
        return orderStartDate;
    }

    public void setOrderStartDate(Date orderStartDate) {
        this.orderStartDate = orderStartDate;
    }

    @Column(name = "amount_days", nullable = false)
    public Integer getAmountDays() {
        return amountDays;
    }

    public void setAmountDays(Integer amountDays) {
        this.amountDays = amountDays;
    }

    @ManyToOne
    @JoinColumn(name = "sub_id", nullable = false)
    public Subscription getSubscription() {
        return subscription;
    }

    public void setSubscription(Subscription subscription) {
        this.subscription = subscription;
    }

    @ManyToOne
    @JoinColumn(name = "billing_account_id", nullable = false)
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
        Order order = (Order) o;
        return Objects.equals(orderId, order.orderId) &&
                Objects.equals(orderStatus, order.orderStatus) &&
                Objects.equals(orderPriceInDay, order.orderPriceInDay) &&
                Objects.equals(orderStartDate, order.orderStartDate) &&
                Objects.equals(amountDays, order.amountDays) &&
                Objects.equals(subscription, order.subscription) &&
                Objects.equals(billingAccount, order.billingAccount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, orderStatus, orderPriceInDay, orderStartDate, amountDays, subscription, billingAccount);
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", orderStatus='" + orderStatus + '\'' +
                ", orderPriceInDay=" + orderPriceInDay +
                ", orderStartDate=" + orderStartDate +
                ", amountDays=" + amountDays +
                ", subscriptionId=" + subscription.getSubId() +
                ", billingAccountId=" + billingAccount.getBaId() +
                '}';
    }
}
