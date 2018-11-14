package com.netcracker.edu.fapi.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CompanyViewModel {

    private Long companyId;
    private String companyName;
    private String companyDomainName;

    public CompanyViewModel() {
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyDomainName() {
        return companyDomainName;
    }

    public void setCompanyDomainName(String companyDomainName) {
        this.companyDomainName = companyDomainName;
    }
}
