package com.netcracker.edu.backend.entity;


import javax.persistence.*;
import java.util.Objects;


@Entity
@Table(name = "subscriptions")
public class CompanySubscription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long subId;
    private long companyId;
    private String subName;
    private String subUrl;
    private String subInformation;
    private double subPrice;

    public CompanySubscription(String subName, double subPrice, String subInformation, String subUrl, long companyId) {
        this.subName = subName;
        this.subPrice = subPrice;
        this.subInformation = subInformation;
        this.subUrl = subUrl;
        this.companyId = companyId;
    }


    public CompanySubscription() {

    }


    public long getSubId() {
        return subId;
    }

    public void setSubId(long subId) {
        this.subId = subId;
    }

    public String getSubName() {
        return subName;
    }

    public void setSubName(String subName) {
        this.subName = subName;
    }

    public double getSubPrice() {
        return subPrice;
    }

    public void setSubPrice(double subPrice) {
        this.subPrice = subPrice;
    }

    public String getSubInformation() {
        return subInformation;
    }

    public void setSubInformation(String subInformation) {
        this.subInformation = subInformation;
    }

    public String getSubUrl() {
        return subUrl;
    }

    public void setSubUrl(String subUrl) {
        this.subUrl = subUrl;
    }

    public long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(long companyId) {
        this.companyId = companyId;
    }

    @Override
    public String toString() {
        return "CompanySubscription{" +
                "subId=" + subId +
                ", subName='" + subName + '\'' +
                ", subPrice=" + subPrice +
                ", subInformation='" + subInformation + '\'' +
                ", subUrl='" + subUrl + '\'' +
                ", companyId=" + companyId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CompanySubscription that = (CompanySubscription) o;
        return subId == that.subId &&
                Double.compare(that.subPrice, subPrice) == 0 &&
                companyId == that.companyId &&
                Objects.equals(subName, that.subName) &&
                Objects.equals(subInformation, that.subInformation) &&
                Objects.equals(subUrl, that.subUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subId, subName, subPrice, subInformation, subUrl, companyId);
    }
}
