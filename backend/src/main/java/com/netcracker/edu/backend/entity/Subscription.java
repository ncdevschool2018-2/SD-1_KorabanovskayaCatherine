package com.netcracker.edu.backend.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "subscription", schema = "eduproject")
public class Subscription {

    private Long subId;
    private String subName;
    private Double subPrice;
    private Integer subMinAmountDays;
    private String subUrl;
    private String subInformation;
    private Company company;

    public Subscription() {

    }

    public Subscription(String subName, Double subPrice, Integer subMinAmountDays, Company company) {
        this.subName = subName;
        this.subPrice = subPrice;
        this.subMinAmountDays = subMinAmountDays;
        this.company = company;
    }

    public Subscription(String subName, Double subPrice, Integer subMinAmountDays, String subUrl, String subInformation, Company company) {
        this.subName = subName;
        this.subPrice = subPrice;
        this.subMinAmountDays = subMinAmountDays;
        this.subUrl = subUrl;
        this.subInformation = subInformation;
        this.company = company;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sub_id", nullable = false)
    public Long getSubId() {
        return subId;
    }

    public void setSubId(Long subId) {
        this.subId = subId;
    }

    @Column(name = "sub_name", nullable = false, length = 45)
    public String getSubName() {
        return subName;
    }

    public void setSubName(String subName) {
        this.subName = subName;
    }

    @Column(name = "sub_price", nullable = false, precision = 0)
    public Double getSubPrice() {
        return subPrice;
    }

    public void setSubPrice(Double subPrice) {
        this.subPrice = subPrice;
    }

    @Column(name = "sub_min_amount_days", nullable = false)
    public Integer getSubMinAmountDays() {
        return subMinAmountDays;
    }

    public void setSubMinAmountDays(Integer subMinAmountDays) {
        this.subMinAmountDays = subMinAmountDays;
    }

    @Column(name = "sub_url", nullable = true, length = 60)
    public String getSubUrl() {
        return subUrl;
    }

    public void setSubUrl(String subUrl) {
        this.subUrl = subUrl;
    }

    @Column(name = "sub_information", nullable = true, length = 100)
    public String getSubInformation() {
        return subInformation;
    }

    public void setSubInformation(String subInformation) {
        this.subInformation = subInformation;
    }

    @ManyToOne
    @JoinColumn(name = "owner_id", nullable = false)
    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Subscription that = (Subscription) o;
        return Objects.equals(subId, that.subId) &&
                Objects.equals(subName, that.subName) &&
                Objects.equals(subPrice, that.subPrice) &&
                Objects.equals(subMinAmountDays, that.subMinAmountDays) &&
                Objects.equals(subUrl, that.subUrl) &&
                Objects.equals(subInformation, that.subInformation) &&
                Objects.equals(company, that.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subId, subName, subPrice, subMinAmountDays, subUrl, subInformation, company);
    }

    @Override
    public String toString() {
        return "Subscription{" +
                "subId=" + subId +
                ", subName='" + subName + '\'' +
                ", subPrice=" + subPrice +
                ", subMinAmountDays=" + subMinAmountDays +
                ", subUrl='" + subUrl + '\'' +
                ", subInformation='" + subInformation + '\'' +
                ", companyId=" + company.getCompanyId() +
                '}';
    }
}
