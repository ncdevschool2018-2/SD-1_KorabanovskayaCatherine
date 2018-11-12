package com.netcracker.edu.backend.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class Subscription {
    private Long subId;
    private String subName;
    private String subUrl;
    private String subInformation;
    private Double subPrice;
    private Integer subMinAmountDays;

    private Company company;
    private Category category;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sub_id", nullable = false)
    public Long getSubId() {
        return subId;
    }

    public void setSubId(Long subId) {
        this.subId = subId;
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
    public Double getSubPrice() {
        return subPrice;
    }

    public void setSubPrice(Double subPrice) {
        this.subPrice = subPrice;
    }

    @Basic
    @Column(name = "sub_min_amount_days", nullable = false)
    public Integer getSubMinAmountDays() {
        return subMinAmountDays;
    }

    public void setSubMinAmountDays(Integer subMinAmountDays) {
        this.subMinAmountDays = subMinAmountDays;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id", nullable = true)
    @JsonIgnore
    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "owner_id", nullable = false)
    @JsonIgnore
    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}
