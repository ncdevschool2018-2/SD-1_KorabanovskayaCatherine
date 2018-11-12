package com.netcracker.edu.backend.controller;

import com.netcracker.edu.backend.entity.UserData;
import com.netcracker.edu.backend.service.UserDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("api/users-data")
public class UserDataController {

    private UserDataService service;

    @Autowired
    public UserDataController(UserDataService service) {
        this.service = service;
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public Iterable<UserData> getUsersData() {
        return service.getAllUsersData();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<UserData> getUserData(@PathVariable(name = "id") Long id) {
        Optional<UserData> userData = service.getUserData(id);

        if(userData.isPresent()) {
            return ResponseEntity.ok(userData.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @RequestMapping(method = RequestMethod.POST)
    public UserData saveUserDate(@RequestBody UserData userData) {
        return service.saveUserData(userData);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity deleteUserData(@PathVariable(name = "id") Long id) {
        service.deleteUserData(id);
        return ResponseEntity.noContent().build();
    }
}
