package com.netcracker.edu.backend.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Company {
    private long companyId;
    private String companyName;
    private String companyDomainName;
    private int maxAmountAvailableSubs;

    @Id
    @Column(name = "company_id", nullable = false)
    public long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(long companyId) {
        this.companyId = companyId;
    }

    @Basic
    @Column(name = "company_name", nullable = false, length = 45)
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Basic
    @Column(name = "company_domain_name", nullable = false, length = 60)
    public String getCompanyDomainName() {
        return companyDomainName;
    }

    public void setCompanyDomainName(String companyDomainName) {
        this.companyDomainName = companyDomainName;
    }

    @Basic
    @Column(name = "max_amount_available_subs", nullable = false)
    public int getMaxAmountAvailableSubs() {
        return maxAmountAvailableSubs;
    }

    public void setMaxAmountAvailableSubs(int maxAmountAvailableSubs) {
        this.maxAmountAvailableSubs = maxAmountAvailableSubs;
    }
}
