package com.netcracker.edu.backend.repository;

import com.netcracker.edu.backend.entity.CompanySubscription;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanySubscriptionRepository extends CrudRepository<CompanySubscription, Long> {

}
