package com.netcracker.edu.backend.service.impl;

import com.netcracker.edu.backend.entity.UserData;
import com.netcracker.edu.backend.repository.UserDataRepository;
import com.netcracker.edu.backend.service.UserDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class UserDataServiceImpl implements UserDataService {

    private UserDataRepository repository;

    @Autowired
    public UserDataServiceImpl(UserDataRepository repository) {
        this.repository = repository;
    }

    @Override
    public Iterable<UserData> getAllUsersData() {
        return repository.findAll();
    }

    @Override
    public Optional<UserData> getUserData(Long id) {
        return repository.findById(id);
    }

    @Override
    public UserData saveUserData(UserData userData) {
        return repository.save(userData);
    }

    @Override
    public void deleteUserData(Long id) {
        repository.deleteById(id);
    }
}
