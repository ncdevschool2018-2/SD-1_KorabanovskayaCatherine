package com.netcracker.edu.backend.service.impl;

import com.netcracker.edu.backend.entity.Role;
import com.netcracker.edu.backend.repository.RoleRepository;
import com.netcracker.edu.backend.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class RoleServiceImpl implements RoleService {

    private RoleRepository repository;

    @Autowired
    public RoleServiceImpl(RoleRepository repository) {
        this.repository = repository;
    }

    @Override
    public Iterable<Role> getAllRoles() {
        return repository.findAll();
    }

    @Override
    public Optional<Role> getRoleById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public Role saveRole(Role role) {
        return repository.save(role);
    }

    @Override
    public void deleteRoleById(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public Iterable<String> getAllRoleNames() {
        return repository.findAllRoleNames();
    }

    @Override
    public String getRoleNameById(Integer id) {
        return repository.findRoleNameById(id);
    }
}
