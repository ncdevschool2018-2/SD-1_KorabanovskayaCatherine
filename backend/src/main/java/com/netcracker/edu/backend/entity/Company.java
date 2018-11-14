package com.netcracker.edu.backend.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "company", schema = "eduproject")
public class Company {

    private Long companyId;
    private String companyName;
    private String companyDomainName;

    public Company() {
    }

    public Company(String companyName, String companyDomainName) {
        this.companyName = companyName;
        this.companyDomainName = companyDomainName;
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

    @Column(name = "company_name", nullable = false, length = 45)
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Column(name = "company_domain_name", nullable = false, length = 60)
    public String getCompanyDomainName() {
        return companyDomainName;
    }

    public void setCompanyDomainName(String companyDomainName) {
        this.companyDomainName = companyDomainName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return Objects.equals(companyId, company.companyId) &&
                Objects.equals(companyName, company.companyName) &&
                Objects.equals(companyDomainName, company.companyDomainName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(companyId, companyName, companyDomainName);
    }

    @Override
    public String toString() {
        return "Company{" +
                "companyId=" + companyId +
                ", companyName='" + companyName + '\'' +
                ", companyDomainName='" + companyDomainName + '\'' +
                '}';
    }
}
