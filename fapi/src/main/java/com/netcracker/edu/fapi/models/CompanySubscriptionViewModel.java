package com.netcracker.edu.fapi.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CompanySubscriptionViewModel {

    private long subId;
    private long companyId;
    private String subName;
    private String subUrl;
    private double subPrice;
    private String subInformation;

    public CompanySubscriptionViewModel() {

    }

    public CompanySubscriptionViewModel(long subId, long companyId,
                                        String subName, String subUrl,
                                        double subPrice, String subInformation) {
        this.subId = subId;
        this.companyId = companyId;
        this.subName = subName;
        this.subUrl = subUrl;
        this.subPrice = subPrice;
        this.subInformation = subInformation;
    }

    public long getSubId() {
        return subId;
    }

    public void setSubId(long subId) {
        this.subId = subId;
    }

    public long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(long companyId) {
        this.companyId = companyId;
    }

    public String getSubName() {
        return subName;
    }

    public void setSubName(String subName) {
        this.subName = subName;
    }

    public String getSubUrl() {
        return subUrl;
    }

    public void setSubUrl(String subUrl) {
        this.subUrl = subUrl;
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
}
