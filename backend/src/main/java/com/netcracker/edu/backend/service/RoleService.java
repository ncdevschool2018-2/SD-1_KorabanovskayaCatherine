package com.netcracker.edu.backend.service;


import com.netcracker.edu.backend.entity.Role;

import java.util.Optional;

public interface RoleService {

    Iterable<Role> getAllRoles();
    Optional<Role> getRoleById(Integer id);
    Role saveRole(Role role);
    void deleteRoleById(Integer id);

    Iterable<String> getAllRoleNames();
    String getRoleNameById(Integer id);
}
