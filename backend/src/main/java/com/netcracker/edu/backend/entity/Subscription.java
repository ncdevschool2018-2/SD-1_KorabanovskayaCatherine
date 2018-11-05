package com.netcracker.edu.backend.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Subscriptions {
    private long subId;
    private String subName;
    private String subUrl;
    private String subInformation;
    private double subPrice;
    private Integer subMinAmountDays;

    @Id
    @Column(name = "sub_id")
    public long getSubId() {
        return subId;
    }

    public void setSubId(long subId) {
        this.subId = subId;
    }

    @Basic
    @Column(name = "sub_name")
    public String getSubName() {
        return subName;
    }

    public void setSubName(String subName) {
        this.subName = subName;
    }

    @Basic
    @Column(name = "sub_url")
    public String getSubUrl() {
        return subUrl;
    }

    public void setSubUrl(String subUrl) {
        this.subUrl = subUrl;
    }

    @Basic
    @Column(name = "sub_information")
    public String getSubInformation() {
        return subInformation;
    }

    public void setSubInformation(String subInformation) {
        this.subInformation = subInformation;
    }

    @Basic
    @Column(name = "sub_price")
    public double getSubPrice() {
        return subPrice;
    }

    public void setSubPrice(double subPrice) {
        this.subPrice = subPrice;
    }

    @Basic
    @Column(name = "sub_min_amount_days")
    public Integer getSubMinAmountDays() {
        return subMinAmountDays;
    }

    public void setSubMinAmountDays(Integer subMinAmountDays) {
        this.subMinAmountDays = subMinAmountDays;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Subscriptions that = (Subscriptions) o;

        if (subId != that.subId) return false;
        if (Double.compare(that.subPrice, subPrice) != 0) return false;
        if (subName != null ? !subName.equals(that.subName) : that.subName != null) return false;
        if (subUrl != null ? !subUrl.equals(that.subUrl) : that.subUrl != null) return false;
        if (subInformation != null ? !subInformation.equals(that.subInformation) : that.subInformation != null)
            return false;
        if (subMinAmountDays != null ? !subMinAmountDays.equals(that.subMinAmountDays) : that.subMinAmountDays != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = (int) (subId ^ (subId >>> 32));
        result = 31 * result + (subName != null ? subName.hashCode() : 0);
        result = 31 * result + (subUrl != null ? subUrl.hashCode() : 0);
        result = 31 * result + (subInformation != null ? subInformation.hashCode() : 0);
        temp = Double.doubleToLongBits(subPrice);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (subMinAmountDays != null ? subMinAmountDays.hashCode() : 0);
        return result;
    }
}
