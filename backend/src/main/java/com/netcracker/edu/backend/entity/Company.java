package com.netcracker.edu.backend.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "company", schema = "eduproject")
public class Company {
    private Long companyId;
    private String companyName;
    private String companyDomainName;
    private Integer maxAmountAvailableSubs;

    public Company() {
    }

    public Company(String companyName, String companyDomainName) {
        this.companyName = companyName;
        this.companyDomainName = companyDomainName;
    }

    public Company(String companyName, String companyDomainName, Integer maxAmountAvailableSubs) {
        this.companyName = companyName;
        this.companyDomainName = companyDomainName;
        this.maxAmountAvailableSubs = maxAmountAvailableSubs;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "company_id", nullable = false)
    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
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
    public Integer getMaxAmountAvailableSubs() {
        return maxAmountAvailableSubs;
    }

    public void setMaxAmountAvailableSubs(Integer maxAmountAvailableSubs) {
        this.maxAmountAvailableSubs = maxAmountAvailableSubs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return Objects.equals(companyId, company.companyId) &&
                Objects.equals(companyName, company.companyName) &&
                Objects.equals(companyDomainName, company.companyDomainName) &&
                Objects.equals(maxAmountAvailableSubs, company.maxAmountAvailableSubs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(companyId, companyName, companyDomainName, maxAmountAvailableSubs);
    }

    @Override
    public String toString() {
        return "Company{" +
                "companyId=" + companyId +
                ", companyName='" + companyName + '\'' +
                ", companyDomainName='" + companyDomainName + '\'' +
                ", maxAmountAvailableSubs=" + maxAmountAvailableSubs +
                '}';
    }
}
