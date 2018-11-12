package com.netcracker.edu.backend.controller;


import com.netcracker.edu.backend.entity.Role;
import com.netcracker.edu.backend.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("api/roles")
public class RoleController {

    private RoleService service;

    @Autowired
    public RoleController(RoleService service) {
        this.service = service;
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public Iterable<Role> getAllRoles() {
        return service.getAllRoles();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Role> getRole(@PathVariable(name = "id") Integer id) {
        Optional<Role> role = service.getRoleById(id);

        if(role.isPresent()) {
            return ResponseEntity.ok(role.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @RequestMapping(method = RequestMethod.POST)
    public Role saveRole(@RequestBody Role role) {
        return service.saveRole(role);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.POST)
    public ResponseEntity deleteRole(@PathVariable(name = "id") Integer id) {
        service.deleteRoleById(id);
        return ResponseEntity.noContent().build();
    }

    @RequestMapping(value = "/name", method = RequestMethod.GET)
    public Iterable<String> getAllRoleNames() {
        return service.getAllRoleNames();
    }

    @RequestMapping(value = "/name/{id}", method = RequestMethod.GET)
    public String getRoleName(@PathVariable(name = "id") Integer id) {
        return service.getRoleNameById(id);
    }

}
