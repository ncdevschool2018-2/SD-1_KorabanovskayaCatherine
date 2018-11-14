package com.netcracker.edu.fapi.service.impl;

import com.netcracker.edu.fapi.models.UserViewModel;
import com.netcracker.edu.fapi.service.UserDataService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class UserDataServiceImpl implements UserDataService {

    @Value("${backend.server.url}")
    private String backendServerUrl;

    @Override
    public List<UserViewModel> getAllUsers() {
        RestTemplate template = new RestTemplate();
        UserViewModel[] users = template.getForObject(
                backendServerUrl + "api/users",
                UserViewModel[].class
        );
        return users == null ? Collections.emptyList() : Arrays.asList(users);
    }

    @Override
    public UserViewModel getUser(Long id) {
        return null;
    }

    @Override
    public UserViewModel saveUser(UserViewModel user) {
        return new RestTemplate().postForEntity(
                backendServerUrl + "api/users",
                user,
                UserViewModel.class
        ).getBody();
    }

    @Override
    public void deleteUser(Long id) {
        RestTemplate template = new RestTemplate();
        template.delete(
                backendServerUrl + "api/users/" + id
        );
    }
}
