package com.netcracker.edu.backend.service;

import com.netcracker.edu.backend.entity.Company;

import java.util.Optional;

public interface CompanyService {

    Iterable<Company> getAllCompanies();
    Optional<Company> getCompanyById(Long id);
    Company saveCompany(Company company);
    void deleteCompanyById(Long id);
}
