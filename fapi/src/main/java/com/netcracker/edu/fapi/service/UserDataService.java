package com.netcracker.edu.fapi.service;

import com.netcracker.edu.fapi.models.UserViewModel;

import java.util.List;

public interface UserDataService {
    List<UserViewModel> getAllUsers();

    UserViewModel getUser(Long id);

    UserViewModel saveUser(UserViewModel user);

    void deleteUser(Long id);

}
