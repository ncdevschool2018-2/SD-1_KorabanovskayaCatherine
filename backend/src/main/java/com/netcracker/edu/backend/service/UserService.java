package com.netcracker.edu.backend.service;


import com.netcracker.edu.backend.entity.User;

import java.util.Optional;

public interface UserService {

    Iterable<User> getAllUsers();
    Optional<User> getUserById(Long id);
    User saveUser(User user);
    void deleteUserById(Long id);

}
