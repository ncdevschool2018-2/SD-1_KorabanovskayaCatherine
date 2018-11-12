package com.netcracker.edu.backend.repository;

import com.netcracker.edu.backend.entity.BillingOperation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BillingOperationRepository extends CrudRepository<BillingOperation, Long> {

}
