package com.netcracker.edu.backend.repository;

import com.netcracker.edu.backend.entity.Role;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends CrudRepository<Role, Integer> {

    @Query("SELECT r.roleName FROM Role r WHERE r.roleId = ?1")
    String findRoleNameById(Integer id);

    @Query("SELECT r.roleName FROM Role r")
    Iterable<String> findAllRoleNames();
}
