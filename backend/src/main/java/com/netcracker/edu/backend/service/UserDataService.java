package com.netcracker.edu.backend.service;

import com.netcracker.edu.backend.entity.UserData;

import java.util.Optional;

public interface UserDataService {

    Iterable<UserData> getAllUsersData();
    Optional<UserData> getUserData(Long id);
    UserData saveUserData(UserData userData);
    void deleteUserData(Long id);
}
