package com.netcracker.edu.backend.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Subscription {
    private long subId;
    private long ownerId;
    private String subName;
    private String subUrl;
    private String subInformation;
    private double subPrice;
    private int subMinAmountDays;
    private Integer categoryId;

    @Id
    @Column(name = "sub_id", nullable = false)
    public long getSubId() {
        return subId;
    }

    public void setSubId(long subId) {
        this.subId = subId;
    }

    @Basic
    @Column(name = "owner_id", nullable = false)
    public long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(long ownerId) {
        this.ownerId = ownerId;
    }

    @Basic
    @Column(name = "sub_name", nullable = false, length = 45)
    public String getSubName() {
        return subName;
    }

    public void setSubName(String subName) {
        this.subName = subName;
    }

    @Basic
    @Column(name = "sub_url", nullable = true, length = 60)
    public String getSubUrl() {
        return subUrl;
    }

    public void setSubUrl(String subUrl) {
        this.subUrl = subUrl;
    }

    @Basic
    @Column(name = "sub_information", nullable = true, length = 100)
    public String getSubInformation() {
        return subInformation;
    }

    public void setSubInformation(String subInformation) {
        this.subInformation = subInformation;
    }

    @Basic
    @Column(name = "sub_price", nullable = false, precision = 0)
    public double getSubPrice() {
        return subPrice;
    }

    public void setSubPrice(double subPrice) {
        this.subPrice = subPrice;
    }

    @Basic
    @Column(name = "sub_min_amount_days", nullable = false)
    public int getSubMinAmountDays() {
        return subMinAmountDays;
    }

    public void setSubMinAmountDays(int subMinAmountDays) {
        this.subMinAmountDays = subMinAmountDays;
    }

    @Basic
    @Column(name = "category_id", nullable = true)
    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }
}
